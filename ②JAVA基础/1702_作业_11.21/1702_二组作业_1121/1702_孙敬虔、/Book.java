package com.zk.qhit.stattictest;
/** 
 * @author  ���� E-mail:chenglong793708@547.com
 * @date    ����ʱ�䣺2017��11��20�� ����7:00:14 
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
			System.out.println("��ţ�"+this.getNo() + "<<"+this.getName()+">>,ͼ��ݹ��в��飺" + Book.getCount());
		}
		 
		
	}

