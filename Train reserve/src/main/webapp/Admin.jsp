<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin - Online Train Reservation System</title>
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
            width: 80%;
            border-radius: 8px;
            padding: 30px;
            text-align: center;
            border: 1px solid rgba(255, 255, 255, 0.5);
            backdrop-filter: blur(8px);
            -webkit-backdrop-filter: blur(8px);
            margin-top: 80px;
        }

        h2 {
            font-size: 2rem;
            margin-bottom: 20px;
            color: #fff;
        }

        /* Table styles */
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
            color: #fff;
        }

        th, td {
            padding: 12px;
            text-align: left;
            border-bottom: 1px solid rgba(255, 255, 255, 0.2);
        }

        th {
            background-color: rgba(255, 255, 255, 0.2);
            color: #fff;
        }

        tr:hover {
            background-color: rgba(255, 255, 255, 0.1);
        }
        
        /* Scrollable table body */
        .table-container {
            max-height: 450px; /* Adjust height as needed */
            overflow-y: auto; /* Enable vertical scrolling */
            border: 1px solid #ddd; /* Optional border around the table */
            margin-top: 10px; /* Add margin above the table */
        }
		.action-btn {
			    padding: 12px 20px; /* Increased padding for a larger button */
			    border: none; /* Remove default border */
			    border-radius: 5px; /* Rounded corners */
			    cursor: pointer; /* Pointer cursor on hover */
			    font-size: 16px; /* Increased font size */
			    margin: 5px 10px; /* Space between buttons */
			    transition: background-color 0.3s ease, transform 0.2s ease; /* Smooth transitions */
			    box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2); /* Subtle shadow */
			}
			
			/* Resolve button */
			.update-btn {
			    background-color: #007bff; /* Blue background for update */
			    color: white; /* White text */
			}
			
			.update-btn:hover {
			    background-color: #0056b3; /* Darker blue on hover */
			    transform: translateY(-2px); /* Lift effect on hover */
			}
			
			/* Delete button */
			.delete-btn {
			    background-color: #dc3545; /* Red background for delete */
			    color: white; /* White text */
			}
			
			.delete-btn:hover {
			    background-color: #c82333; /* Darker red on hover */
			    transform: translateY(-2px); /* Lift effect on hover */
			}
			
			/* Additional hover effects */
			.action-btn:hover {
			    box-shadow: 0 4px 10px rgba(0, 0, 0, 0.3); /* Shadow on hover */
			}        

        /* Make the table responsive */
        @media (max-width: 600px) {
            table {
                display: block;
                overflow-x: auto;
                white-space: nowrap;
            }
        }

        /* Hamburger menu styles */
        #menu-toggle {
            display: none;
        }

        #hamburger-btn {
            font-size: 1.8rem;
            color: #fff;
            cursor: pointer;
            display: none;
            order: 1;
        }

        @media screen and (max-width: 1023px) {
            .navbar .logo a {
                font-size: 1.5rem;
            }

            .links {
                position: fixed;
                left: -100%;
                top: 75px;
                width: 100%;
                height: 100vh;
                padding-top: 50px;
                background: #175d69;
                flex-direction: column;
                transition: 0.3s ease;
            }

            .navbar #menu-toggle:checked ~ .links {
                left: 0;
            }

            .navbar #hamburger-btn {
                display: block;
            }

            .header .buttons {
                display: none;
            }
			
        }
    </style>
</head>
<body>
    <header class="header">
        <nav class="navbar">
            <h2 class="logo"><a href="#">ExpressReserve</a></h2>
            <input type="checkbox" id="menu-toggle" />
            <label for="menu-toggle" id="hamburger-btn">
                <svg xmlns="http://www.w3.org/2000/svg" height="24" viewBox="0 0 24 24" width="24">
                    <path d="M3 12h18M3 6h18M3 18h18" stroke="currentColor" stroke-width="2" stroke-linecap="round"/>
                </svg>
            </label>
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
        <h2>Admin Dashboard</h2>
        <div class="table-container">
            <table>
                <thead>
                    <tr>
                        <th>Passenger Name</th>
                        <th>Email Address</th>
                        <th>Complaint Type</th>
                        <th>Complaint Description</th>
                        <th>Status</th>
                        <th>Action</th> <!-- Corrected here -->
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="contact" items="${contactDetails}">
                        <tr>
                            <td>${contact.username}</td>
                            <td>${contact.email}</td>
                            <td>${contact.complainType}</td>
                            <td>${contact.complain}</td>
                            <td>${contact.status}</td>
                            <td>
							    <!-- Resolve button with form to update the status -->
							    <form action="update" method="post" style="display:inline;">
							        <input type="hidden" name="id" value="${contact.id}">
							        <input type="hidden" name="username" value="${contact.username}">
							        <button type="submit" class="action-btn update-btn">Resolve</button>
							    </form>
							
							    <!-- Delete button -->
							    <form action="delete" method="post" style="display:inline;">
							        <input type="hidden" name="id" value="${contact.id}">
							        <button type="submit" class="action-btn delete-btn">Delete</button>
							    </form>
							</td>
							
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>
