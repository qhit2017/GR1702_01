package com.zk.qhit.statictest;

/**
 * @author ���� E-mail:738348954@qq.com
 * @date ����ʱ�䣺2017��11��20�� ����6:31:01
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Book {
	// �ĸ�˽�б���
	private String no;
	private String name;
	private double price;
	private static int count = 0;

	// ���췽��
	public Book() {
		count++;
		no = "ti" + count;
	}

	public Book(String name, double price) {
		count++;
		no = "ti" + count;
		this.name = name;
		this.price = price;
	}

	// ʵ�ֱ���name, price�ķ�װ

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// Ϊno,count�ṩֻ������ ��
	public static int getCount() {
		return count;
	}

	public String getNo() {
		return no;
	}

	// getInfo������������鼮�Ļ�����Ϣ ��
	public void getInfo() {
		System.out.println("��ţ�" + this.getNo() + "    ��" + this.getName()
				+ "  �� ��ͼ��ݹ�����:" + Book.getCount());
	}
}
