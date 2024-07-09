<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
   <meta charset="UTF-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <title>About</title>

   <link rel="stylesheet" href="https://unpkg.com/aos@next/dist/aos.css" />

   <!-- font awesome cdn link  -->
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css">

   <!-- custom css file link  -->
   <link rel="stylesheet" href="../css/style.css">
   <link rel="stylesheet" href="../css/media.css">
   <style>
       .about{
    background: url('../images/about-bg.jpg') no-repeat rgba(0,0,0,.5);
    background-position: center;
    background-attachment: fixed;
    background-size: cover;
    background-blend-mode: multiply;
 }
 
 .about .details{
    border-radius: .5rem;
    background: url('../images/details-bg.jpg') no-repeat rgba(0,0,0,.5);
    background-position: center;
    background-attachment: fixed;
    background-size: cover; 
    display: flex;
    align-items: center;
    justify-content: center;
    padding: 2rem;
    min-height: 60vh;
    border-radius: .5rem;
 }
 .about .details .box{
    width: 95rem;
    background-color: var(--light-bg);
    padding:3rem 2rem;
    text-align: justify;
    backdrop-filter: blur(.4rem);
    border-radius: .5rem;
 }
 
   </style>

</head>
<body>
   
<!-- header section starts  -->

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
            <div id="signOut" style="display: none; "><a href="http://localhost:11756/Travel_Booking_System/sessionLogOut"><i class="fas fa-sign-out" id=""></i></a></div>
        
   </div>

   <form action="" class="search-bar-container">
       <input type="search" id="search-bar" placeholder="search here...">
       <label for="search-bar" class="fas fa-search"></label>
   </form>

</header>

<!-- header section ends -->

   <!-- about section starts  -->

   <div class="container about">

      <h1 class="heading" data-aos="zoom-out">about us</h1>

      <section>

         <div class="details">
            <div class="box" data-aos="zoom-in">
               <h3 style="text-align: center;">About us</h3>
               <p>At Our Travel Booking Website, we pride ourselves on delivering an unparalleled experience to our customers. 
                   Here are just a few reasons why you should choose us:
                   <br>                   
• We understand the importance of personalization and customization in the travel industry. That's why our booking system allows 
you to easily customize your bookings to suit your specific needs and preferences.<br>
• Our 24/7 customer support ensures that you never have to worry about finding assistance when you need it most. Our support team is trained to handle any
query you may have, whether it's related to your booking or any other travel-related matter.<br>
• Our dedicated team of travel agents ensures that your bookings are handled with care and precision.<br>
• Our commitment to ethical and responsible tourism means that we prioritize sustainable travel practices, 
promoting eco-friendly options and supporting local communities wherever possible.
   </p>
               <div style="text-align: center;"><a href="contact.jsp" class="btn">contact us</a></div>
            </div>
         </div>
      </section>

   </div>

   <!-- about section ends -->
   
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