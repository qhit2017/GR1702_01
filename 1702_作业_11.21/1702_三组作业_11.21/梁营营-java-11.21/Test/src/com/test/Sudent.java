package com.test;
//��ҵ����
//���ߣ���ӪӪ��
public class Sudent extends Person {

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return "23";
	}

	public static void main(String[] args) {
		Sudent a = new Sudent();
		a.say();
	}

}
