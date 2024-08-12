package com.example.Healthcare.Entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Individual_policy_holder_table")
public class PolicyHolder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Policy_holder_id;	
	private String fullname;
	private Date date_of_birth;
	private String gender;
	private int mobile_no;
	private int user_id;
	private String occupation;
	
	public PolicyHolder() {
		// TODO Auto-generated constructor stub
	}

	public PolicyHolder(Long policy_holder_id, String fullname, Date date_of_birth, String gender, int mobile_no,
			int user_id, String occupation) {
		super();
		Policy_holder_id = policy_holder_id;
		this.fullname = fullname;
		this.date_of_birth = date_of_birth;
		this.gender = gender;
		this.mobile_no = mobile_no;
		this.user_id = user_id;
		this.occupation = occupation;
	}

	public Long getPolicy_holder_id() {
		return Policy_holder_id;
	}

	public void setPolicy_holder_id(Long policy_holder_id) {
		Policy_holder_id = policy_holder_id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	@Override
	public String toString() {
		return "PolicyHolder [Policy_holder_id=" + Policy_holder_id + ", fullname=" + fullname + ", date_of_birth="
				+ date_of_birth + ", gender=" + gender + ", mobile_no=" + mobile_no + ", user_id=" + user_id
				+ ", occupation=" + occupation + "]";
	}
	

	

	
	
	
	
	
	

}
