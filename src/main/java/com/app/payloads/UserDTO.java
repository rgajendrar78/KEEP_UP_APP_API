package com.app.payloads;

//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;


public class UserDTO {
	
	private int id;
	
	
	private String name;
	
	private String Title;
	private String Hiredate;
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
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
