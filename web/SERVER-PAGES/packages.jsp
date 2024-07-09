
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="oracle.jdbc.OracleResultSetMetaData"%>
<%@page import="oracle.jdbc.OracleResultSet"%>
<%@page import="oracle.jdbc.OraclePreparedStatement"%>
<%@page import="oracle.jdbc.OracleConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
   <meta charset="UTF-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <title>Packages</title>

   <link rel="stylesheet" href="https://unpkg.com/aos@next/dist/aos.css" />
   <link rel="stylesheet" href="https://unpkg.com/swiper@8/swiper-bundle.min.css" />
   <!-- font awesome cdn link  -->
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css">

   <!-- custom css file link  -->
   <link rel="stylesheet" href="../css/style.css">
   <link rel="stylesheet" href="../css/media.css">

   <style>
       :root{
    --main-color:#ff0;
    --light-white:rgba(255,255,255,.5);
    --light-black:rgba(0,0,0,.3);
    --light-bg:rgba(255,255,255,.1);
    --white:#fff;
    --black:#000;
}
.heading{
    font-family: Verdana, Geneva, Tahoma, sans-serif;
   font-size: 7rem;
   color: var(--white);
   text-transform: uppercase;
   text-align: center;
   margin-bottom: 4rem;
   margin-top: 7rem;
}
       /* packages section */

 .packages{
    background: url('../images/tour-bg.jpg') no-repeat rgba(0,0,0,.5);
    background-position: center;
    background-attachment: fixed;
    background-size: cover;
    background-blend-mode: multiply;
 }
 
 .packages .grid{
    display: grid;
    grid-template-columns: repeat(auto-fit, 35rem);
    align-items: flex-start;
    justify-content: center;
    gap: 1.5rem;
 }
 
 .packages .grid .box{
    background-color: var(--light-bg);
    padding: 2rem;
    backdrop-filter: blur(.4rem);
    border-radius: .5rem;
    position: relative;
 }
 
 .packages .grid .box .price{
    position: absolute;
    top: 2.9rem; left: 3rem;
    border-radius: .5rem;
    background: var(--light-black);
    font-size: 1.8rem;
    padding:.8rem 1rem;
 }
 
 .packages .grid .box .price i{
    color: var(--main-color);
    margin-right: .5rem;
 }
 
 .packages .grid .box .price span{
    color: var(--white);
 }
 
 .packages .grid .box .image{
    height: 20rem;
    width: 100%;
    object-fit: cover;
    border-radius: .5rem;
    margin-bottom: 2rem;
 }
 
 .packages .grid .box .name{
    font-size: 2rem;
    color: var(--white);
 }
 
 .packages .grid .box .address{
    font-size: 1.7rem;
    color: var(--light-white);
    line-height: 1.5;
    padding: .5rem 0;
 }
 
 .packages .grid .box:hover{
    background-color: var(--light-black);
 }
 
 .packages .grid .box:hover .price{
    background-color: var(--black);
 }
   </style>
   
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

<!-- packages section starts  -->
<div class="container packages">
<h1 class="heading" data-aos="zoom-out">popular places</h1>
    <section class="grid">
<%! 
     // DECLARING ORACLE OBJECTS AND OTHE
      OracleConnection oconn;
      OraclePreparedStatement ops;
      OracleResultSet ors;
      OracleResultSetMetaData orsmd;
      String imageName, name, location;
      int price, packageId;
    %>
<%
    try{
        DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
      // INSTANTIATING THE CONNECTION
        oconn = (OracleConnection) DriverManager.getConnection("jdbc:oracle:thin:@rakesh:1521:orcl","RAKES", "TRAVEL");
     // INSTANTING THE STATEMENT
        ops = (OraclePreparedStatement)oconn.prepareCall("SELECT PACKAGE_ID,IMAGE_PATH,PRICE,NAME,LOCATION FROM PACKAGES");
     // EXECUTING THE QUERY
        ors = (OracleResultSet)ops.executeQuery();
     // GETTING THE COLUMN INFORMATION
        orsmd = (OracleResultSetMetaData)ors.getMetaData();
        
            while (ors.next()) {
            packageId = ors.getInt("PACKAGE_ID");
            imageName = ors.getString("IMAGE_PATH");
            price = ors.getInt("PRICE");
            name = ors.getString("NAME");
            location = ors.getString("LOCATION");

%>
        <div class="box" data-aos="fade-up">
            <div class="price"><span style="color:orange;">price </span><i class="fas fa-indian-rupee-sign"></i><span><%= price %></span></div>
            <img src="../<%= imageName %>" class="image" alt="">
            <h3 class="name"><%= name %></h3>
            <p class="address"><%= location %></p>
            <a href="booking.jsp?BookId=<%=packageId%>" type="submit" name="BookId" class="btn" onclick="bookNow(<%= packageId %>);">book now</a>
        </div>
<%
    }
%>
</section>
</div>
<%
        ors.close();
        ops.close();
        oconn.close();
} catch (SQLException e) {
        e.printStackTrace();
    }
%>

<!-- PACKAGES section ends -->

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
