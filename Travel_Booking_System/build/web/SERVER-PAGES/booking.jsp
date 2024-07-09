<%-- 
    Document   : booking
    Created on : 24 Nov, 2023, 10:52:26 AM
    Author     : rakes
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="oracle.jdbc.OracleResultSetMetaData"%>
<%@page import="oracle.jdbc.OracleResultSet"%>
<%@page import="oracle.jdbc.OraclePreparedStatement"%>
<%@page import="oracle.jdbc.OracleConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Travel</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="" name="keywords">
    <meta content="" name="description">

    <!-- font awesome cdn link  -->
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
    
    <!--Stylesheet -->
    <link href="..\css\style.css" rel="stylesheet">
    <link href="..\css\media.css" rel="stylesheet">
    <style>
        section{
            padding: 7rem 9%;
        }
        select{
            width: 100%;
                   padding: 1rem;
                   font-size: 1.7rem;
                   color: #333;
                   margin: .6rem 0;
                   border: .1rem solid rgba(0, 0, 0, .3);
                  text-transform: none;
        }
        .book .row{
    display: flex;
    flex-wrap: wrap;
    gap: 1.5rem;
    align-items: center;
}

.book .row .image{
    flex: 1 1 40rem;
}

.book .row .image img{
    width: 100%;
}

.book .row form{
    flex: 1 1 40rem;
    padding: 2rem;
    box-shadow: 0 1rem 2rem rgba(0, 0, 0, .1);
    border-radius: .5rem;
}

.book .row form .inputBox{
    padding: .5rem 0;
}

.book .row form .inputBox input{
    width: 100%;
    padding: 1rem;
    border: .1rem solid rgba(0, 0, 0, .1);
    font-size: 1.7rem;
    color: #333;
    text-transform: none;
}

.book .row form .inputBox h3{
    font-size: 2rem;
    padding: 1rem 0;
    color: #666;
}
.Box h3{
    font-size: 2rem;
    padding: 1rem 0;
    color: #666;
}
label{
    font-size: 1.5rem;
}
  </style>
</head>

<body>
    

    <!-- Navbar & Hero Start -->
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
            <i class="fas fa-user" id="login-btn"></i>
        </div>
     
        <form action="" class="search-bar-container">
            <input type="search" id="search-bar" placeholder="search here...">
            <label for="search-bar" class="fas fa-search"></label>
        </form>
     
     </header>


 <!-- book section  -->
<section class="book" id="book">
     
   <h1 class="heading">
            <span>b</span>
            <span>o</span>
            <span>o</span>
            <span>k</span>
            <span class="space"></span>
            <span>n</span>
            <span>o</span>
            <span>w</span>
        </h1>

    <div class="row">
    
        <div class="image">
            <!-- Your package image or default image goes here -->
            <img src="../images/book-img.svg" alt="">
        </div>
        
        <%! 
     // DECLARING ORACLE OBJECTS AND OTHE
      OracleConnection oconn;
      OraclePreparedStatement ops;
      OracleResultSet ors;
      OracleResultSetMetaData orsmd;
      String imageName, packageName, packageDesc, bookId;
      String price, packageId;
    %>
<%
    bookId = request.getParameter("BookId");
//    if(bookId!=null){
    try{
        DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
      // INSTANTIATING THE CONNECTION
        oconn = (OracleConnection) DriverManager.getConnection("jdbc:oracle:thin:@rakesh:1521:orcl","RAKES", "TRAVEL");
     // INSTANTING THE STATEMENT
        ops = (OraclePreparedStatement)oconn.prepareCall("SELECT PRICE,NAME FROM PACKAGES WHERE PACKAGE_ID = ?");
        
        ops.setString(1,bookId);
     // EXECUTING THE QUERY
        ors = (OracleResultSet)ops.executeQuery();
     // GETTING THE COLUMN INFORMATION
        orsmd = (OracleResultSetMetaData)ors.getMetaData();
        
            while (ors.next()) {
//            packageId = ors.getInt("PACKAGE_ID");
//            imageName = ors.getString("IMAGE_PATH");
            price = ors.getString("PRICE");
            packageName = ors.getString("NAME");

            

%>


   
        <form action="http://localhost:11756/Travel_Booking_System/booking" method="post">
            <div class="inputBox">
                <h3>Package Name</h3>
                <div style="display: none;">
                <input name="pkgId" value="<%=bookId%>" >
                </div>
                 <select  name="packageName" class="box">         
            <option value="" ><%=packageName%></option> 
            </select>
            </div>         
            <div class="Box">    
                <h3>Package Details</h3>
                <input type="checkbox" value="" >
                <label>Comfortable Accommodations</label><br>
                <input type="checkbox" value="" >
                <label>Guided Tours To Key Attractions</label><br>
                <input type="checkbox" value="" >
                <label>Meals Included</label><br>
                <input type="checkbox" value="" >
                <label>Balanced Mix Of Free Time And Planned Activities</label>
            </div>
            <div class="inputBox">
                <h3>Price</h3>
                <input name="packagePrice" type="text" value="<%=price%>"readonly>
            </div>
            <div class="inputBox">
                <h3>Arrival Date</h3>
                <input type="date" name="arrivalDate">
            </div>

            <div class="inputBox">
                <h3>Departure Date</h3>
                <input type="date" name="departureDate">
            </div>

            <input type="submit" class="btn" value="Book Now" >
        </form>
                     <%
    }
        ors.close();
        ops.close();
        oconn.close();
} catch (SQLException e) {
        e.printStackTrace();
    }
//}
%>
</div>
    
  
</section>

<!-- footer section  -->

 <section class="footer">

   <div class="box-container">

       <div class="box">
           <h3>about us</h3>
           <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Quia necessitatibus cumque eius vero
               nesciunt consequatur sit amet mollitia nostrum tempore ab eum numquam, maiores rerum qui maxime
               totam fuga! Voluptates molestiae mollitia repudiandae asperiores quibusdam aperiam laudantium vitae
               fugit ex.</p>
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
    <!-- Template Javascript -->
<!--    <script src="..\js\script.js"></script>-->
</body>

</html>