package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname = request.getParameter("Username");
        String pass = request.getParameter("Password");

        try {
            List<Customer> custDetails = CustomerDBUtil.validateCustomer(uname, pass);
            if (custDetails != null && !custDetails.isEmpty()) {
            	// Create a session and store user information
                HttpSession session = request.getSession();
                session.setAttribute("username", uname); // Storing the username in the session
                session.setAttribute("email", custDetails.get(0).getEmail()); 
                session.setAttribute("custDetails", custDetails); // Optionally store customer details

                request.setAttribute("custDetails", custDetails);
                RequestDispatcher dis = request.getRequestDispatcher("Account.jsp");
                dis.forward(request, response);
            } else {
                // Invalid credentials
                request.setAttribute("errorMessage", "Invalid username or password. Please try again.");
                RequestDispatcher dis = request.getRequestDispatcher("login.jsp");
                dis.forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Optionally forward to an error page
            request.setAttribute("errorMessage", "An error occurred. Please try again later.");
            RequestDispatcher dis = request.getRequestDispatcher("error.jsp");
            dis.forward(request, response);
        }
    }
}
