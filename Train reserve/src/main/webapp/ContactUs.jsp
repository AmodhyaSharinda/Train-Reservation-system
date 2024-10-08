<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Feedback - Online Train Reservation System</title>
    <link rel="stylesheet" href="home.css">
    <style>
        /* Existing styles retained */
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

        .wrapper {
            width: 500px;
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

        /* General styles */
.input-field {
    position: relative;
    margin: 20px 0;
    padding: 3px;
    background: rgba(255, 255, 255, 0.1);
    border-radius: 8px;
    transition: background 0.3s ease;
    margin-top: 30px;
}

.input-field label {
    position: absolute;
    top: 50%;
    left: 10px;
    transform: translateY(-50%);
    color: rgba(255, 255, 255, 0.7);
    font-size: 16px;
    pointer-events: none;
    transition: 0.2s ease;
}

/* Style adjustments for the input, textarea, and select */
.input-field input,
.input-field textarea,
.input-field select {
    width: 100%;
    background: transparent;
    border: none;
    outline: none;
    font-size: 16px;
    padding: 10px;
    color: #fff;
}

/* Textarea specific styles */
.input-field textarea {
    height: 120px;
    resize: none;
}

/* Focus styles */
.input-field input:focus,
.input-field textarea:focus,
.input-field select:focus {
    background: rgba(255, 255, 255, 0.3);
    box-shadow: 0 0 5px rgba(255, 255, 255, 0.5);
}

/* Styles to keep label elevated */
.input-field input:focus ~ label,
.input-field input:valid ~ label,
.input-field textarea:focus ~ label,
.input-field textarea:valid ~ label,
.input-field select:focus ~ label,
.input-field select:valid ~ label,
.input-field input:not(:placeholder-shown) ~ label,
.input-field textarea:not(:placeholder-shown) ~ label,
.input-field select:not(:placeholder-shown) ~ label {
    top: -10px;
    font-size: 0.85rem;
    color: #fff;
}

.input-field select option {
    background: rgba(0, 0, 0, 0.9); /* Darker background for options */
    color: #fff; /* Text color for options */
}

/* Button styles */
button {
    width: 100%;
    padding: 12px;
    background-color: #fff;
    color: #4e54c8;
    font-weight: bold;
    border: none;
    border-radius: 30px;
    cursor: pointer;
    transition: background 0.3s ease;
}

button:hover {
    background-color: #8f94fb;
    color: #fff;
    box-shadow: 0 4px 20px rgba(143, 148, 251, 0.5);
}



    </style>
</head>
<body>
    <!-- Header section with navigation -->
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

    <!-- Middle section for feedback form -->
    <div class="wrapper">
        <h2>Submit Feedback or Complaint</h2>
        <form action="ContactUs" method="post">
		    <div class="input-field">
			    <input type="text" name="PassengerName" required autocomplete="off" value="<%= session.getAttribute("username") != null ? session.getAttribute("username") : "" %>" readonly>
			    <label>Passenger Name</label>
			</div>
		    <div class="input-field">
		    	<input type="text" name="PassengerEmail" required autocomplete="off" value="<%= session.getAttribute("email") != null ? session.getAttribute("email") : "" %>" readonly>
			    <label>Passenger Name</label>
		    </div>
		    <div class="input-field">
		        <select id="complaintType" name="complaintType" required>
		            <option value="">Select Complaint Type</option>
		            <option value="Train Services">Train Services</option>
		            <option value="Station Facilities">Station Facilities</option>
		            <option value="Staff Behavior">Staff Behavior</option>
		        </select>
		        <label>Complaint Type</label>
		    </div>
		    <div class="input-field">
		        <textarea id="complaintDescription" name="Feedback" required></textarea>
		        <label>Complaint Description</label>
		    </div>
		    <button type="submit">Submit</button>
		</form>

    </div>

</body>
</html>
