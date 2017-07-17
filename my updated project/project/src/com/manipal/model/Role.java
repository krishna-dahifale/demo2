package com.manipal.model;

public class Role {
		private int role_id;
		private String role_type;
		private String status;
		public Role(String role_type, String status) {
			super();
			this.role_type = role_type;
			this.status = status;
		}
		
		public Role(int role_id, String role_type, String status) {
			super();
			this.role_id = role_id;
			this.role_type = role_type;
			this.status = status;
		}

		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public int getRole_id() {
			return role_id;
		}
		public void setRole_id(int role_id) {
			this.role_id = role_id;
		}
		public String getRole_type() {
			return role_type;
		}
		public void setRole_type(String role_type) {
			this.role_type = role_type;
		}
		
		
		@Override
		public String toString() {
			return "Role [role_id=" + role_id + ", role_type=" + role_type
					+ "]";
		}
		
		
		
}
