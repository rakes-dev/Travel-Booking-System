package mainpack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Random;
//import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.OraclePreparedStatement;
//import oracle.jdbc.OracleResultSet;


public class payment extends HttpServlet {

    String vname,vemail,vaddress,vcity,vstate,pinCode,cardName,cardNo,paymentId;
    
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
            vname = request.getParameter("name");
            vemail = request.getParameter("email");
            vaddress = request.getParameter("address");
            vcity = request.getParameter("city");
            vstate = request.getParameter("state");
            pinCode = request.getParameter("pincode");
            cardName = request.getParameter("cardname");
            cardNo = request.getParameter("cardno");
            paymentId = String.valueOf(randomNumber);
            out.println(paymentId+vname+vemail+vaddress+vcity+vstate+pinCode+cardName+cardNo);
            try {
                DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
                oconn = (OracleConnection)DriverManager.getConnection("jdbc:oracle:thin:@Rakesh:1521:orcl","RAKES","TRAVEL");
                ost =(OraclePreparedStatement) oconn.prepareCall("INSERT INTO PAYMENT(NAME,ADDRESS,CITY,STATE,PIN_CODE,CARD_NAME,CARD_NUMBER,PAYMENT_ID,EMAIL)VALUES(?,?,?,?,?,?,?,?,?)");
                
                ost.setString(1, vname);
                ost.setString(2, vaddress);
                ost.setString(3, vcity);
                ost.setString(4, vstate);
                ost.setString(5, pinCode);
                ost.setString(6, cardName);
                ost.setString(7, cardNo);
                ost.setString(8, paymentId);
                ost.setString(9, vemail);
            
                int x = ost.executeUpdate();
                if(x>0){
                    response.sendRedirect("http://localhost:11756/Travel_Booking_System/STATIC-PAGES/paymentSuccess.html");
                }else{
                    out.println("Something Went Wrong!!!");
                }
                ost.close();
                oconn.close();
            } catch (SQLException ex) {
                Logger.getLogger(booking.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            }else{
                    out.println("Something Went Wrong!!!");
                }
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
