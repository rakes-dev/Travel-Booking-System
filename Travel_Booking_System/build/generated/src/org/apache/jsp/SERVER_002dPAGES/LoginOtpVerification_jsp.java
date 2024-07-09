package org.apache.jsp.SERVER_002dPAGES;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleConnection;

public final class LoginOtpVerification_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            String votp, vemail,vname;
            OracleConnection oconn;
            OraclePreparedStatement ost;
            
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/media.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/style.css\">\n");
      out.write("        <style>\n");
      out.write("        .Verification-form-container{\n");
      out.write("    background: url('../images/home-bg.jpg') no-repeat rgba(0,0,0,.5);\n");
      out.write("    /* position: fixed; */\n");
      out.write("    top: -120%; left: 0;\n");
      out.write("    z-index: 10000;\n");
      out.write("    min-height: 100vh;\n");
      out.write("    width: 100%;\n");
      out.write("    /* background: rgba(0, 0, 0, .7); */\n");
      out.write("    display: flex;\n");
      out.write("    align-items: center;\n");
      out.write("    justify-content: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".Verification-form-container form{\n");
      out.write("    margin: 2rem;\n");
      out.write("    padding: 1.5rem 2rem;\n");
      out.write("    border-radius: .5rem;\n");
      out.write("    background: #fff;\n");
      out.write("    width: 50rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".Verification-form-container form h3{\n");
      out.write("    font-size: 3rem;\n");
      out.write("    color: #444;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 1rem 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".Verification-form-container form .box{\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 1rem;\n");
      out.write("    font-size: 1.7rem;\n");
      out.write("    color: #333;\n");
      out.write("    margin: .6rem 0;\n");
      out.write("    border: .1rem solid rgba(0, 0, 0, .3);\n");
      out.write("    text-transform: none;\n");
      out.write("}\n");
      out.write(".Verification-form-container form input#OTP.box{\n");
      out.write("    width: 40%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".Verification-form-container form .box:focus{\n");
      out.write("    border-color: #ffa500;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".Verification-form-container form label{\n");
      out.write("    font-size: 1.5rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".Verification-form-container form .btn{\n");
      out.write("    display: block;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".Verification-form-container form p{\n");
      out.write("    padding: .5rem 0;\n");
      out.write("    font-size: 1.5rem;\n");
      out.write("    color: #666;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".Verification-form-container form p a{\n");
      out.write("    color: #ffa500;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".Verification-form-container form p a:hover{\n");
      out.write("    color: #333;\n");
      out.write("    text-decoration: underline;\n");
      out.write("}\n");
      out.write(".btn{\n");
      out.write("    display: inline-block;\n");
      out.write("    margin-top: 1rem;\n");
      out.write("    background: #ffa500;\n");
      out.write("    color: #fff;\n");
      out.write("    padding: .8rem 3rem;\n");
      out.write("    border: .2rem solid #ffa500;\n");
      out.write("    cursor: pointer;\n");
      out.write("    font-size: 1.7rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn:hover{\n");
      out.write("    background: rgba(255, 165, 0, .2);\n");
      out.write("    color: #ffa500;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            HttpSession sess = request.getSession(false);
            try
{
            if(sess==null) 
            {
                vname = sess.getAttribute("FIRST_NAME").toString();
                votp = sess.getAttribute("otp").toString();
                vemail = sess.getAttribute("EMAIL").toString();
            }
}
catch(Exception ex)
{
                
      out.write("\n");
      out.write("                <script>\n");
      out.write("                    alert(\"Session was not created!!!\");\n");
      out.write("                    alert(\"Redirecting for logging==>>\");\n");
      out.write("                    location.href=\"http://localhost:11756/Travel_Booking_System/STATIC-PAGES/ValidateEmail.html\";\n");
      out.write("                </script>\n");
      out.write("                ");
  
}

      out.write('\n');

            if(request.getParameter("Verify")!=null)
            {
                if(request.getParameter("OTP").equals(votp))
                {
                
      out.write("\n");
      out.write("                <script>\n");
      out.write("                    alert(\"OTP verified successfully!!!\");\n");
      out.write("                    location.href=\"http://localhost:11756/Travel_Booking_System/SERVER-PAGES/home.jsp\";\n");
      out.write("                </script>\n");
      out.write("                ");

                }
                else
                {
                       
      out.write("  \n");
      out.write("                       <script>\n");
      out.write("                           document.addEventListener('DOMContentLoaded', function() {\n");
      out.write("                              var errorElement = document.querySelector('#error');\n");
      out.write("                           if(errorElement){\n");
      out.write("                           errorElement.style.display = 'block';\n");
      out.write("                       }\n");
      out.write("                            });\n");
      out.write("                       </script>            \n");
      out.write("                        ");

                }
}

      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <!-- Verification form  -->\n");
      out.write(" \n");
      out.write("    <div class=\"Verification-form-container\">\n");
      out.write("   \n");
      out.write("      <form method=\"post\" action=\"http://localhost:11756/Travel_Booking_System/SERVER-PAGES/LoginOtpVerification.jsp\">\n");
      out.write("          <h3>Verification</h3>\n");
      out.write("          <input name=\"EMAIL\" type=\"email\" class=\"box\" placeholder=\"");
      out.print(vemail);
      out.write("\" disabled>\n");
      out.write("          <h1 style=\"text-transform: none; font-size: 1.5rem; color: red;\" >Please enter the OTP sent to your registered email:</h1>\n");
      out.write("          <input name=\"OTP\" id=\"OTP\" type=\"text\" class=\"box\">\n");
      out.write("          <p id=\"error\" style=\"font-size: 1.5rem; display: none; color:red;\">Wrong OTP. Please try again!!!</p>\n");
      out.write("          <input name=\"Verify\" id=\"Verify\" type=\"submit\" value=\"Verify now\" class=\"btn\">\n");
      out.write("\n");
      out.write("          <p>Back to login? <a href=\"http://localhost:11756/Travel_Booking_System/STATIC-PAGES/login.html\" >click here</a></p>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
