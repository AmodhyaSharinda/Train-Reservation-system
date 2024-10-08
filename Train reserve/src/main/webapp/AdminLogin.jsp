<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login - Online Train Reservation System</title>
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
            width: 400px;
            border-radius: 8px;
            padding: 30px;
            text-align: center;
            border: 1px solid rgba(255, 255, 255, 0.5);
            backdrop-filter: blur(8px);
            -webkit-backdrop-filter: blur(8px);
        }

        form {
            display: flex;
            flex-direction: column;
        }

        h2 {
            font-size: 2rem;
            margin-bottom: 20px;
            color: #fff;
        }

        .input-field {
            position: relative;
            border-bottom: 2px solid #ccc;
            margin: 15px 0;
        }

        .input-field label {
            position: absolute;
            top: 50%;
            left: 0;
            transform: translateY(-50%);
            color: #fff;
            font-size: 16px;
            pointer-events: none;
            transition: 0.15s ease;
        }

        .input-field input {
            width: 100%;
            height: 40px;
            background: transparent;
            border: none;
            outline: none;
            font-size: 16px;
            color: #fff;
        }

        .input-field input:focus~label,
        .input-field input:valid~label {
            font-size: 0.8rem;
            top: 10px;
            transform: translateY(-120%);
        }

        .forget {
            display: flex;
            align-items: center;
            justify-content: space-between;
            margin: 25px 0 35px 0;
            color: #fff;
        }

        #remember {
            accent-color: #fff;
        }

        .forget label {
            display: flex;
            align-items: center;
        }

        .forget label p {
            margin-left: 8px;
        }

        .wrapper a {
            color: #efefef;
            text-decoration: none;
        }

        .wrapper a:hover {
            text-decoration: underline;
        }

        button {
            background: #fff;
            color: #000;
            font-weight: 600;
            border: none;
            padding: 12px 20px;
            cursor: pointer;
            border-radius: 3px;
            font-size: 16px;
            border: 2px solid transparent;
            transition: 0.3s ease;
        }

        button:hover {
            color: #fff;
            border-color: #fff;
            background: rgba(255, 255, 255, 0.15);
        }

        .register {
            text-align: center;
            margin-top: 30px;
            color: #fff;
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
        <h2>Login to Your Account</h2>
        <form action="AdminLogin" method="post">
            <div class="input-field">
                <input type="text" name="Username" required autocomplete="off">
                <label>Username</label>
            </div>
            <div class="input-field">
                <input type="password" name="Password" required>
                <label>Password</label>
            </div>
            <button type="submit">Login</button>
        </form>

        <div class="forget">
            <a href="#">Forgot your password?</a>
        </div>
        <p class="register">New to Train Service? <a href="#">Register here</a></p>
    </div>
</body>
</html>
