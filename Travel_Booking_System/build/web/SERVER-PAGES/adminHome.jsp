<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Home</title>
    <!-- Add your CSS links here -->
    <style>
        body {
            background-image: url('../images/admin.jpg');
            font-family: 'Nunito', sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }

        header {
            background-color: #333;
            color: white;
            text-align: center;
            padding: 1rem;
        }

        nav {
            background-color: #444;
            padding: 1rem;
        }

        ul {
            list-style: none;
            margin: 0;
            padding: 0;
        }

        li {
            display: inline-block;
            margin-right: 20px;
        }

        a {
            text-decoration: none;
            color: #fff;
            font-weight: bold;
        }

        a:hover {
            color: #ffcc00;
        }

        footer {
            background-color: #333;
            color: white;
            text-align: center;
            padding: 1rem;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
    </style>
</head>
<body>

    <header>
        <h1>Welcome, Admin!</h1>
    </header>

    <nav>
        <ul>
            <li><a href="http://localhost:11756/Travel_Booking_System/SERVER-PAGES/allUserDetails.jsp">All User Details</a></li>
            <li><a href="http://localhost:11756/Travel_Booking_System/SERVER-PAGES/ManagePakages.jsp">Manage Packages</a></li>
            <li><a href="http://localhost:11756/Travel_Booking_System/SERVER-PAGES/booking_data.jsp">Booking Data</a></li>
            <!-- Add more links as needed -->
        </ul>
    </nav>


</body>
</html>