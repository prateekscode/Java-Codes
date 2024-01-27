package com.mvc.dto;

public class RegisterDTO {
	
	private String fullName;
	private String userName;
	private String Password;
	private String Cpassword;
	private String Email;
	private String Phone;
	private String Gender;
	private String courses;
	private String Timings;
	private String Remarks;
	
	public RegisterDTO() {
	
	}

	public RegisterDTO(String fullName, String userName, String password, String cpassword, String email, String phone,
			String gender, String courses, String timings, String remarks) {
		super();
		this.fullName = fullName;
		this.userName = userName;
		this.courses = password;
		this.Cpassword = cpassword;
		this.Email = email;
		this.Phone = phone;
		this.Gender = gender;
		this.courses = courses;
		this.Timings = timings;
		this.Remarks = remarks;
	}
	
	
	
}
