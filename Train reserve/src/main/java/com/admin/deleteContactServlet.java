package com.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.customer.Contact;


@WebServlet("/deleteContactServlet")
public class deleteContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		int ID = Integer.parseInt(id);
		
		boolean isTrue;
		
		isTrue = AdminDBUtil.deletecontact(ID);
		
		if (isTrue == true) {
			List<Contact> contactDetails = AdminDBUtil.getContactDetails();
			request.setAttribute("contactDetails", contactDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("Admin.jsp");
			dis.forward(request, response);
		}
		else {
			List<Contact> contactDetails = AdminDBUtil.getContactDetails();
			request.setAttribute("contactDetails", contactDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("Admin.jsp");
			dis.forward(request, response);
		}
		
	}

}
