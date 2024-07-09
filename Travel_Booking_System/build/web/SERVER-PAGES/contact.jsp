<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
   <meta charset="UTF-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <title>Contact</title>

   <link rel="stylesheet" href="https://unpkg.com/aos@next/dist/aos.css" />
   <link rel="stylesheet" href="https://unpkg.com/swiper@8/swiper-bundle.min.css" />

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

<!-- contact section starts  -->

<div class="container contact">

   <h1 class="heading" data-aos="zoom-out">contact us</h1>

   <section>

      <div class="row">

         <iframe class="map" src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d15077.086614958938!2d72.83608960687518!3d19.13958260781318!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3be7b63aceef0c69%3A0x2aa80cf2287dfa3b!2sJogeshwari%20West%2C%20Mumbai%2C%20Maharashtra%20400047!5e0!3m2!1sen!2sin!4v1672939645362!5m2!1sen!2sin" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade" data-aos="flip-left"></iframe>

         <form action="http://localhost:11756/Travel_Booking_System/contactUs" method="post" data-aos="flip-right">
            <h3>Customer Support 24/7</h3>
            <input type="text" name="name" required maxlength="50" placeholder="enter your name" class="box" >
            <input type="email" name="email" required maxlength="50" placeholder="enter your email" class="box" >
            <input type="number" name="number" required maxlength="10" min="0" max="9999999999" placeholder="enter your number" class="box">
            <textarea name="message" class="box" required maxlength="1000" cols="30" rows="10" ></textarea>
            <input type="submit" value="send message" name="send" class="btn">
         </form>

      </div>

      <div class="grid">

         <div class="box" data-aos="fade-up">
            <i class="fas fa-phone"></i>
            <h3>phone number</h3>
            <a href="tel:7998303710">+91 7998303710</a>
            <a href="tel:7363856709">+91 7363856709</a>
         </div>

         <div class="box" data-aos="fade-up">
            <i class="fas fa-envelope"></i>
            <h3>email address</h3>
            <a href="rakes.sardar.12@gmail.com">rakes.sardar.12@gmail.com</a>
            <a href="avikbose916@gmail.com">avikbose916@gmail.com</a>
         </div>

         <div class="box" data-aos="fade-up">
            <i class="fas fa-map-marker-alt"></i>
            <h3>office address</h3>
            <a href="#">flat no. 01, a-1, jogeshwari, mumbai, india - 400104</a>
         </div>

      </div>

      <!-- <div class="credit">
         &copy; copyright @ 2023 by <span></span> | all rights reserved!
      </div> -->

   </section>

</div>
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
<script src="https://unpkg.com/swiper@8/swiper-bundle.min.js"></script>
<!-- custom js file link  -->
<script src="../js/script.js"></script>

</body>
</html>