package com.zk.qhit.statictest;

public abstract class Person {

	String Tizhong;

	public void getContent(String Tizhong) {

	}

	public void say() {
		getContent("60����");
		System.out.println(getContent());
	}

	public abstract String getContent();

}

