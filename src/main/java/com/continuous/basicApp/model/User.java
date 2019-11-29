package com.continuous.basicApp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
	private String name;
    
    private String surname;
    
    private String nickName;
    
    private String password;
    
    private Date birthDate;
    
    private String idDocument;
    
	public User(Long id, String name, String surname,String nickName, String password, Date birthDate, String idDocument) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.nickName = nickName;
		this.password = password;
		this.birthDate = birthDate;
		this.idDocument = idDocument;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    @Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", surname=" + surname +", NickName: "+nickName+ ", password=" + password + ", birthDate="
				+ birthDate + ", idDocument=" + idDocument + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getNickName() {
		return nickName;
	}
	
	public void setNickName(String nickname) {
		this.nickName = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getIdDocument() {
		return idDocument;
	}

	public void setIdDocument(String idDocument) {
		this.idDocument = idDocument;
	}


	
	

}
