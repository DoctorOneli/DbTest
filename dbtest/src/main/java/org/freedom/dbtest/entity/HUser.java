package org.freedom.dbtest.entity;


import java.math.BigDecimal;  

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.GenerationType;  
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;  

@Entity
@Data
public class HUser {
	  @Id  
	  @GeneratedValue(strategy = GenerationType.AUTO)  
	  private Long id;  
	  
	  @Column  
	  private String username;  
	  
	  @Column  
	  private String name;  
	  
	 
	 

	public HUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public HUser(Long id, String username, String name) {
		super();
		this.id = id;
		this.username = username;
		this.name = name;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	  
	}  

