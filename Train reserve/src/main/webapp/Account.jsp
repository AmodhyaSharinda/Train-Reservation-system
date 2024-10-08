<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Account - Online Train Reservation System</title>
    <link rel="stylesheet" href="home.css">
    <style>
        /* Importing Google font - Open Sans */
        @import url("https://fonts.googleapis.com/css2?family=Open+Sans:wght@300;400;500;600;700&display=swap");

        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: "Open Sans", sans-serif;
        }

        body {
            display: flex;
            align-items: center;
            justify-content: center;
            min-height: 100vh;
            width: 100%;
            padding: 0 10px;
            background: linear-gradient(to bottom, #175d69 23%, #330c43 95%);
            position: relative;
        }

        .header {
            position: fixed;
            top: 0;
            left: 0;
            width: 100%;
            z-index: 1; /* Ensure header is on top */
        }

        .navbar {
            display: flex;
            align-items: center;
            justify-content: space-between;
            max-width: 1200px;
            margin: 0 auto;
            padding: 20px 15px;
        }

        .navbar .logo a {
            font-size: 1.8rem;
            text-decoration: none;
            color: #fff;
        }

        .navbar .links {
            display: flex;
            align-items: center;
            list-style: none;
            gap: 35px;
        }

        .navbar .links a {
            font-weight: 500;
            text-decoration: none;
            color: #fff;
            padding: 10px 0;
            transition: 0.2s ease;
        }

        .navbar .links a:hover {
            color: #47b2e4;
        }

        .navbar .buttons a {
            text-decoration: none;
            color: #fff;
            font-size: 1rem;
            padding: 15px 0;
            transition: 0.2s ease;
        }

        .navbar .buttons a:not(:last-child) {
            margin-right: 30px;
        }

        .navbar .buttons .signin:hover {
            color: #47b2e4;
        }

        .navbar .buttons .signup {
            border: 1px solid #fff;
            padding: 10px 20px;
            border-radius: 0.375rem;
            text-align: center;
            transition: 0.2s ease;
        }

        .navbar .buttons .signup:hover {
            background-color: #47b2e4;
            color: #fff;
        }

        .wrapper {
            width: 450px;
            border-radius: 8px;
            padding: 30px;
            text-align: center;
            border: 1px solid rgba(255, 255, 255, 0.5);
            backdrop-filter: blur(8px);
            -webkit-backdrop-filter: blur(8px);
            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.2);
            background-color: rgba(255, 255, 255, 0.1);
        }

        h2 {
            font-size: 2rem;
            margin-bottom: 20px;
            color: #fff;
        }

        .detail {
            margin: 15px 0;
            color: #fff;
            font-size: 1.2rem;
            text-align: left;
            padding: 10px;
            border-radius: 5px;
            background-color: rgba(255, 255, 255, 0.1);
            transition: background-color 0.3s ease;
        }

        .detail:hover {
            background-color: rgba(255, 255, 255, 0.2);
        }

        .edit-button {
            margin-top: 20px;
            background: #fff;
            color: #000;
            font-weight: 600;
            border: none;
            padding: 12px 20px;
            cursor: pointer;
            border-radius: 3px;
            font-size: 16px;
            transition: 0.3s ease;
        }

        .edit-button:hover {
            color: #fff;
            background: rgba(255, 255, 255, 0.15);
        }
    </style>
</head>
<body>
    <header class="header">
        <nav class="navbar">
            <h2 class="logo"><a href="#">ExpressReserve</a></h2>
            <ul class="links">
                <li><a href="home.jsp">Home</a></li>
                <li><a href="#">Services</a></li>
                <li><a href="#">Book Now</a></li>
                <li><a href="ContactUs.jsp">FeedBack</a></li>
                <li><a href="account.html">Account</a></li>
            </ul>
            <div class="buttons">
	          <a href="login.jsp" class="signup">Sign In</a>
	          <a href="AdminLogin.jsp" class="signup">Admin</a>
            </div>
        </nav>
    </header>

    <div class="wrapper">
        <h2>Your Account Details</h2>
        <c:forEach var="cus" items="${custDetails}">
            <div class="detail">Name: <span id="customerName">${cus.name}</span></div>
            <div class="detail">Email: <span id="customerEmail">${cus.email}</span></div>
            <div class="detail">Phone: <span id="customerPhone">${cus.phone}</span></div>
            <div class="detail">Username: <span id="customerUsername">${cus.username}</span></div>
        </c:forEach>
        
        <form action="Logout" method="get">
		    <button class="edit-button" type="submit" class="logout-button">Logout</button>
		</form>
        
    </div>
</body>
</html>
