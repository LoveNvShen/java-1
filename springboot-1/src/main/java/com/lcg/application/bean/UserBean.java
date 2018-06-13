package com.lcg.application.bean;

import java.io.Serializable;

public class UserBean implements Serializable{
	private int s_id;
	private String s_username;
	private String s_truename;
	private String s_psw;
	private int s_sex;
	private String s_birth;
	private String s_idcard;
	private String s_email;
	private String s_phone;
	private String s_address;
	private int s_if;
	private Integer create_man;
	private String create_time;
	private Integer update_man;
	private String update_time;
	
	private String repwd;//»∑»œ√‹¬Î “≥√Ê
	
	public String getRepwd() {
		return repwd;
	}
	public void setRepwd(String repwd) {
		this.repwd = repwd;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_username() {
		return s_username;
	}
	public void setS_username(String s_username) {
		this.s_username = s_username;
	}
	public String getS_truename() {
		return s_truename;
	}
	public void setS_truename(String s_truename) {
		this.s_truename = s_truename;
	}
	public String getS_psw() {
		return s_psw;
	}
	public void setS_psw(String s_psw) {
		this.s_psw = s_psw;
	}
	public int getS_sex() {
		return s_sex;
	}
	public void setS_sex(int s_sex) {
		this.s_sex = s_sex;
	}
	public String getS_birth() {
		return s_birth;
	}
	public void setS_birth(String s_birth) {
		this.s_birth = s_birth;
	}
	public String getS_idcard() {
		return s_idcard;
	}
	public void setS_idcard(String s_idcard) {
		this.s_idcard = s_idcard;
	}
	public String getS_email() {
		return s_email;
	}
	public void setS_email(String s_email) {
		this.s_email = s_email;
	}
	public String getS_phone() {
		return s_phone;
	}
	public void setS_phone(String s_phone) {
		this.s_phone = s_phone;
	}
	public String getS_address() {
		return s_address;
	}
	public void setS_address(String s_address) {
		this.s_address = s_address;
	}
	public int getS_if() {
		return s_if;
	}
	public void setS_if(int s_if) {
		this.s_if = s_if;
	}
	
	public Integer getCreate_man() {
		return create_man;
	}
	public void setCreate_man(Integer create_man) {
		this.create_man = create_man;
	}
	public Integer getUpdate_man() {
		return update_man;
	}
	public void setUpdate_man(Integer update_man) {
		this.update_man = update_man;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	
	public String getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}
	
	
}
