package mainpack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;


public class RegistrationServlet extends HttpServlet {
    
String firstName,lastName,birthDate,gender,email,password;

OracleConnection oconn;
OraclePreparedStatement ops;
OracleResultSet ors = null;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegistrationServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegistrationServlet at " + request.getContextPath() + "</h1>");
          
            firstName = request.getParameter("first_name");
            lastName = request.getParameter("last_name");
            birthDate = request.getParameter("birthdate");
            gender = request.getParameter("gender");
            email = request.getParameter("email");
            password = request.getParameter("password");
            
            out.println("<h2>Name: "+firstName+lastName + "</h2>");
            out.println("<h2>DOB: "+birthDate+"</h2>"); 
            out.println("<h2>GENDER: "+gender+ "</h2>");
            out.println("<h2>EMAIL: "+email + "</h2>"); 
            out.println("<h2>PASSWORD: "+password+"</h2>");
            
            try {
                    DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
                    oconn = (OracleConnection)DriverManager.getConnection("jdbc:oracle:thin:@Rakesh:1521:orcl","RAKES","TRAVEL");
                    ops =(OraclePreparedStatement) oconn.prepareStatement("SELECT * FROM USERS where EMAIL=? ");
                    ops.setString(1, email);
                    ors = (OracleResultSet) ops.executeQuery();
          if(ors.next())
          {
                response.sendRedirect("http://localhost:11756/Travel_Booking_System/STATIC-PAGES/ExistingEmail.html");
          }else{
              oconn = (OracleConnection)DriverManager.getConnection("jdbc:oracle:thin:@Rakesh:1521:orcl","RAKES","TRAVEL");
              ops = (OraclePreparedStatement)oconn.prepareCall("INSERT INTO USERS(EMAIL,FIRST_NAME,LAST_NAME,BIRTHDATE,GENDER,PASSWORD) VALUES(?,?,?,?,?,?)");
                
                SimpleDateFormat sdfj = new SimpleDateFormat("yyyy-MM-dd");
                Date dt = sdfj.parse(birthDate);
                SimpleDateFormat sdfo = new SimpleDateFormat("dd-MMM-yyyy");
                birthDate= sdfo.format(dt);
            
                ops.setString(1, email);
                ops.setString(2, firstName);
                ops.setString(3, lastName);
                ops.setString(4, birthDate);
                ops.setString(5, gender);
                ops.setString(6, password);
            
    
                 int x=ops.executeUpdate();
                 response.sendRedirect("http://localhost:11756/Travel_Booking_System/STATIC-PAGES/RegistrationSuccess.html");
          }   
                ops.close();
                oconn.close();
            } catch (SQLException | ParseException ex) {
                Logger.getLogger(RegistrationServlet.class.getName()).log(Level.SEVERE, null, ex);
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
