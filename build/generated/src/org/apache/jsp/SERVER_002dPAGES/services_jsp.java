package org.apache.jsp.SERVER_002dPAGES;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class services_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Services</title>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://unpkg.com/aos@next/dist/aos.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://unpkg.com/swiper@8/swiper-bundle.min.css\" />\n");
      out.write("    <!-- font awesome cdn link  -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css\">\n");
      out.write("\n");
      out.write("    <!-- custom css file link  -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/media.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("        ");
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
      out.write("    <!-- header section starts  -->\n");
      out.write("\n");
      out.write("    <header>\n");
      out.write("\n");
      out.write("        <div id=\"menu-bar\" class=\"fas fa-bars\"></div>\n");
      out.write("\n");
      out.write("        <a href=\"#\" class=\"logo\"> <span>T</span>ravel</a>\n");
      out.write("\n");
      out.write("         <nav class=\"navbar\">\n");
      out.write("      <a href=\"home.jsp\">home</a>\n");
      out.write("      <a href=\"packages.jsp\">packages</a>\n");
      out.write("      <a href=\"services.jsp\">services</a>\n");
      out.write("      <a href=\"gallery.jsp\">gallery</a>\n");
      out.write("      <a href=\"contact.jsp\">contact</a>\n");
      out.write("      <a href=\"about.jsp\">about</a>\n");
      out.write("   </nav>\n");
      out.write("\n");
      out.write("        <div class=\"icons\">\n");
      out.write("       <i class=\"fas fa-search\" id=\"search-btn\"></i>\n");
      out.write("      <a href=\"STATIC-PAGES/login.html\" id=\"login-link\">\n");
      out.write("            <i class=\"fas fa-user\" id=\"login-icon\"></i></a>\n");
      out.write("            <i class=\"fas fa-users-times\" id=\"username\"></i>\n");
      out.write("            <div id=\"signOut\" style=\"display: none; \"><a href=\"http://localhost:11756/Travel_Booking_System/sessionLogOut\"><i class=\"fas fa-sign-out\" id=\"\"></i></a></div>\n");
      out.write("   </div>\n");
      out.write("\n");
      out.write("        <form action=\"\" class=\"search-bar-container\">\n");
      out.write("            <input type=\"search\" id=\"search-bar\" placeholder=\"search here...\">\n");
      out.write("            <label for=\"search-bar\" class=\"fas fa-search\"></label>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <!-- header section ends -->\n");
      out.write("    <br><br><br><br><br>\n");
      out.write("    <!-- services section  -->\n");
      out.write("\n");
      out.write("    <section class=\"services\" id=\"services\">\n");
      out.write("\n");
      out.write("        <h1 class=\"heading\">\n");
      out.write("            <span>s</span>\n");
      out.write("            <span>e</span>\n");
      out.write("            <span>r</span>\n");
      out.write("            <span>v</span>\n");
      out.write("            <span>i</span>\n");
      out.write("            <span>c</span>\n");
      out.write("            <span>e</span>\n");
      out.write("            <span>s</span>\n");
      out.write("        </h1>\n");
      out.write("\n");
      out.write("        <div class=\"box-container\">\n");
      out.write("\n");
      out.write("            <div class=\"box\">\n");
      out.write("                <i class=\"fas fa-hotel\"></i>\n");
      out.write("                <h3>affordable hotels</h3>\n");
      out.write("                <p>Finding a comfortable place to stay doesn't have to break the bank. Our travel services include a curated \n");
      out.write("                    selection of affordable hotels, ensuring you have a pleasant and budget-friendly\n");
      out.write("                    accommodation experience. From cozy inns to modern budget hotels, we've got you covered.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"box\">\n");
      out.write("                <i class=\"fas fa-utensils\"></i>\n");
      out.write("                <h3>food and drinks</h3>\n");
      out.write("                <p>Experience the local flavors and culinary delights of each destination with our food and drinks service. \n");
      out.write("                    Discover the best local restaurants, street food vendors, and hidden gems, ensuring you savor the essence of the region.\n");
      out.write("                    From international cuisine to authentic local dishes, embark on a gastronomic journey with us.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"box\">\n");
      out.write("                <i class=\"fas fa-bullhorn\"></i>\n");
      out.write("                <h3>safety guide</h3>\n");
      out.write("                <p>Your safety is our top priority. Our safety guide service provides valuable information\n");
      out.write("                    on the security measures and precautions you should take during your travels.\n");
      out.write("                    Stay informed about local safety guidelines, emergency contacts, and travel\n");
      out.write("                    advisories to ensure a secure and worry-free journey.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"box\">\n");
      out.write("                <i class=\"fas fa-globe-asia\"></i>\n");
      out.write("                <h3>around the world</h3>\n");
      out.write("                <p>Explore the world with ease through our \"Around the World\" service. Whether you're planning a multi-country tour or a global adventure,\n");
      out.write("                    we offer comprehensive travel solutions. From visa assistance to itinerary planning,\n");
      out.write("                    make your dream of traveling around the world a reality with our expert guidance.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"box\">\n");
      out.write("                <i class=\"fas fa-plane\"></i>\n");
      out.write("                <h3>fastest travel routes</h3>\n");
      out.write("                <p>Save time and reach your destination efficiently with our fastest travel routes service. \n");
      out.write("                    We analyze and provide you with the quickest transportation options, whether by air, land, or sea.\n");
      out.write("                    Optimize your travel time and enjoy more moments at your destination with our route planning expertise.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"box\">\n");
      out.write("                <i class=\"fas fa-hiking\"></i>\n");
      out.write("                <h3>adventures</h3>\n");
      out.write("                <p>For thrill-seekers and adventure enthusiasts, our adventure service opens up a world of exciting possibilities. Discover adrenaline-pumping\n");
      out.write("                    activities such as hiking, water sports, and extreme sports at various destinations. \n");
      out.write("                    Unleash your adventurous spirit and create unforgettable memories with our tailored adventure experiences.</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <br><br><br><br><br>\n");
      out.write("        <h1 class=\"heading1\" ><a href=\"../STATIC-PAGES/feedback.html\">Share your experience👈</a></h1>\n");
      out.write("    </section>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <!-- footer section  -->\n");
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
      out.write("</body>\n");
      out.write("\n");
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
