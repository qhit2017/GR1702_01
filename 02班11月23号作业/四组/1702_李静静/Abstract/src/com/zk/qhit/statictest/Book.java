package com.zk.qhit.statictest;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��20�� ����6:48:35 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Book {
/*����Java Project���̣�����������com.zk.qhit.statictest ���ڰ��д���class ��Book.java�� 
   a����Book.java�ഴ���ĸ�˽�г�Ա����������countΪstatic�� ��
   b���ڹ��췽����ʵ��countֵ�ĵ�����ͬʱ��countֵ������΢��ת�丳ֵ������no��
   c��ʵ�ֳ�Ա����name, price�ķ�װ ��
   d��Ϊno,count�ṩֻ������ ��
   e��getInfo������������鼮�Ļ�����Ϣ ��
   f����com.tsinghua���´���������TestBook.java ��
	*/
	private String name;
	private String no;
	private double price;
	private static  int count =0;
	
	public Book(String name,  double price) {
		count++;
		no="TPOO"+count;
		
		this.name = name;
		this.price = price;
	}

	
	public String getNo() {
		return no;
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

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}


	public  void getInfo(){
		System.out.println("��ţ�"+this.getNo()+"��"+this.getName()
			+"����ͼ��ݹ��в��飺"+Book.getCount()	);
	}
	
	
	
	
	
}



