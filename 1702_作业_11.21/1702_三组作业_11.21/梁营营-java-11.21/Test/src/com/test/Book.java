package com.zk.qhit.statictest;
//��ҵһ��
//���ߣ���ӪӪ��
/*a����Book.java�ഴ���ĸ�˽�г�Ա����������countΪstatic�� ��
b���ڹ��췽����ʵ��countֵ�ĵ�����ͬʱ��countֵ������΢��ת�丳ֵ������no��
c��ʵ�ֳ�Ա����name, price�ķ�װ ��
d��Ϊno,count�ṩֻ������ ��
e��getInfo������������鼮�Ļ�����Ϣ ��
f����com.tsinghua���´���������TestBook.java ��*/
//a��
public class Book {
  private String no;
  private String name;
  private double price;
  private static int count = 0;
  //b:
 
  public Book(){
	  count++;
	  no ="TPOO"+count;
  }
  public Book(String name,double price){
	  count++;
	  no ="TPOO"+count;
	  this.name=name;
	  this.price=price;
  }
  //c:
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
 //d:

public static int getCount() {
	return count;
}
public String getNo() {
	return no;
}
  //e:
public void getInfo(){
	System.out.println("��ţ�"+this.getNo()+"��"+this.getName()+"��,ͼ��ݹ��в��飺"+Book.getCount());
	
}
}
