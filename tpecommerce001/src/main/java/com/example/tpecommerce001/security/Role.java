package com.example.tpecommerce001.security;


public enum Role {

	  ADMIN("ADMIN"),
	  CLIENT("CLIENT"),
	  UTILISATEUR("UTILISATEUR");
	  
	  private String role = "";
	   
	  Role(String role){
	    this.role = role;
	  }

	  public String getRole() {
		return role;
	  }

	   public void setRole(String role) {
			this.role = role;
	   }

	   public String toString(){
		    return role;
	   }
}
