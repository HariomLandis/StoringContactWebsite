package project01.entity;

import java.math.BigInteger;

public class user {
	private String id;
	private String name;
	private String role;
	private String password;
	
	@Override
	public String toString() {
		return "user [id=" + id + ", name=" + name + ", role=" + role + ", password=" + password + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id2) {
		this.id = id2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
