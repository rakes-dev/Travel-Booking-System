/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

/**
 *
 * @author rakes
 */
public class adminLogin extends HttpServlet {

        OracleConnection oconn;
        OraclePreparedStatement ops;
        OracleResultSet ors = null;
        String vusername, vpass;
          
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet adminLogin</title>");            
            out.println("</head>");
            out.println("<body>");
            
            vusername = request.getParameter("username");
            vpass = request.getParameter("pass");
            out.println("<h1>"+vusername+"</h1>");
            out.println("<h1>"+vpass+"</h1>");
            try {
                DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
                                oconn = (OracleConnection)DriverManager.getConnection("jdbc:oracle:thin:@Rakesh:1521:orcl","RAKES","TRAVEL");
                ops =(OraclePreparedStatement) oconn.prepareStatement("SELECT * FROM ADMIN_LOGIN where USERNAME=? and PASSWORD=?");
                ops.setString(1, vusername);
                ops.setString(2, vpass);
                ors = (OracleResultSet) ops.executeQuery();
                if(ors.next()){
                    
                       response.sendRedirect("http://localhost:11756/Travel_Booking_System/SERVER-PAGES/adminHome.jsp");
              ors.close();
              ops.close();
              oconn.close();
                }else{
                out.println("wrong password");
            } 
              
            } catch (SQLException ex) {
                Logger.getLogger(adminLogin.class.getName()).log(Level.SEVERE, null, ex);
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
