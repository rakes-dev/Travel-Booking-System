<%-- 
    Document   : services
    Created on : 26 Nov, 2023, 1:48:07 AM
    Author     : rakes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Services</title>

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
    <br><br><br><br><br>
    <!-- services section  -->

    <section class="services" id="services">

        <h1 class="heading">
            <span>s</span>
            <span>e</span>
            <span>r</span>
            <span>v</span>
            <span>i</span>
            <span>c</span>
            <span>e</span>
            <span>s</span>
        </h1>

        <div class="box-container">

            <div class="box">
                <i class="fas fa-hotel"></i>
                <h3>affordable hotels</h3>
                <p>Finding a comfortable place to stay doesn't have to break the bank. Our travel services include a curated 
                    selection of affordable hotels, ensuring you have a pleasant and budget-friendly
                    accommodation experience. From cozy inns to modern budget hotels, we've got you covered.</p>
            </div>
            <div class="box">
                <i class="fas fa-utensils"></i>
                <h3>food and drinks</h3>
                <p>Experience the local flavors and culinary delights of each destination with our food and drinks service. 
                    Discover the best local restaurants, street food vendors, and hidden gems, ensuring you savor the essence of the region.
                    From international cuisine to authentic local dishes, embark on a gastronomic journey with us.</p>
            </div>
            <div class="box">
                <i class="fas fa-bullhorn"></i>
                <h3>safety guide</h3>
                <p>Your safety is our top priority. Our safety guide service provides valuable information
                    on the security measures and precautions you should take during your travels.
                    Stay informed about local safety guidelines, emergency contacts, and travel
                    advisories to ensure a secure and worry-free journey.</p>
            </div>
            <div class="box">
                <i class="fas fa-globe-asia"></i>
                <h3>around the world</h3>
                <p>Explore the world with ease through our "Around the World" service. Whether you're planning a multi-country tour or a global adventure,
                    we offer comprehensive travel solutions. From visa assistance to itinerary planning,
                    make your dream of traveling around the world a reality with our expert guidance.</p>
            </div>
            <div class="box">
                <i class="fas fa-plane"></i>
                <h3>fastest travel routes</h3>
                <p>Save time and reach your destination efficiently with our fastest travel routes service. 
                    We analyze and provide you with the quickest transportation options, whether by air, land, or sea.
                    Optimize your travel time and enjoy more moments at your destination with our route planning expertise.</p>
            </div>
            <div class="box">
                <i class="fas fa-hiking"></i>
                <h3>adventures</h3>
                <p>For thrill-seekers and adventure enthusiasts, our adventure service opens up a world of exciting possibilities. Discover adrenaline-pumping
                    activities such as hiking, water sports, and extreme sports at various destinations. 
                    Unleash your adventurous spirit and create unforgettable memories with our tailored adventure experiences.</p>
            </div>

        </div>
        <br><br><br><br><br>
        <h1 class="heading1" ><a href="../STATIC-PAGES/feedback.html">Share your experience👈</a></h1>
    </section>
    
    
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
</body>

</html>