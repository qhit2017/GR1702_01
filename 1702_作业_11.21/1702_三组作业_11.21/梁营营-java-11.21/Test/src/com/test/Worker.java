package com.test;
//作业二：
//作者：梁营营；
public  class Worker extends Person {

	@Override
	 public String getContent() {
		// TODO Auto-generated method stub
		return "25";
	}
	public static void main(String[] args) {
		Worker b = new Worker();
		b.say();
	}
    
}
