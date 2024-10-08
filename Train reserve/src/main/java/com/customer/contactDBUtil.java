package com.customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class contactDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	public static List<Contact> getContactDetails(String username) {
		
		ArrayList<Contact> contact = new ArrayList<>();
		    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "select * from train.contact where uname='"+username+"'";
    		rs = stmt.executeQuery(sql);
    		
    		while(rs.next()) {
    			int id = rs.getInt(1);
    			String uname = rs.getString(2);
    			String email = rs.getString(3);
    			String ComplaintType = rs.getString(4);
    			String Complaint = rs.getString(5);
    			String Status = rs.getString(6);
    			
    			Contact c = new Contact( id, uname,email,ComplaintType,Complaint,Status);
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

	public static boolean insertContactMsg(String uname, String email, String ComplaintType, String Complaint, String status) {
		
		boolean isSuccess = false;
		
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "insert into train.contact values (0, '"+uname+"', '"+email+"',  '"+ComplaintType+"', '"+Complaint+"', '"+status+"')";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
    			isSuccess = true;
    		} else {
    			isSuccess = false;
    		}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
		return isSuccess;
	}



}
