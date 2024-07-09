package mainpack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;


public class booking extends HttpServlet {

    String bookingId,bookingDate,price,vEmail,packageId;
    
     OracleConnection oconn;
     OraclePreparedStatement ost;
//     OracleResultSet ors = null;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet booking</title>");            
            out.println("</head>");
            out.println("<body>");
            Random random = new Random();
            int randomNumber = random.nextInt(100000);
            
            HttpSession sess = request.getSession(false);
            if(sess!=null){
            price = request.getParameter("packagePrice");
            bookingDate = request.getParameter("arrivalDate");
            packageId = request.getParameter("pkgId");
            vEmail = sess.getAttribute("EMAIL").toString();
            bookingId = String.valueOf(randomNumber);
            sess.setAttribute("packagePrice",price);
            
            
            try {
                DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
                oconn = (OracleConnection)DriverManager.getConnection("jdbc:oracle:thin:@Rakesh:1521:orcl","RAKES","TRAVEL");
                ost =(OraclePreparedStatement) oconn.prepareCall("INSERT INTO BOOKING(BOOKING_ID,EMAIL,PACKAGE_ID,BOOKING_DATE,PRICE)VALUES(?,?,?,?,?)");
                
                SimpleDateFormat sdfj = new SimpleDateFormat("yyyy-MM-dd");
                Date dt = sdfj.parse(bookingDate);
                SimpleDateFormat sdfo = new SimpleDateFormat("dd-MMM-yyyy");
                bookingDate= sdfo.format(dt);
                
                ost.setString(1, bookingId);
                ost.setString(2, vEmail);
                ost.setString(3, packageId);
                ost.setString(4, bookingDate);
                ost.setString(5, price);
            
                int x = ost.executeUpdate();
                if(x>0){
                    response.sendRedirect("http://localhost:11756/Travel_Booking_System/SERVER-PAGES/payment.jsp");
                }else{
                    out.println("Something Went Wrong!!!");
                }
                ost.close();
                oconn.close();
            } catch (SQLException | ParseException ex) {
                Logger.getLogger(booking.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            }else{
                    out.println("Something Went Wrong!!!");
                }
            out.println("<h1>"+vEmail+ "  "+bookingId+bookingDate+packageId+price+"</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
