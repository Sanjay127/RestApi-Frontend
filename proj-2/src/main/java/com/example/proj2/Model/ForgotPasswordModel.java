package com.example.proj2.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="FpDetails")
public class ForgotPasswordModel {
	private String email;
	public ForgotPasswordModel(String email, String new_password, String re_password) {
		super();
		this.email = email;
		this.new_password = new_password;
		this.re_password = re_password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNew_password() {
		return new_password;
	}
	public void setNew_password(String new_password) {
		this.new_password = new_password;
	}
	public String getRe_password() {
		return re_password;
	}
	public void setRe_password(String re_password) {
		this.re_password = re_password;
	}
	private String new_password;
	@Override
	public String toString() {
		return "ForgotPasswordModel [email=" + email + ", new_password=" + new_password + ", re_password=" + re_password
				+ "]";
	}
	private String re_password;
}
	