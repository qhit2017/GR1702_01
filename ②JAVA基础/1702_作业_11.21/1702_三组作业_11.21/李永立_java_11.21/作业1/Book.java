package com.zk.qhit.statictest;
/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月20日 下午6:27:21 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Book {
	//a、给Book.java类创建四个私有成员变量；其中count为static的 。
	 //  b、在构造方法中实现count值的递增，同时将count值进行赋值给变量no。
	  // c、实现成员变量name, price的封装 。
	 //  d、为no,count提供只读操作 。
	   //e、getInfo（）方法输出书籍的基本信息 。
	   //f、在com.tsinghua包下创建测试类TestBook.java 
	
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



