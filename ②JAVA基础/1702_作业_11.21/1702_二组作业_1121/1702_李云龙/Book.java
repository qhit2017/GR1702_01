package com.zk.qhit;

public class Book {
	// �ĸ�˽�г�Ա����
	private String no;
	private String name;
	private double prince;
	private static int count = 0;

	// ���췽��
	public Book() {
		count++;
		no = "a" + count;
	}

	public Book(String no, String name, double prince) {
		count++;
		no = "a" + count;
		this.name = name;
		this.prince = prince;
	}

	// ʵ�ֳ�Ա����name, price�ķ�װ

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrince() {
		return prince;
	}

	public void setPrince(double prince) {
		this.prince = prince;
	}

	// no,countֻ������
	public String getNo() {
		return no;
	}

	public static int getCount() {
		return count;
	}

	// ����鼮�Ļ�����Ϣ
	public void getInfo() {
		System.out.println("��ţ�" + this.getNo() + "  ��" + this.getName()
				+ "��,ͼ��ݹ��в��飺" + Book.getCount());

	}

}
