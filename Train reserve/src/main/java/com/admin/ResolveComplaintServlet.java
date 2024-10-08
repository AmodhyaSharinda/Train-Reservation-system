package com.admin;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.customer.Contact;
import java.util.List;

@WebServlet("/resolveComplaintServlet")
public class ResolveComplaintServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	int complaintId = Integer.parseInt(request.getParameter("id"));

        try {
        	boolean isTrue;
    		
    		isTrue = AdminDBUtil.updatecontact(complaintId);
    		
    		    		
    		if(isTrue == true) {
    			
    			List<Contact> contactDetails = AdminDBUtil.getContactDetails();
    			System.out.println("Contact Details: " + contactDetails);
    			request.setAttribute("contactDetails", contactDetails);
    			
    			RequestDispatcher dis = request.getRequestDispatcher("Admin.jsp");
    			dis.forward(request, response);
    		}
    		else {
    			List<Contact> contactDetails = AdminDBUtil.getContactDetails();
    			System.out.println("Contact Details: " + contactDetails);
    			request.setAttribute("contactDetails", contactDetails);
    			
    			RequestDispatcher dis = request.getRequestDispatcher("Admin.jsp");
    			dis.forward(request, response);
    		}

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
