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


@WebServlet("/contactServlet")
public class contactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        String username = (String) session.getAttribute("username");

        // Fetch inquiries from the database for the logged-in user
        List<Contact> contactDetails = contactDBUtil.getContactDetails(username);
        request.setAttribute("contactDetails", contactDetails);

        // Forward to MyContact.jsp
        RequestDispatcher dispatcher = request.getRequestDispatcher("MyContact.jsp");
        dispatcher.forward(request, response);
    }
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false); // Retrieve the existing session
		String username = (String) session.getAttribute("username");
		String uname = request.getParameter("PassengerName");
		String email = request.getParameter("PassengerEmail");
		String complaintType = request.getParameter("complaintType");
		String complaint = request.getParameter("Feedback");
		String status = "Pending";
		
		boolean isTrue;
		
		isTrue = contactDBUtil.insertContactMsg(uname, email, complaintType, complaint, status);
		
		// Fetch existing contacts for the user at the start
//        List<Contact> contactDetails = contactDBUtil.getContactDetails(username);
//        request.setAttribute("contactDetails", contactDetails);
		
		if(isTrue == true) {
			
			// After successful insertion, retrieve and display the contacts again
            request.setAttribute("contactDetails", contactDBUtil.getContactDetails(username));
            RequestDispatcher dis = request.getRequestDispatcher("MyContact.jsp");
            dis.forward(request, response);
			
		} else {
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
		}
	}
	
	

}
