package mainpack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

public class ValidateEmail extends HttpServlet {
          OracleConnection oconn;
          OraclePreparedStatement ost;
          OracleResultSet ors = null;
          String vemail, vname;
          String vto, vfrom, vcc, vbcc, vsubject, vbody;


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ValidateEmail</title>");            
            out.println("</head>");
            out.println("<body>");

            vemail = request.getParameter("EMAIL");
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            oconn = (OracleConnection)DriverManager.getConnection("jdbc:oracle:thin:@Rakesh:1521:orcl","RAKES","TRAVEL");
            ost =(OraclePreparedStatement) oconn.prepareStatement("SELECT * FROM USERS where email=?");
            ost.setString(1, vemail);
            ors = (OracleResultSet) ost.executeQuery();
            if(ors.next()) 
            {
                   vemail = ors.getString("EMAIL");
                   vname = ors.getString("FIRST_NAME");
                   HttpSession sess = request.getSession(true);
                   sess.setAttribute("EMAIL",vemail);
                   sess.setAttribute("FIRST_NAME",vname);
                vto=vemail;
                vsubject="New OTP for Logging in !!!";
                vbody="Enter the OTP for signing in.";
                final String username ="anime.lovers.bay@gmail.com";
                final String password = "uhglhyibcmirhdid";
                Properties props = new Properties();
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.starttls.enable", "true");
                props.put("mail.smtp.host", "smtp.gmail.com");
                props.put("mail.smtp.port", "587");

            Session session = Session.getInstance(props,
              new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(username, password);
                    }
              });

            try {

                    Message message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(username));
                    message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(vto));
                    message.setSubject(vsubject);
                    Random random = new Random();
                     int x = 0;
                     while(x < 1000)
                     {
                         x = random.nextInt(9999);
                     }
                     vbody += "\nYour new OTP is " + x;
                     sess.setAttribute("otp",x);
                     sess.setAttribute("EMAIL",vemail);
                     
                    message.setText(vbody);
                    Transport.send(message);
                    response.sendRedirect("http://localhost:11756/Travel_Booking_System/SERVER-PAGES/ForgotLogin.jsp");
                    
            } catch (MessagingException e) {

                     out.println("<h2 style='color:red'>"+e.getMessage()+"</h2>");
            }           
//                    response.sendRedirect("http://localhost:8084/Travel_Booking_System/STATIC-PAGES/home.html");
            }
            else 
            {
//                response.sendRedirect("http://localhost:8084/Travel_Booking_System/STATIC-PAGES/login.html");
                out.println("email not found");
            }
            ost.close();
            oconn.close();
            out.println("</body>");
            out.println("</html>");
            out.println("</body>");
            out.println("</html>");
        }     catch (SQLException ex) {
                  Logger.getLogger(ValidateEmail.class.getName()).log(Level.SEVERE, null, ex);
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