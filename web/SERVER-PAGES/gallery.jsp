<%-- 
    Document   : gallery
    Created on : 26 Nov, 2023, 1:48:52 AM
    Author     : rakes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
   <meta charset="UTF-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <title>Gallery</title>

   <link rel="stylesheet" href="https://unpkg.com/aos@next/dist/aos.css" />

   <!-- font awesome cdn link  -->
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css">

   <!-- custom css file link  -->
   <link rel="stylesheet" href="../css/style.css">
   <link rel="stylesheet" href="../css/media.css">

</head>
<body>
       <%!
            String vname;
            %>
        <%
            HttpSession sess = request.getSession(false);
            try
        {
            if(sess!=null) 
            {
                vname = sess.getAttribute("FIRST_NAME").toString();
//                votp = sess.getAttribute("otp").toString();
//                vemail = sess.getAttribute("EMAIL").toString();
        %>
            <script>
                document.addEventListener('DOMContentLoaded', function() {
                   var login_icon = document.getElementById('login-icon');
                   var signOut = document.getElementById('signOut');
                   var username = document.getElementById('username');
                   username.innerHTML="<%=vname%>";
                   signOut.style.display="inline-block";   
                   login_icon.style.display="none";
                });
            </script>
        <%
            }
        }catch(Exception ex)
            {
                %>
<!--                <script>
                    alert("Session was not created!!!");
                    alert("Redirecting for logging==>>");
                    location.href="http://localhost:11756/Travel_Booking_System/STATIC-PAGES/login.html";
                </script>-->
        <%  
            }
        %>   
  
 <!-- header section starts  -->

 <header>

   <div id="menu-bar" class="fas fa-bars"></div>

   <a href="#" class="logo"> <span>T</span>ravel</a>

    <nav class="navbar">
      <a href="home.jsp">home</a>
      <a href="packages.jsp">packages</a>
      <a href="services.jsp">services</a>
      <a href="gallery.jsp">gallery</a>
      <a href="contact.jsp">contact</a>
      <a href="about.jsp">about</a>
   </nav>

  <div class="icons">
       <i class="fas fa-search" id="search-btn"></i>
      <a href="STATIC-PAGES/login.html" id="login-link">
            <i class="fas fa-user" id="login-icon"></i></a>
            <i class="fas fa-users-times" id="username"></i>
            <div id="signOut" style="display: none; "><a href="http://localhost:11756/Travel_Booking_System/sessionLogOut"><i class="fas fa-sign-out" id=""></i></a></div>
   </div>

   <form action="" class="search-bar-container">
       <input type="search" id="search-bar" placeholder="search here...">
       <label for="search-bar" class="fas fa-search"></label>
   </form>

</header>

<!-- header section ends -->

<!-- destinations section starts  -->


<div class="container destinations">

   <h1 class="heading" data-aos="zoom-out">destinations</h1>

   <section class="grid">

      <div class="box" data-aos="zoom-in">
         <img src="../images/destination-1.jpg" alt="">
         <h3><span>istanbul</span></h3>
      </div>

      <div class="box" data-aos="zoom-in">
         <img src="../images/destination-2.jpg" alt="">
         <h3><span>california</span></h3>
      </div>

      <div class="box" data-aos="zoom-in">
         <img src="../images/destination-3.jpg" alt="">
         <h3><span>london</span></h3>
      </div>

      <div class="box" data-aos="zoom-in">
         <img src="../images/destination-4.jpg" alt="">
         <h3><span>madrid</span></h3>
      </div>

      <div class="box" data-aos="zoom-in">
         <img src="../images/destination-5.jpg" alt="">
         <h3><span>dubai</span></h3>
      </div>

      <div class="box" data-aos="zoom-in">
         <img src="../images/destination-6.jpg" alt="">
         <h3><span>paris</span></h3>
      </div>

      <div class="box" data-aos="zoom-in">
         <img src="../images/destination-7.jpg" alt="">
         <h3><span>rome</span></h3>
      </div>

      <div class="box" data-aos="zoom-in">
         <img src="../images/destination-8.jpg" alt="">
         <h3><span>sydney</span></h3>
      </div>

      <div class="box" data-aos="zoom-in">
         <img src="../images/destination-9.jpg" alt="">
         <h3><span>china</span></h3>
      </div>

   </section>

</div>


<!-- destinations section ends -->
<!-- footer section  -->

 <section class="footer">

    <div class="box-container">
 
        <div class="box">
            <h3>about us</h3>
            <p>WorldTrips offers a variety of travel medical and trip cancellation insurance plans 
               to meet the needs of individuals, groups, and organizations across the globe.
             or over a years, we've been on a mission to make unexpected travel mishaps and emergencies less stressful for travelers.
           Our travel insurance plans can provide you with financial compensation, access to quality healthcare, and 24/7 
           emergency travel assistance to guide you through the unexpected as you explore the world.</p>
        </div>
        <div class="box">
            <h3>branch locations</h3>
            <a href="#"> india </a>
            <a href="#"> usa </a>
            <a href="#"> japan </a>
            <a href="#"> united kingdom </a>
            <a href="#"> australia </a>
            <a href="#"> portugal </a>
            <a href="#"> brazil </a>
            <a href="#"> dubai </a>
            <a href="#"> italy </a>
            <a href="#"> france </a>
            <a href="#"> germany </a>
        </div>
        <div class="box">
            <h3>quick links</h3>
            <a href="#"> home </a>
            <a href="#"> book </a>
            <a href="#"> packages </a>
            <a href="#"> services </a>
            <a href="#"> gallery </a>
            <a href="#"> review </a>
            <a href="#"> contact </a>
        </div>
        <div class="box">
            <h3>follow us</h3>
            <a href="#"> facebook </a>
            <a href="#"> instagram </a>
            <a href="#"> twitter </a>
            <a href="#"> youtube </a>
            <a href="#"> linkedin </a>
        </div>
 
    </div>
 
    <!-- <h1 class="credit"> credated by <span></span> | all rights reserved! </h1> -->
 
 </section>

<script src="https://unpkg.com/aos@next/dist/aos.js"></script>

<!-- custom js file link  -->
<script src="../js/script.js"></script>

</body>
</html>