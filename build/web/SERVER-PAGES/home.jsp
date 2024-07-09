<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
   <meta charset="UTF-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <title>Home</title>

   <link rel="stylesheet" href="https://unpkg.com/aos@next/dist/aos.css" />
   <link rel="stylesheet" href="https://unpkg.com/swiper@8/swiper-bundle.min.css" />
   <!-- font awesome cdn link  -->
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css">
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">

   <!-- custom css file link  -->
   <link rel="stylesheet" href="../css/style.css">
   <link rel="stylesheet" href="../css/media.css">

</head>
<body style="overflow: hidden;">
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
<!--               <script>
                    alert("Something Went Wrong");
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
      <a href="../STATIC-PAGES/login.html" id="login-link">
            <i class="fas fa-user" id="login-icon"></i></a>
            <i class="fas fa-users-times" id="username"></i>
            <div id="signOut" style="display: none; "><a href="../ravel_Booking_System/sessionLogOut"><i class="fas fa-sign-out" id=""></i></a></div>
        
   </div>

   <form action="" class="search-bar-container">
       <input type="search" id="search-bar" placeholder="search here...">
       <label for="search-bar" class="fas fa-search"></label>
   </form>

</header>

<!-- home section starts  -->
<div class="home-bg">

<div class="container home">

   <section class="flex" data-aos-delay="600">

      <div class="content">
         <h3>adventure is worthwhile</h3>
         <p>discover new places with us, adventure awaits</p>
         <a href="#" class="btn">discover more</a>
     </div>

   </section>

</div>


<!-- about section starts  -->

<div class="container about">

    <h1 class="heading" data-aos="zoom-out">Why Choose Us</h1>
 
    <section>
       <div class="grid">
          
          <div class="box" data-aos="fade-up">
             <img src="../images/about-img-1.svg" alt="">
             <h3>easy bookings</h3>
             <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Maiores sed blanditiis.</p>
          </div>
 
          <div class="box" data-aos="fade-up">
             <img src="../images/about-img-2.svg" alt="">
             <h3>travel world</h3>
             <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Maiores sed blanditiis.</p>
          </div>
 
          <div class="box" data-aos="fade-up">
             <img src="../images/about-img-3.svg" alt="">
             <h3>enjoy tours</h3>
             <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Maiores sed blanditiis.</p>
          </div>
 
       </div>
 
    </section>
 
 </div>
 
 <!-- about section ends -->
 
 <!-- reviews section starts  -->
 
 <section class="reviews" id="reviews">

   <h1 class="heading1"> client's reviews</h1>

   <div class="swiper reviews-slider">

       <div class="swiper-wrapper">

           <div class="swiper-slide box">
               <img src="../images/pic-1.png" alt="">
               <h3>john deo</h3>
               <p>Navigating through the website was a breeze. The clean layout and intuitive design made it
                   easy to find the perfect holiday package. Thumbs up for user experienc</p>
               <div class="stars">
                   <i class="fas fa-star"></i>
                   <i class="fas fa-star"></i>
                   <i class="fas fa-star"></i>
                   <i class="fas fa-star"></i>
                   <i class="fas fa-star-half-alt"></i>
               </div>
           </div>

           <div class="swiper-slide box">
               <img src="../images/pic-2.png" alt="">
               <h3>titu </h3>
               <p>Impressed with the diverse range of travel packages available. 
                   From budget-friendly to luxury options, there's something for every traveler. Loved the choices!</p>
               <div class="stars">
                   <i class="fas fa-star"></i>
                   <i class="fas fa-star"></i>
                   <i class="fas fa-star"></i>
                   <i class="fas fa-star"></i>
                   <i class="fas fa-star-half-alt"></i>
               </div>
           </div>

           <div class="swiper-slide box">
               <img src="../images/pic-3.png" alt="">
               <h3>akash </h3>
               <p>Appreciated the detailed information provided for each package. It helped me make an
                   informed decision, knowing exactly what to expect. Will use this service again!</p>
               <div class="stars">
                   <i class="fas fa-star"></i>
                   <i class="fas fa-star"></i>
                   <i class="fas fa-star"></i>
                   <i class="fas fa-star"></i>
                   <i class="fas fa-star-half-alt"></i>
               </div>
           </div>

           <div class="swiper-slide box">
               <img src="../images/pic-4.png" alt="">
               <h3>binoy </h3>
               <p>Navigating through the website was a breeze. The clean layout and intuitive design made it
                   easy to find the perfect holiday package. Thumbs up for user experience!</p>
               <div class="stars">
                   <i class="fas fa-star"></i>
                   <i class="fas fa-star"></i>
                   <i class="fas fa-star"></i>
                   <i class="fas fa-star"></i>
                   <i class="fas fa-star-half-alt"></i>
               </div>
           </div>

           <div class="swiper-slide box">
               <img src="../images/pic-5.png" alt="">
               <h3>kaleen bhaiya</h3>
               <p>Received instant confirmation of my booking, which gave me peace of mind. 
                   The swift response and confirmation process added to the overall positive experience.</p>
               <div class="stars">
                   <i class="fas fa-star"></i>
                   <i class="fas fa-star"></i>
                   <i class="fas fa-star"></i>
                   <i class="fas fa-star"></i>
                   <i class="fas fa-star-half-alt"></i>
               </div>
           </div>

           <div class="swiper-slide box">
               <img src="../images/pic-6.png" alt="">
               <h3>munna bhaiya</h3>
               <p>Appreciated the detailed information provided for each package. It helped me make an
                   informed decision, knowing exactly what to expect. Will use this service again!</p>
               <div class="stars">
                   <i class="fas fa-star"></i>
                   <i class="fas fa-star"></i>
                   <i class="fas fa-star"></i>
                   <i class="fas fa-star"></i>
                   <i class="fas fa-star-half-alt"></i>
               </div>
           </div>


       </div>


   </div>
</section>
 <!-- reviews section ends -->
</div>

<!-- home section ends -->

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
