package com.qhit;

public class User {
	
	private String Name;//����
	private String position;//ְλ
	
	
	public User(String name, String position) {
		
		Name = name;
		this.position = position;
	}


	@Override
	public String toString() {
		return "User [Name=" + Name + ", position=" + position + "]";
	}
	
	
	
	

}
