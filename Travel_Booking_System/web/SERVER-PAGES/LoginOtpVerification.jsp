<%@page import="oracle.jdbc.OraclePreparedStatement"%>
<%@page import="oracle.jdbc.OracleConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <link rel="stylesheet" href="../css/media.css">
        <link rel="stylesheet" href="../css/style.css">
        <style>
        .Verification-form-container{
    background: url('../images/home-bg.jpg') no-repeat rgba(0,0,0,.5);
    /* position: fixed; */
    top: -120%; left: 0;
    z-index: 10000;
    min-height: 100vh;
    width: 100%;
    /* background: rgba(0, 0, 0, .7); */
    display: flex;
    align-items: center;
    justify-content: center;
}


.Verification-form-container form{
    margin: 2rem;
    padding: 1.5rem 2rem;
    border-radius: .5rem;
    background: #fff;
    width: 50rem;
}

.Verification-form-container form h3{
    font-size: 3rem;
    color: #444;
    text-transform: uppercase;
    text-align: center;
    padding: 1rem 0;
}

.Verification-form-container form .box{
    width: 100%;
    padding: 1rem;
    font-size: 1.7rem;
    color: #333;
    margin: .6rem 0;
    border: .1rem solid rgba(0, 0, 0, .3);
    text-transform: none;
}
.Verification-form-container form input#OTP.box{
    width: 40%;
}

.Verification-form-container form .box:focus{
    border-color: #ffa500;
}

.Verification-form-container form label{
    font-size: 1.5rem;
}

.Verification-form-container form .btn{
    display: block;
    width: 100%;
}

.Verification-form-container form p{
    padding: .5rem 0;
    font-size: 1.5rem;
    color: #666;
}

.Verification-form-container form p a{
    color: #ffa500;
}

.Verification-form-container form p a:hover{
    color: #333;
    text-decoration: underline;
}
.btn{
    display: inline-block;
    margin-top: 1rem;
    background: #ffa500;
    color: #fff;
    padding: .8rem 3rem;
    border: .2rem solid #ffa500;
    cursor: pointer;
    font-size: 1.7rem;
}

.btn:hover{
    background: rgba(255, 165, 0, .2);
    color: #ffa500;
}
    </style>
    
    </head>
    <body>
        
        <%!
            String votp, vemail,vname;
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
            if(request.getParameter("Verify")!=null)
            {
                if(request.getParameter("OTP").equals(votp))
                {
                %>
                <script>
                    alert("OTP verified successfully!!!");
                    location.href="http://localhost:11756/Travel_Booking_System/STATIC-PAGES/loginSuccess.html";
                </script>
                <%
                }
                else
                {
                       %>  
                       <script>
                           document.addEventListener('DOMContentLoaded', function() {
                              var errorElement = document.querySelector('#error');
                           if(errorElement){
                           errorElement.style.display = 'block';
                       }
                            });
                       </script>            
                        <%
                }
}
%>

        
        <!-- Verification form  -->
 
    <div class="Verification-form-container">
   
      <form method="post" action="http://localhost:11756/Travel_Booking_System/SERVER-PAGES/LoginOtpVerification.jsp">
          <h3>Verification</h3>
          <input name="EMAIL" type="email" class="box" placeholder="<%=vemail%>" disabled>
          <h1 style="text-transform: none; font-size: 1.5rem; color: red;" >Please enter the OTP sent to your registered email:</h1>
          <input name="OTP" id="OTP" type="text" class="box">
          <p id="error" style="font-size: 1.5rem; display: none; color:red;">Wrong OTP. Please try again!!!</p>
          <input name="Verify" id="Verify" type="submit" value="Verify now" class="btn">

          <p>Back to login? <a href="http://localhost:11756/Travel_Booking_System/STATIC-PAGES/login.html" >click here</a></p>
      </form>
    </div>
    </body>
</html>
