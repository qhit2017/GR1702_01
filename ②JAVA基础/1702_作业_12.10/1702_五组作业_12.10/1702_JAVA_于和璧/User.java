package com.qhit;

public class User {
	
	private String Name;//ÐÕÃû
	private String position;//Ö°Î»
	
	
	public User(String name, String position) {
		
		Name = name;
		this.position = position;
	}


	@Override
	public String toString() {
		return "User [Name=" + Name + ", position=" + position + "]";
	}
	
	
	
	

}
