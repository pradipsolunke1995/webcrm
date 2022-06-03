package com.crm.enities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name= "Leads")
public class Lead {

	
	public Lead(String firstName, String lastName, String email, String leadSource, long mobile) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.leadSource = leadSource;
		this.mobile = mobile;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name= "first_name",length=45, nullable=false)
	private String firstName;
	
	@Column(name= "last_name",length=45, nullable=false)
	private String lastName;
	
	@Column(name= "email",length=128, nullable=false, unique = true)
	private String email;
	
	private String leadSource;
	
	@Column(name= "mobile",length=10, nullable=false, unique = true)
	private long mobile;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLeadSource() {
		return leadSource;
	}
	public void setLeadSource(String leadSource) {
		this.leadSource = leadSource;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
}
