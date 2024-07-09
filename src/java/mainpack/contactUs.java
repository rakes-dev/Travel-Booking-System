package mainpack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
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
import oracle.jdbc.OracleConnection;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

public class contactUs extends HttpServlet {
          OracleConnection oconn;
          OraclePreparedStatement ops;
          OracleResultSet ors = null;
          String vemail,vname,vmessage,vnumber;
          String vto, vfrom, vcc, vbcc, vsubject, vbody;


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SessionServe</title>");            
            out.println("</head>");
            out.println("<body>");
              
            vemail = request.getParameter("email");
            vname = request.getParameter("name");
            vnumber = request.getParameter("number");
            vmessage = request.getParameter("message");
            
                // PLS NOTE THAT U CAN IGNORE MANY LINES BELOW IF U R NOT DEALING WITH OTP OR MAIL SENDING
                vto="anime.lovers.bay@gmail.com";
                vsubject="User Response";
                vbody="\nName: "+vname+"\nEmail: "+vemail+"\nNumber: "+vnumber+"\nMessage: "+vmessage;
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
                    message.setText(vbody);
                    Transport.send(message);
                    response.sendRedirect("http://localhost:11756/Travel_Booking_System/SERVER-PAGES/contact.jsp");
                    
            } catch (MessagingException e) {

                     out.println("<h2 style='color:red'>"+e.getMessage()+"</h2>");
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