package org.apache.jsp.SERVER_002dPAGES;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>User Registration</title>\n");
      out.write("\n");
      out.write("    <!-- custom css file link  -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/media.css\">\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        \n");
      out.write("        document.addEventListener(\"DOMContentLoaded\", function() {\n");
      out.write("          \n");
      out.write("        const selectElement = document.getElementById(\"gender\");\n");
      out.write("        const termsLink = document.getElementById('terms-link');\n");
      out.write("        const termsCheckbox = document.getElementById('terms-checkbox');\n");
      out.write("        const closeBtn = document.getElementById('close-modal');\n");
      out.write("        const modal = document.getElementById('terms-modal');\n");
      out.write("        const acceptButton = document.getElementById('accept-terms');\n");
      out.write("        termsLink.addEventListener('click', function () {\n");
      out.write("            modal.style.display = 'block';\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        closeBtn.addEventListener('click', function () {\n");
      out.write("            modal.style.display = 'none';\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        window.addEventListener('click', function (event) {\n");
      out.write("            if (event.target == modal) {\n");
      out.write("                modal.style.display = 'none';\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        acceptButton.addEventListener('click', function () {\n");
      out.write("            termsCheckbox.disabled = false;\n");
      out.write("            modal.style.display = 'none';\n");
      out.write("        });\n");
      out.write("        const form = document.getElementById(\"registrationForm\");\n");
      out.write("        const submitBtn = document.getElementById(\"submit-button\");\n");
      out.write("        termsCheckbox.disabled = true;\n");
      out.write("\n");
      out.write("        form.addEventListener(\"input\", function () {\n");
      out.write("            const allInputsValid = Array.from(form.elements).every((element) =>\n");
      out.write("                element.checkValidity()\n");
      out.write("            );\n");
      out.write("            selectElement.addEventListener(\"change\", function () {\n");
      out.write("                if (this.value !== \"\") {\n");
      out.write("                    termsCheckbox.addEventListener(\"change\", function () {\n");
      out.write("                        if (this.checked) {\n");
      out.write("                            submitBtn.disabled = allInputsValid;\n");
      out.write("                        } else {\n");
      out.write("                            submitBtn.setAttribute(\"disabled\", \"disabled\");\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                } else {\n");
      out.write("                    submitBtn.setAttribute(\"disabled\", \"disabled\");\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        });\n");
      out.write("\n");
      out.write("\n");
      out.write("        // Password check\n");
      out.write("        function validatePassword(event) {\n");
      out.write("//            event.preventDefault();\n");
      out.write("            var password = document.getElementById(\"password\").value;\n");
      out.write("            var confirmPassword = document.getElementById(\"confirmPassword\").value;\n");
      out.write("\n");
      out.write("            if (password !== confirmPassword) {\n");
      out.write("\n");
      out.write("                document.getElementById(\"error\").innerHTML = \"Passwords do not match!\";\n");
      out.write("            } else {\n");
      out.write("                document.getElementById(\"error\").innerHTML = \"\"; // Clear the error message\n");
      out.write("                regForm.classList.remove('active');\n");
      out.write("                loginForm.classList.remove('active');\n");
      out.write("                document.getElementById(\"registrationForm\").submit();\n");
      out.write("            }\n");
      out.write("        } \n");
      out.write("    });\n");
      out.write("      \n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <!-- Register form  -->\n");
      out.write("\n");
      out.write("    <div class=\"register-form-container\">\n");
      out.write("\n");
      out.write("        <i class=\"fas fa-times\" id=\"reg-close\"></i>\n");
      out.write("\n");
      out.write("        <form method=\"post\" id=\"registrationForm\"\n");
      out.write("            action=\"");
      out.print( request.getContextPath() );
      out.write("/RegistrationServlet\">\n");
      out.write("            <h3>Register</h3>\n");
      out.write("            <!-- <label for=\"first-name\">First Name:</label> -->\n");
      out.write("            <input type=\"text\" id=\"first-name\" class=\"box\" name=\"first_name\" placeholder=\"First Name\" required>\n");
      out.write("            <!-- <label for=\"last-name\">Last Name:</label> -->\n");
      out.write("            <input type=\"text\" id=\"last-name\" class=\"box\" name=\"last_name\" placeholder=\"Last Name\" required>\n");
      out.write("\n");
      out.write("            <label for=\"birthdate\">Date of Birth:</label>\n");
      out.write("            <input type=\"date\" class=\"box\" id=\"birthdate\" name=\"birthdate\" required>\n");
      out.write("\n");
      out.write("            <label for=\"gender\">Gender:</label>\n");
      out.write("            <select id=\"gender\" class=\"box\" name=\"gender\">\n");
      out.write("                <option value=\"\" disabled selected>Select your gender</option>\n");
      out.write("                <option value=\"male\">Male</option>\n");
      out.write("                <option value=\"female\">Female</option>\n");
      out.write("                <option value=\"other\">Other</option>\n");
      out.write("            </select>\n");
      out.write("\n");
      out.write("            <label for=\"email\">Email:</label>\n");
      out.write("            <input type=\"email\" class=\"box\" id=\"emailInput\" name=\"email\" placeholder=\"example@gmail.com\" required>\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            <label for=\"password\">Password:</label>\n");
      out.write("            <input type=\"password\" class=\"box\" id=\"password\" name=\"password\" required>\n");
      out.write("\n");
      out.write("            <label for=\"confirm-password\">Confirm Password:</label>\n");
      out.write("            <input type=\"password\" class=\"box\" id=\"confirmPassword\" name=\"confirm_password\" required>\n");
      out.write("\n");
      out.write("            <label for=\"terms\">I have read and accept the <a href=\"#\" id=\"terms-link\">Terms and Conditions</a></label>\n");
      out.write("            <input type=\"checkbox\" id=\"terms-checkbox\" required>\n");
      out.write("\n");
      out.write("            <div id=\"terms-modal\" class=\"modal\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <i class=\"fas fa-times\" id=\"close-modal\"></i>\n");
      out.write("                    <h2 style=\"background-color: #ffa500; text-align: center;\">Travel Website Terms and Conditions</h2>\n");
      out.write("                    <!-- Your terms and conditions content here -->\n");
      out.write("                    <p>These Terms and Conditions govern your use of our travel website. By using our website, you agree\n");
      out.write("                        to comply with and be bound by these terms. If you do not agree with these terms, please do not\n");
      out.write("                        use this website.</p>\n");
      out.write("\n");
      out.write("                    <h2>1. Website Use</h2>\n");
      out.write("                    <p>You agree to use this website for lawful purposes only and in a manner that does not violate the\n");
      out.write("                        rights of, or restrict or inhibit the use and enjoyment of this website by any third party.</p>\n");
      out.write("\n");
      out.write("                    <h2>2. User Accounts</h2>\n");
      out.write("                    <p>To access certain features or services on our website, you may need to create a user account. You\n");
      out.write("                        are responsible for maintaining the confidentiality of your account information and for all\n");
      out.write("                        activities that occur under your account.</p>\n");
      out.write("\n");
      out.write("                    <h2>3. Travel Bookings</h2>\n");
      out.write("                    <p>We facilitate travel bookings, but we do not operate, control, or supply travel services. We are\n");
      out.write("                        not responsible for the actions, errors, or omissions of travel service providers. Your bookings\n");
      out.write("                        are subject to their terms and conditions.</p>\n");
      out.write("\n");
      out.write("                    <h2>4. Privacy</h2>\n");
      out.write("                    <p>We collect and use your personal information as described in our Privacy Policy. By using our\n");
      out.write("                        website, you consent to the collection and use of your personal information as described in the\n");
      out.write("                        Privacy Policy.</p>\n");
      out.write("\n");
      out.write("                    <h2>5. Content and Copyright</h2>\n");
      out.write("                    <p>All content on this website, including text, images, logos, and software, is protected by\n");
      out.write("                        copyright and other intellectual property rights. You may not use or reproduce any of our\n");
      out.write("                        content without our express written consent.</p>\n");
      out.write("\n");
      out.write("                    <h2>6. Disclaimer</h2>\n");
      out.write("                    <p>While we make every effort to ensure the accuracy of the information on our website, we do not\n");
      out.write("                        guarantee its accuracy. We are not responsible for any errors, omissions, or misrepresentations\n");
      out.write("                        in the content.</p>\n");
      out.write("\n");
      out.write("                    <h2>7. Changes to Terms</h2>\n");
      out.write("                    <p>We may update these Terms and Conditions at any time. You should review this page periodically to\n");
      out.write("                        ensure you are aware of any changes. Your continued use of the website signifies your acceptance\n");
      out.write("                        of the revised terms.</p>\n");
      out.write("\n");
      out.write("                    <h2>8. Contact Information</h2>\n");
      out.write("                    <p>If you have any questions or concerns about these Terms and Conditions, please contact us at\n");
      out.write("                        [Your Contact Information].</p>\n");
      out.write("\n");
      out.write("                    <p>Last updated: [Date of Last Update]</p>\n");
      out.write("                    <button id=\"accept-terms\" type=\"button\" class=\"btn\">Accept</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <button onclick=\"validatePassword(event)\" id=\"submit-button\" type=\"submit\" class=\"btn\"\n");
      out.write("                disabled>register</button>\n");
      out.write("            <p id=\"error\" style=\"color: red;\"></p>\n");
      out.write("            <p>already have an account? <a href=\"#\" id=\"form-link\">login now</a></p>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    </div>\n");
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
