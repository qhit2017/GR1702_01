package com.zk.qhit;

public class Book {
	//�ĸ�˽�г�Ա����
	private String no;//���
	private double price;//�۸�
	private String name;//����
	private static int count = 0;//����
	//���췽��
	public Book(){
		count++;
		no="S"+count;
	}
	public Book(String name,double price) {
		count++;
		no="S"+count;
		this.price = price;
		this.name = name;
	}
	//��װ��get��set����
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//no��count��ֻ������
	public String getNo() {
		return no;
	}
	public static int getCount() {
		return count;
	}
	//����鼮�Ļ�����Ϣ 
	public void getInfo(){
		System.out.println("���"+this.getNo()
				+"��"+this.getName()+"����ͼ��ݹ����飺"
				+Book.getCount());
	}
	




}
