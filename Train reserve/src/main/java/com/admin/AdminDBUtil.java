package com.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.customer.Contact;
import com.customer.DBConnect;


public class AdminDBUtil {
	

	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static List<Admin> validateAdmin(String userName, String password) {
		
		ArrayList<Admin> customer = new ArrayList<>();
		
		//create DB Connection
		String url = "jdbc:mysql://localhost:3306/train";
		String user = "root";
		String pass = "amodhya@200211";
		
		//Validate 
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			
			String sql = "select * from train.admin where username='"+userName+"' and password='"+password+"'";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String username = rs.getString(5);
				String userpass = rs.getString(6);
				
				Admin c = new Admin(id, name, email, phone, username, userpass);
				customer.add(c);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	    finally {
	        try {
	            if (rs != null) rs.close();
	            if (stmt != null) stmt.close();
	            if (con != null) con.close(); // Close connections to avoid leaks
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }	
		
		return customer;
		
	}
		
	
	public static List<Contact> getContactDetails() {
		
		ArrayList<Contact> contact = new ArrayList<>();
		    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "select * from train.contact";
    		rs = stmt.executeQuery(sql);
    		
    		while(rs.next()) {
    			int id = rs.getInt(1);
    			String uname = rs.getString(2);
    			String email = rs.getString(3);
    			String ComplaintType = rs.getString(4);
    			String Complaint = rs.getString(5);
    			String Status = rs.getString(6);
    			
    			Contact c = new Contact(id,uname,email,ComplaintType,Complaint,Status);
    			contact.add(c);
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
	    finally {
	        try {
	            if (rs != null) rs.close();
	            if (stmt != null) stmt.close();
	            if (con != null) con.close(); // Close connections to avoid leaks
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
    	return contact;	
    }
	
	public static boolean updatecontact(int id) {
    	
		boolean isSuccess = false;
		
		
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "update train.contact set status='Under Invesigation'" + "where id='"+id+"'";
    		int rs = stmt.executeUpdate(sql);
    		
    		
    		if(rs > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }


	public static boolean deletecontact(int id) {
		
		boolean isSuccess = false;
		
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "delete from train.contact where id='"+id+"'";
    		int r = stmt.executeUpdate(sql);
    		
    		if (r > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }
}
