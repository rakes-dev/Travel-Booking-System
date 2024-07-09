package org.apache.jsp.SERVER_002dPAGES;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gallery_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            String vname;
            
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("   <meta charset=\"UTF-8\">\n");
      out.write("   <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("   <title>Gallery</title>\n");
      out.write("\n");
      out.write("   <link rel=\"stylesheet\" href=\"https://unpkg.com/aos@next/dist/aos.css\" />\n");
      out.write("\n");
      out.write("   <!-- font awesome cdn link  -->\n");
      out.write("   <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css\">\n");
      out.write("\n");
      out.write("   <!-- custom css file link  -->\n");
      out.write("   <link rel=\"stylesheet\" href=\"../css/style.css\">\n");
      out.write("   <link rel=\"stylesheet\" href=\"../css/media.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("       ");
      out.write("\n");
      out.write("        ");

            HttpSession sess = request.getSession(false);
            try
        {
            if(sess!=null) 
            {
                vname = sess.getAttribute("FIRST_NAME").toString();
//                votp = sess.getAttribute("otp").toString();
//                vemail = sess.getAttribute("EMAIL").toString();
        
      out.write("\n");
      out.write("            <script>\n");
      out.write("                document.addEventListener('DOMContentLoaded', function() {\n");
      out.write("                   var login_icon = document.getElementById('login-icon');\n");
      out.write("                   var signOut = document.getElementById('signOut');\n");
      out.write("                   var username = document.getElementById('username');\n");
      out.write("                   username.innerHTML=\"");
      out.print(vname);
      out.write("\";\n");
      out.write("                   signOut.style.display=\"inline-block\";   \n");
      out.write("                   login_icon.style.display=\"none\";\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("        ");

            }
        }catch(Exception ex)
            {
                
      out.write("\n");
      out.write("<!--                <script>\n");
      out.write("                    alert(\"Session was not created!!!\");\n");
      out.write("                    alert(\"Redirecting for logging==>>\");\n");
      out.write("                    location.href=\"http://localhost:11756/Travel_Booking_System/STATIC-PAGES/login.html\";\n");
      out.write("                </script>-->\n");
      out.write("        ");
  
            }
        
      out.write("   \n");
      out.write("  \n");
      out.write(" <!-- header section starts  -->\n");
      out.write("\n");
      out.write(" <header>\n");
      out.write("\n");
      out.write("   <div id=\"menu-bar\" class=\"fas fa-bars\"></div>\n");
      out.write("\n");
      out.write("   <a href=\"#\" class=\"logo\"> <span>T</span>ravel</a>\n");
      out.write("\n");
      out.write("    <nav class=\"navbar\">\n");
      out.write("      <a href=\"home.jsp\">home</a>\n");
      out.write("      <a href=\"packages.jsp\">packages</a>\n");
      out.write("      <a href=\"services.jsp\">services</a>\n");
      out.write("      <a href=\"gallery.jsp\">gallery</a>\n");
      out.write("      <a href=\"contact.jsp\">contact</a>\n");
      out.write("      <a href=\"about.jsp\">about</a>\n");
      out.write("   </nav>\n");
      out.write("\n");
      out.write("  <div class=\"icons\">\n");
      out.write("       <i class=\"fas fa-search\" id=\"search-btn\"></i>\n");
      out.write("      <a href=\"STATIC-PAGES/login.html\" id=\"login-link\">\n");
      out.write("            <i class=\"fas fa-user\" id=\"login-icon\"></i></a>\n");
      out.write("            <i class=\"fas fa-users-times\" id=\"username\"></i>\n");
      out.write("            <div id=\"signOut\" style=\"display: none; \"><a href=\"http://localhost:11756/Travel_Booking_System/sessionLogOut\"><i class=\"fas fa-sign-out\" id=\"\"></i></a></div>\n");
      out.write("   </div>\n");
      out.write("\n");
      out.write("   <form action=\"\" class=\"search-bar-container\">\n");
      out.write("       <input type=\"search\" id=\"search-bar\" placeholder=\"search here...\">\n");
      out.write("       <label for=\"search-bar\" class=\"fas fa-search\"></label>\n");
      out.write("   </form>\n");
      out.write("\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<!-- header section ends -->\n");
      out.write("\n");
      out.write("<!-- destinations section starts  -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container destinations\">\n");
      out.write("\n");
      out.write("   <h1 class=\"heading\" data-aos=\"zoom-out\">destinations</h1>\n");
      out.write("\n");
      out.write("   <section class=\"grid\">\n");
      out.write("\n");
      out.write("      <div class=\"box\" data-aos=\"zoom-in\">\n");
      out.write("         <img src=\"../images/destination-1.jpg\" alt=\"\">\n");
      out.write("         <h3><span>istanbul</span></h3>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"box\" data-aos=\"zoom-in\">\n");
      out.write("         <img src=\"../images/destination-2.jpg\" alt=\"\">\n");
      out.write("         <h3><span>california</span></h3>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"box\" data-aos=\"zoom-in\">\n");
      out.write("         <img src=\"../images/destination-3.jpg\" alt=\"\">\n");
      out.write("         <h3><span>london</span></h3>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"box\" data-aos=\"zoom-in\">\n");
      out.write("         <img src=\"../images/destination-4.jpg\" alt=\"\">\n");
      out.write("         <h3><span>madrid</span></h3>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"box\" data-aos=\"zoom-in\">\n");
      out.write("         <img src=\"../images/destination-5.jpg\" alt=\"\">\n");
      out.write("         <h3><span>dubai</span></h3>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"box\" data-aos=\"zoom-in\">\n");
      out.write("         <img src=\"../images/destination-6.jpg\" alt=\"\">\n");
      out.write("         <h3><span>paris</span></h3>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"box\" data-aos=\"zoom-in\">\n");
      out.write("         <img src=\"../images/destination-7.jpg\" alt=\"\">\n");
      out.write("         <h3><span>rome</span></h3>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"box\" data-aos=\"zoom-in\">\n");
      out.write("         <img src=\"../images/destination-8.jpg\" alt=\"\">\n");
      out.write("         <h3><span>sydney</span></h3>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"box\" data-aos=\"zoom-in\">\n");
      out.write("         <img src=\"../images/destination-9.jpg\" alt=\"\">\n");
      out.write("         <h3><span>china</span></h3>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("   </section>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- destinations section ends -->\n");
      out.write("<!-- footer section  -->\n");
      out.write("\n");
      out.write(" <section class=\"footer\">\n");
      out.write("\n");
      out.write("    <div class=\"box-container\">\n");
      out.write(" \n");
      out.write("        <div class=\"box\">\n");
      out.write("            <h3>about us</h3>\n");
      out.write("            <p>WorldTrips offers a variety of travel medical and trip cancellation insurance plans \n");
      out.write("               to meet the needs of individuals, groups, and organizations across the globe.\n");
      out.write("             or over a years, we've been on a mission to make unexpected travel mishaps and emergencies less stressful for travelers.\n");
      out.write("           Our travel insurance plans can provide you with financial compensation, access to quality healthcare, and 24/7 \n");
      out.write("           emergency travel assistance to guide you through the unexpected as you explore the world.</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <h3>branch locations</h3>\n");
      out.write("            <a href=\"#\"> india </a>\n");
      out.write("            <a href=\"#\"> usa </a>\n");
      out.write("            <a href=\"#\"> japan </a>\n");
      out.write("            <a href=\"#\"> united kingdom </a>\n");
      out.write("            <a href=\"#\"> australia </a>\n");
      out.write("            <a href=\"#\"> portugal </a>\n");
      out.write("            <a href=\"#\"> brazil </a>\n");
      out.write("            <a href=\"#\"> dubai </a>\n");
      out.write("            <a href=\"#\"> italy </a>\n");
      out.write("            <a href=\"#\"> france </a>\n");
      out.write("            <a href=\"#\"> germany </a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <h3>quick links</h3>\n");
      out.write("            <a href=\"#\"> home </a>\n");
      out.write("            <a href=\"#\"> book </a>\n");
      out.write("            <a href=\"#\"> packages </a>\n");
      out.write("            <a href=\"#\"> services </a>\n");
      out.write("            <a href=\"#\"> gallery </a>\n");
      out.write("            <a href=\"#\"> review </a>\n");
      out.write("            <a href=\"#\"> contact </a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <h3>follow us</h3>\n");
      out.write("            <a href=\"#\"> facebook </a>\n");
      out.write("            <a href=\"#\"> instagram </a>\n");
      out.write("            <a href=\"#\"> twitter </a>\n");
      out.write("            <a href=\"#\"> youtube </a>\n");
      out.write("            <a href=\"#\"> linkedin </a>\n");
      out.write("        </div>\n");
      out.write(" \n");
      out.write("    </div>\n");
      out.write(" \n");
      out.write("    <!-- <h1 class=\"credit\"> credated by <span></span> | all rights reserved! </h1> -->\n");
      out.write(" \n");
      out.write(" </section>\n");
      out.write("\n");
      out.write("<script src=\"https://unpkg.com/aos@next/dist/aos.js\"></script>\n");
      out.write("\n");
      out.write("<!-- custom js file link  -->\n");
      out.write("<script src=\"../js/script.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
