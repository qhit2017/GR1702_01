package com.zk.sjq;
/** 
 * @author  ���� E-mail:chenglong793708@547.com
 * @date    ����ʱ�䣺2017��11��23�� ����7:04:45 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Mouse implements Animal{
	String name;
	String breed;
	int legs;
	private double weight;
	
	Mouse(){
		System.out.println("�޲�");
	}
	public Mouse(String name,String bread){
		this.name = name;
		this.breed = bread;
	}
	@Override
	public void getEat() {
		System.out.println("����");
	}
	@Override
	public void getCry() {
		System.out.println("ߴߴߴ");
	}
	public  double getWeight(){
		return 2;
	}
	public void getWeight(double weight){
		this.weight = weight;
	}
	

}
