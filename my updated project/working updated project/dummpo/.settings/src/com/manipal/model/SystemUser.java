package com.manipal.model;

import java.util.Date;

public class SystemUser {
		private int role_id;
		private int user_id;
		private int username;
		private String password;
		private String first_name;
		private String last_name;
		private String email_id;
		private String dob;
		private long contact_no;
		private String status;
		public int getRole_id() {
			return role_id;
		}
		public void setRole_id(int role_id) {
			this.role_id = role_id;
		}
		public int getUser_id() {
			return user_id;
		}
		public void setUser_id(int user_id) {
			this.user_id = user_id;
		}
		public int getUsername() {
			return username;
		}
		public void setUsername(int username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getFirst_name() {
			return first_name;
		}
		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}
		public String getLast_name() {
			return last_name;
		}
		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}
		public String getEmail_id() {
			return email_id;
		}
		public void setEmail_id(String email_id) {
			this.email_id = email_id;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public long getContact_no() {
			return contact_no;
		}
		public void setContact_no(long contact_no) {
			this.contact_no = contact_no;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public SystemUser(int role_id, int user_id, int username,
				String password, String first_name, String last_name,
				String email_id, String dob, long contact_no, String status) {
			super();
			this.role_id = role_id;
			this.user_id = user_id;
			this.username = username;
			this.password = password;
			this.first_name = first_name;
			this.last_name = last_name;
			this.email_id = email_id;
			this.dob = dob;
			this.contact_no = contact_no;
			this.status = status;
		}
		public SystemUser(int role_id, int username,
				String password, String first_name, String last_name,
				String email_id, String dob, long contact_no, String status) {
			super();
			this.role_id = role_id;
			this.user_id = user_id;
			this.username = username;
			this.password = password;
			this.first_name = first_name;
			this.last_name = last_name;
			this.email_id = email_id;
			this.dob = dob;
			this.contact_no = contact_no;
			this.status = status;
		}
		
}
