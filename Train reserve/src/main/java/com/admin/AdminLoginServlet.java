package com.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.customer.Contact;

@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname = request.getParameter("Username");
        String pass = request.getParameter("Password");

        try {
            List<Admin> adminDetails = AdminDBUtil.validateAdmin(uname, pass);
            if (adminDetails != null && !adminDetails.isEmpty()) {
            	// Create a session and store user information
                HttpSession session = request.getSession();
                session.setAttribute("username", uname); // Storing the username in the session
                session.setAttribute("adminDetails", adminDetails); // Optionally store customer details

                request.setAttribute("contactDetails", AdminDBUtil.getContactDetails());
                RequestDispatcher dis = request.getRequestDispatcher("Admin.jsp");
                dis.forward(request, response);
            } else {
                // Invalid credentials
                request.setAttribute("errorMessage", "Invalid username or password. Please try again.");
                RequestDispatcher dis = request.getRequestDispatcher("AdminLogin.jsp");
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
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        // Fetch inquiries from the database for the logged-in user
        List<Contact> contactDetails = AdminDBUtil.getContactDetails();
        request.setAttribute("contactDetails", contactDetails);

        // Forward to MyContact.jsp
        RequestDispatcher dispatcher = request.getRequestDispatcher("Admin.jsp");
        dispatcher.forward(request, response);
    }
}
