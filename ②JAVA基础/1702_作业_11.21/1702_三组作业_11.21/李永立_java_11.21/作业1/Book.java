package com.zk.qhit.statictest;
/** 
 * @author  ���� E-mail:������271406@163.com
 * @date    ����ʱ�䣺2017��11��20�� ����6:27:21 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Book {
	//a����Book.java�ഴ���ĸ�˽�г�Ա����������countΪstatic�� ��
	 //  b���ڹ��췽����ʵ��countֵ�ĵ�����ͬʱ��countֵ���и�ֵ������no��
	  // c��ʵ�ֳ�Ա����name, price�ķ�װ ��
	 //  d��Ϊno,count�ṩֻ������ ��
	   //e��getInfo������������鼮�Ļ�����Ϣ ��
	   //f����com.tsinghua���´���������TestBook.java 
	
	    private String name;
		private double price;
		private static int count;
		private int no;
		
		
		public Book(String name, double price) {
			count++;
			no =count;
			this.name = name;
			this.price = price;
		}
		


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
		
		
		
		
		


		@Override
		public String toString() {
			return "Book [name=" + name + ", price=" + price + "]";
		}



		public String getinfo(){
			String info;
			info = toString();
			return toString();
		}
		
		
		
		
		
	}



