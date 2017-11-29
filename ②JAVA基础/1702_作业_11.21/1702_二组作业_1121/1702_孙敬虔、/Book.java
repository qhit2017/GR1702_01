package com.zk.qhit.stattictest;
/** 
 * @author  作者 E-mail:chenglong793708@547.com
 * @date    创建时间：2017年11月20日 下午7:00:14 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Book{
	
		
		
		
		private String name;
		private String no;
		private double price;
		private static int count =0;
		
		
		public void Book(){
			count++;
			no ="TPOO"+count;
		}
		public Book(String name,double price){
			count++;
			no ="TPOO"+count;
			this.name = name;
			this.price = price;
		}
		
		public Book() {
			// TODO Auto-generated constructor stub
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
		
		public String getNo() {
			return no;
		}
		
		public static int getCount() {
			return count;
		}
		
		public void getInfo(){
			System.out.println("编号；"+this.getNo() + "<<"+this.getName()+">>,图书馆共有藏书：" + Book.getCount());
		}
		 
		
	}

