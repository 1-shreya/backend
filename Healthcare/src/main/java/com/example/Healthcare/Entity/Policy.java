package com.example.Healthcare.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String email;
	private String firstname;
	private String lastname;
	private String mobileno;
	private String password;
	private String resetpassword;
	private String usertype;
	
	public Policy() {
		// TODO Auto-generated constructor stub
	}

	public Policy(int id, String email, String firstname, String lastname, String mobileno, String password,
			String resetpassword, String usertype) {
		super();
		this.id = id;
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobileno = mobileno;
		this.password = password;
		this.resetpassword = resetpassword;
		this.usertype = usertype;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getfirstname() {
		return firstname;
	}

	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getlastname() {
		return lastname;
	}

	public void setlastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getresetpassword() {
		return resetpassword;
	}

	public void setresetpassword(String resetpassword) {
		this.resetpassword = resetpassword;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	@Override
	public String toString() {
		return "Policy [id=" + id + ", email=" + email + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", mobileno=" + mobileno + ", password=" + password + ", resetpassword=" + resetpassword
				+ ", usertype=" + usertype + "]";
	}
	
	

	
	

}
