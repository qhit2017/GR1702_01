package com.zk.qhit.statictest;

import java.util.concurrent.CountDownLatch;

public class Book {
	//��Book.java�ഴ���ĸ�˽�г�Ա����������countΪstatic�� ��
	
	private String name;//����
	private double prive;//�۸�
	private static int count=0;
	private String no;
	
	public Book(){
		count++;
		no="Tpoo"+count;
	}
	
	public Book(String name, double prive) {
		count++;
		no="Tpoo"+count;
		this.name = name;
		this.prive = prive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrive() {
		return prive;
	}

	public void setPrive(double prive) {
		this.prive = prive;
	}

	public static int getCount() {
		return count;
	}

	public String getNo() {
		return no;
	}

	public void getInfor(){
		System.out.println("���:"+this.getNo()+"<<"+this.getName()+">>,ͼ��ݹ��в���:"+Book.getCount());
	}
	
	
	
	


}
