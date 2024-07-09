<%@page import="oracle.jdbc.OraclePreparedStatement"%>
<%@page import="oracle.jdbc.OracleConnection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Password Reset Page</title>
        <!-- custom css file link  -->
    <link rel="stylesheet" href="../css/style.css">
    <link rel="stylesheet" href="../css/media.css">
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css">

    </head>
    <body >
        <!-- header section starts  -->

 <header>

   <div id="menu-bar" class="fas fa-bars"></div>

   <a href="#" class="logo"> <span>T</span>ravel</a>

   <nav class="navbar">
       <a href="home.html">home</a>
       <a href="#book">book</a>
       <a href="packages.html">packages</a>
       <a href="services.html">services</a>
       <a href="gallery.html">gallery</a>
       <a href="contact.html">contact</a>
   </nav>

   <div class="icons">
       <i class="fas fa-search" id="search-btn"></i>
      <a href="STATIC-PAGES/login.html" id="login-link">
            <i class="fas fa-user" id="login-btn"></i>
        </a>
   </div>

   <form action="" class="search-bar-container">
       <input type="search" id="search-bar" placeholder="search here...">
       <label for="search-bar" class="fas fa-search"></label>
   </form>

</header>

<!-- header section ends -->
        <%!
            String vname,votp, vemail, vpass;
            OracleConnection oconn;
            OraclePreparedStatement ost;
            %>
        <%
            HttpSession sess = request.getSession(false);
            try
{
            if(sess!=null) 
            {
                vname = sess.getAttribute("FIRST_NAME").toString();
                votp = sess.getAttribute("otp").toString();
                vemail = sess.getAttribute("EMAIL").toString();
            }
}
catch(Exception ex)
{
                %>
                <script>
                    alert("Session was not created!!!");
                    alert("Redirecting for logging==>>");
                    location.href="http://localhost:11756/Travel_Booking_System/STATIC-PAGES/ValidateEmail.html";
                </script>
                <%  
}
%>
<%
            if(request.getParameter("verify")!=null)
            {

                if(request.getParameter("OTP").equals(votp))
                {
                    vpass = request.getParameter("cPASS");
//                    vemail = sess.getAttribute("email").toString();
          try{
                   DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
                   oconn = (OracleConnection)DriverManager.getConnection("jdbc:oracle:thin:@Rakesh:1521:orcl","RAKES","TRAVEL");
                   ost =(OraclePreparedStatement) oconn.prepareStatement("update USERS set  PASSWORD=? where EMAIL=?");
                   ost.setString(1, vpass);
                   ost.setString(2, vemail);
                   int x = ost.executeUpdate();
                   ost.close();
                   oconn.close();
                   if(x>0){
                %>
                <script>
                    alert("Password updated successfully!!! Please login to continue.");
                    location.href="http://localhost:11756/Travel_Booking_System/STATIC-PAGES/login.html";
                </script>
                <%
                    }else{
                 %>
                 <h3 style="color:red">Failed to update password. Please try again!!!</h3> 
                 <%
                    }
                    ost.close();
                    oconn.close();
                }catch(Exception ex){
                %>
                <h3 style="color:red">Error updating password. Please try again!!!</h3>
                <%
                }
}else
                {
                       %> 
                       <h3 style="color:red">Wrong OTP. Please try again!!!</h3>                 
                        <%
                }
}
                   %>

        <!-- forgot password form  -->

 <div class="forpass-form-container">

    <i class="fas fa-times" id="forpass-close"></i>
 
    <form method="post" action="http://localhost:11756/Travel_Booking_System/SERVER-PAGES/ForgotLogin.jsp"onsubmit="return validateForm()">
        <h3 style="text-align: center; padding-bottom: 1px;">Password reset</h3>
        <h2 style="text-align: center; color: red">Please verify your security credentials</h2>
        <br>
        <label for="email">Your Registered Email:</label>
        <input type="tel" class="box" id="Email" name="email" placeholder="<%=vemail%>" disabled/>
        <br> 
        <br>  
        <label for="otp">Enter OTP:</label>
        <br>
        <input type="text" class="box" id="otp" name="OTP" required>
        <label for="password">Enter your new password:</label>
        <input name="PASS" id="forPass" type="password" class="box" placeholder="Password" required>
        <label for="confirm-password">Confirm your new password:</label>
        <input name="cPASS" id="conPass" type="password" class="box" placeholder="Confirm password" required>
        <p id="error-message" style="color: red; display: none;">Passwords do not match.</p>
        <input onclick="validateForm()" type="submit" name="verify" value="confirm" class="btn">
    </form>
  </div>
        
<script>
    function validateForm() {
        var newPassword = document.getElementById("forPass").value;
        var confirmPassword = document.getElementById("conPass").value;

        if (newPassword !== confirmPassword) {
            document.getElementById("error-message").style.display = "block";
            return false;
        } else {
            document.getElementById("error-message").style.display = "none";
            return true;
        }
    }

</script>

    </body>
</html>