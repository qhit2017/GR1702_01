package com.test;
//��ҵ����
//���ߣ���ӪӪ��
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
