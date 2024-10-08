<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!-- Coding By CodingNepal - www.codingnepalweb.com -->
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Responsive Website Homepage HTML and CSS | ExpressReserve</title>
    <link rel="stylesheet" href="home.css" />
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
    <section class="hero-section">
      <div class="hero">
        <h2>Online Train Reservation</h2>
		<p>
		  Book your train tickets easily and securely with our system. Experience the convenience of reserving your seats from anywhere, anytime. 
		  Embark on a hassle-free journey with our user-friendly platform designed to meet all your travel needs.
		</p>

        <div class="buttons">
          <a href="#" class="join">Join Now</a>
          <a href="#" class="learn">Learn More</a>
        </div>
      </div>
      <div class="img">
        <img src="train.png" alt="hero image" />
      </div>
    </section>
  </body>
</html>