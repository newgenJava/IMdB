package com.newgen.user.model;

import java.time.LocalDate;

import jakarta.validation.constraints.Size;

//@Entity 
public class User {
	
	private Integer id;
	
	@Size(min = 5, message = "minimum size should be 5")
	private String name;
	
	private String email;
	
	private String username;
	
	private String password;
	
	private LocalDate birthDate;
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public User(int id, String name, String email, String username,
			String password, LocalDate birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
		this.birthDate = birthDate;
	}

	public User() {
		super();
	}
	
	
	
	

}
