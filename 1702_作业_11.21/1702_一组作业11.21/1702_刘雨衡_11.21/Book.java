package com.zk.qhit.statictest;

public class Book {
	
	
		private int no;
		private String name;
		private double price;
		private static int count=0;
	
		

		public Book( String name, double price) {
			setNo(count++);
			this.setNo(count);
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
		
		
		public String getInfo(){
			String info;
			info = toString();
			return info;
		}

		public int getNo() {
			return no;
		}

		public void setNo(int no) {
			this.no = no;
		}
			
}
