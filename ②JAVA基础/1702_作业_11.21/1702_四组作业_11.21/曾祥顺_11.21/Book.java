package com.zk.qhit.statctest;
/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2004��1��1�� ����12:20:38 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Book {
	
	
	private String name;
	private int no;
	private int price;
	private static int count = 0;
	
	public Book(String name, int no, int price) {
		count++;
		no=count;
		this.name = name;
		this.no = no;
		this.price = price;
	}
	
	public static int getCount() {
		return count;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", no=" + no + ", price=" + price + "]";
	}
	public String getInfo() {
		String name;
		name=toString();
		return name;
	}

}
