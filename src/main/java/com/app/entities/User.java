package com.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="employeesData")
//@NoArgsConstructor
//@Getter
//@Setter
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "user_name", nullable = false, length = 100)
	private String Name;
	private String Title;
	private String Hiredate;
	private String test;
	private String Country;
	private String ReportTo;
	private String Image;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getTitle() {
		return Title;
	}


	public void setTitle(String title) {
		Title = title;
	}


	public String getHiredate() {
		return Hiredate;
	}


	public void setHiredate(String hiredate) {
		Hiredate = hiredate;
	}


	public String getCountry() {
		return Country;
	}


	public void setCountry(String country) {
		Country = country;
	}


	public String getReportTo() {
		return ReportTo;
	}


	public void setReportTo(String reportTo) {
		ReportTo = reportTo;
	}


	public String getImage() {
		return Image;
	}


	public void setImage(String image) {
		Image = image;
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
