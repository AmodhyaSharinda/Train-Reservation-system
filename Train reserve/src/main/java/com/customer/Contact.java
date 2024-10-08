package com.customer;

public class Contact {

	private int id;
	private String username;
	private String email;
	private String complainType;
	private String complain;
	private String status;
	public Contact(int id, String username, String email, String complainType, String complain, String Status) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.complainType = complainType;
		this.complain = complain;
		this.status = Status;
	}
	public int getId() {
        return id;
    }
	public String getUsername() {
		return username;
	}
	public String getEmail() {
		return email;
	}
	public String getComplainType() {
		return complainType;
	}
	public String getComplain() {
		return complain;
	}
	public String getStatus() {
		return status;
	}
	
}
