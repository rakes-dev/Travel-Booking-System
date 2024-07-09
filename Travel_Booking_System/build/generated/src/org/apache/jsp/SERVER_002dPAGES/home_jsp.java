package org.apache.jsp.SERVER_002dPAGES;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("   <meta charset=\"UTF-8\">\n");
      out.write("   <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("   <title>Home</title>\n");
      out.write("\n");
      out.write("   <link rel=\"stylesheet\" href=\"https://unpkg.com/aos@next/dist/aos.css\" />\n");
      out.write("   <link rel=\"stylesheet\" href=\"https://unpkg.com/swiper@8/swiper-bundle.min.css\" />\n");
      out.write("   <!-- font awesome cdn link  -->\n");
      out.write("   <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css\">\n");
      out.write("   <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\">\n");
      out.write("\n");
      out.write("   <!-- custom css file link  -->\n");
      out.write("   <link rel=\"stylesheet\" href=\"../css/style.css\">\n");
      out.write("   <link rel=\"stylesheet\" href=\"../css/media.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body style=\"overflow: hidden;\">\n");
      out.write("    ");
      out.write("\n");
      out.write("        ");

            HttpSession sess = request.getSession(false);
            try
        {
            if(sess!=null) 
            {
                vname = sess.getAttribute("FIRST_NAME").toString();
        
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
      out.write("<!--               <script>\n");
      out.write("                    alert(\"Something Went Wrong\");\n");
      out.write("                </script>-->\n");
      out.write("        ");
  
            }
        
      out.write("   \n");
      out.write(" <!-- header section starts  -->\n");
      out.write("\n");
      out.write(" <header>\n");
      out.write("\n");
      out.write("   <div id=\"menu-bar\" class=\"fas fa-bars\"></div>\n");
      out.write("\n");
      out.write("   <a href=\"#\" class=\"logo\"> <span>T</span>ravel</a>\n");
      out.write("\n");
      out.write("   <nav class=\"navbar\">\n");
      out.write("      <a href=\"home.jsp\">home</a>\n");
      out.write("      <a href=\"packages.jsp\">packages</a>\n");
      out.write("      <a href=\"services.jsp\">services</a>\n");
      out.write("      <a href=\"gallery.jsp\">gallery</a>\n");
      out.write("      <a href=\"contact.jsp\">contact</a>\n");
      out.write("      <a href=\"about.jsp\">about</a>\n");
      out.write("   </nav>\n");
      out.write("\n");
      out.write("   <div class=\"icons\">\n");
      out.write("       <i class=\"fas fa-search\" id=\"search-btn\"></i>\n");
      out.write("      <a href=\"../STATIC-PAGES/login.html\" id=\"login-link\">\n");
      out.write("            <i class=\"fas fa-user\" id=\"login-icon\"></i></a>\n");
      out.write("            <i class=\"fas fa-users-times\" id=\"username\"></i>\n");
      out.write("            <div id=\"signOut\" style=\"display: none; \"><a href=\"../ravel_Booking_System/sessionLogOut\"><i class=\"fas fa-sign-out\" id=\"\"></i></a></div>\n");
      out.write("        \n");
      out.write("   </div>\n");
      out.write("\n");
      out.write("   <form action=\"\" class=\"search-bar-container\">\n");
      out.write("       <input type=\"search\" id=\"search-bar\" placeholder=\"search here...\">\n");
      out.write("       <label for=\"search-bar\" class=\"fas fa-search\"></label>\n");
      out.write("   </form>\n");
      out.write("\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<!-- home section starts  -->\n");
      out.write("<div class=\"home-bg\">\n");
      out.write("\n");
      out.write("<div class=\"container home\">\n");
      out.write("\n");
      out.write("   <section class=\"flex\" data-aos-delay=\"600\">\n");
      out.write("\n");
      out.write("      <div class=\"content\">\n");
      out.write("         <h3>adventure is worthwhile</h3>\n");
      out.write("         <p>discover new places with us, adventure awaits</p>\n");
      out.write("         <a href=\"#\" class=\"btn\">discover more</a>\n");
      out.write("     </div>\n");
      out.write("\n");
      out.write("   </section>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- about section starts  -->\n");
      out.write("\n");
      out.write("<div class=\"container about\">\n");
      out.write("\n");
      out.write("    <h1 class=\"heading\" data-aos=\"zoom-out\">Why Choose Us</h1>\n");
      out.write(" \n");
      out.write("    <section>\n");
      out.write("       <div class=\"grid\">\n");
      out.write("          \n");
      out.write("          <div class=\"box\" data-aos=\"fade-up\">\n");
      out.write("             <img src=\"../images/about-img-1.svg\" alt=\"\">\n");
      out.write("             <h3>easy bookings</h3>\n");
      out.write("             <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Maiores sed blanditiis.</p>\n");
      out.write("          </div>\n");
      out.write(" \n");
      out.write("          <div class=\"box\" data-aos=\"fade-up\">\n");
      out.write("             <img src=\"../images/about-img-2.svg\" alt=\"\">\n");
      out.write("             <h3>travel world</h3>\n");
      out.write("             <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Maiores sed blanditiis.</p>\n");
      out.write("          </div>\n");
      out.write(" \n");
      out.write("          <div class=\"box\" data-aos=\"fade-up\">\n");
      out.write("             <img src=\"../images/about-img-3.svg\" alt=\"\">\n");
      out.write("             <h3>enjoy tours</h3>\n");
      out.write("             <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Maiores sed blanditiis.</p>\n");
      out.write("          </div>\n");
      out.write(" \n");
      out.write("       </div>\n");
      out.write(" \n");
      out.write("    </section>\n");
      out.write(" \n");
      out.write(" </div>\n");
      out.write(" \n");
      out.write(" <!-- about section ends -->\n");
      out.write(" \n");
      out.write(" <!-- reviews section starts  -->\n");
      out.write(" \n");
      out.write(" <section class=\"reviews\" id=\"reviews\">\n");
      out.write("\n");
      out.write("   <h1 class=\"heading1\"> client's reviews</h1>\n");
      out.write("\n");
      out.write("   <div class=\"swiper reviews-slider\">\n");
      out.write("\n");
      out.write("       <div class=\"swiper-wrapper\">\n");
      out.write("\n");
      out.write("           <div class=\"swiper-slide box\">\n");
      out.write("               <img src=\"../images/pic-1.png\" alt=\"\">\n");
      out.write("               <h3>john deo</h3>\n");
      out.write("               <p>Navigating through the website was a breeze. The clean layout and intuitive design made it\n");
      out.write("                   easy to find the perfect holiday package. Thumbs up for user experienc</p>\n");
      out.write("               <div class=\"stars\">\n");
      out.write("                   <i class=\"fas fa-star\"></i>\n");
      out.write("                   <i class=\"fas fa-star\"></i>\n");
      out.write("                   <i class=\"fas fa-star\"></i>\n");
      out.write("                   <i class=\"fas fa-star\"></i>\n");
      out.write("                   <i class=\"fas fa-star-half-alt\"></i>\n");
      out.write("               </div>\n");
      out.write("           </div>\n");
      out.write("\n");
      out.write("           <div class=\"swiper-slide box\">\n");
      out.write("               <img src=\"../images/pic-2.png\" alt=\"\">\n");
      out.write("               <h3>titu </h3>\n");
      out.write("               <p>Impressed with the diverse range of travel packages available. \n");
      out.write("                   From budget-friendly to luxury options, there's something for every traveler. Loved the choices!</p>\n");
      out.write("               <div class=\"stars\">\n");
      out.write("                   <i class=\"fas fa-star\"></i>\n");
      out.write("                   <i class=\"fas fa-star\"></i>\n");
      out.write("                   <i class=\"fas fa-star\"></i>\n");
      out.write("                   <i class=\"fas fa-star\"></i>\n");
      out.write("                   <i class=\"fas fa-star-half-alt\"></i>\n");
      out.write("               </div>\n");
      out.write("           </div>\n");
      out.write("\n");
      out.write("           <div class=\"swiper-slide box\">\n");
      out.write("               <img src=\"../images/pic-3.png\" alt=\"\">\n");
      out.write("               <h3>akash </h3>\n");
      out.write("               <p>Appreciated the detailed information provided for each package. It helped me make an\n");
      out.write("                   informed decision, knowing exactly what to expect. Will use this service again!</p>\n");
      out.write("               <div class=\"stars\">\n");
      out.write("                   <i class=\"fas fa-star\"></i>\n");
      out.write("                   <i class=\"fas fa-star\"></i>\n");
      out.write("                   <i class=\"fas fa-star\"></i>\n");
      out.write("                   <i class=\"fas fa-star\"></i>\n");
      out.write("                   <i class=\"fas fa-star-half-alt\"></i>\n");
      out.write("               </div>\n");
      out.write("           </div>\n");
      out.write("\n");
      out.write("           <div class=\"swiper-slide box\">\n");
      out.write("               <img src=\"../images/pic-4.png\" alt=\"\">\n");
      out.write("               <h3>binoy </h3>\n");
      out.write("               <p>Navigating through the website was a breeze. The clean layout and intuitive design made it\n");
      out.write("                   easy to find the perfect holiday package. Thumbs up for user experience!</p>\n");
      out.write("               <div class=\"stars\">\n");
      out.write("                   <i class=\"fas fa-star\"></i>\n");
      out.write("                   <i class=\"fas fa-star\"></i>\n");
      out.write("                   <i class=\"fas fa-star\"></i>\n");
      out.write("                   <i class=\"fas fa-star\"></i>\n");
      out.write("                   <i class=\"fas fa-star-half-alt\"></i>\n");
      out.write("               </div>\n");
      out.write("           </div>\n");
      out.write("\n");
      out.write("           <div class=\"swiper-slide box\">\n");
      out.write("               <img src=\"../images/pic-5.png\" alt=\"\">\n");
      out.write("               <h3>kaleen bhaiya</h3>\n");
      out.write("               <p>Received instant confirmation of my booking, which gave me peace of mind. \n");
      out.write("                   The swift response and confirmation process added to the overall positive experience.</p>\n");
      out.write("               <div class=\"stars\">\n");
      out.write("                   <i class=\"fas fa-star\"></i>\n");
      out.write("                   <i class=\"fas fa-star\"></i>\n");
      out.write("                   <i class=\"fas fa-star\"></i>\n");
      out.write("                   <i class=\"fas fa-star\"></i>\n");
      out.write("                   <i class=\"fas fa-star-half-alt\"></i>\n");
      out.write("               </div>\n");
      out.write("           </div>\n");
      out.write("\n");
      out.write("           <div class=\"swiper-slide box\">\n");
      out.write("               <img src=\"../images/pic-6.png\" alt=\"\">\n");
      out.write("               <h3>munna bhaiya</h3>\n");
      out.write("               <p>Appreciated the detailed information provided for each package. It helped me make an\n");
      out.write("                   informed decision, knowing exactly what to expect. Will use this service again!</p>\n");
      out.write("               <div class=\"stars\">\n");
      out.write("                   <i class=\"fas fa-star\"></i>\n");
      out.write("                   <i class=\"fas fa-star\"></i>\n");
      out.write("                   <i class=\"fas fa-star\"></i>\n");
      out.write("                   <i class=\"fas fa-star\"></i>\n");
      out.write("                   <i class=\"fas fa-star-half-alt\"></i>\n");
      out.write("               </div>\n");
      out.write("           </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("       </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("   </div>\n");
      out.write("</section>\n");
      out.write(" <!-- reviews section ends -->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- home section ends -->\n");
      out.write("\n");
      out.write(" <!-- footer section  -->\n");
      out.write("\n");
      out.write(" <section class=\"footer\">\n");
      out.write("\n");
      out.write("   <div class=\"box-container\">\n");
      out.write("\n");
      out.write("       <div class=\"box\">\n");
      out.write("           <h3>about us</h3>\n");
      out.write("           <p>WorldTrips offers a variety of travel medical and trip cancellation insurance plans \n");
      out.write("               to meet the needs of individuals, groups, and organizations across the globe.\n");
      out.write("             or over a years, we've been on a mission to make unexpected travel mishaps and emergencies less stressful for travelers.\n");
      out.write("           Our travel insurance plans can provide you with financial compensation, access to quality healthcare, and 24/7 \n");
      out.write("           emergency travel assistance to guide you through the unexpected as you explore the world.</p>\n");
      out.write("       </div>\n");
      out.write("       <div class=\"box\">\n");
      out.write("           <h3>branch locations</h3>\n");
      out.write("           <a href=\"#\"> india </a>\n");
      out.write("           <a href=\"#\"> usa </a>\n");
      out.write("           <a href=\"#\"> japan </a>\n");
      out.write("           <a href=\"#\"> united kingdom </a>\n");
      out.write("           <a href=\"#\"> australia </a>\n");
      out.write("           <a href=\"#\"> portugal </a>\n");
      out.write("           <a href=\"#\"> brazil </a>\n");
      out.write("           <a href=\"#\"> dubai </a>\n");
      out.write("           <a href=\"#\"> italy </a>\n");
      out.write("           <a href=\"#\"> france </a>\n");
      out.write("           <a href=\"#\"> germany </a>\n");
      out.write("       </div>\n");
      out.write("       <div class=\"box\">\n");
      out.write("           <h3>quick links</h3>\n");
      out.write("           <a href=\"#\"> home </a>\n");
      out.write("           <a href=\"#\"> book </a>\n");
      out.write("           <a href=\"#\"> packages </a>\n");
      out.write("           <a href=\"#\"> services </a>\n");
      out.write("           <a href=\"#\"> gallery </a>\n");
      out.write("           <a href=\"#\"> review </a>\n");
      out.write("           <a href=\"#\"> contact </a>\n");
      out.write("       </div>\n");
      out.write("       <div class=\"box\">\n");
      out.write("           <h3>follow us</h3>\n");
      out.write("           <a href=\"#\"> facebook </a>\n");
      out.write("           <a href=\"#\"> instagram </a>\n");
      out.write("           <a href=\"#\"> twitter </a>\n");
      out.write("           <a href=\"#\"> youtube </a>\n");
      out.write("           <a href=\"#\"> linkedin </a>\n");
      out.write("       </div>\n");
      out.write("\n");
      out.write("   </div>\n");
      out.write("\n");
      out.write("   <!-- <h1 class=\"credit\"> credated by <span></span> | all rights reserved! </h1> -->\n");
      out.write("\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"https://unpkg.com/aos@next/dist/aos.js\"></script>\n");
      out.write("<script src=\"https://unpkg.com/swiper@8/swiper-bundle.min.js\"></script>\n");
      out.write("<!-- custom js file link  -->\n");
      out.write("<script src=\"../js/script.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
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
