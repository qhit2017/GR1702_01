package com.zk.sjq;
/** 
 * @author  ���� E-mail:chenglong793708@547.com
 * @date    ����ʱ�䣺2017��11��26�� ����3:02:40 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Square implements Form{
	String length;
	int  perimeter;
	private double areas;
	
	public Square(){
		System.out.println();
	}
	public Square(String length){
	    this.length = length;
	}
	public double getAreas(){
		return areas;
	}
	@Override
	public int perimeter() {
		System.out.println("�����ε��ܳ���");
		return 16;
	}
	@Override
	public String areas() {
		System.out.println("�����ε������");
		return "16";
	}
	
	
	

}
