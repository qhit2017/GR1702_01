package com.zk.sjq;
/** 
 * @author  作者 E-mail:chenglong793708@547.com
 * @date    创建时间：2017年11月23日 下午7:04:45 
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
		System.out.println("无参");
	}
	public Mouse(String name,String bread){
		this.name = name;
		this.breed = bread;
	}
	@Override
	public void getEat() {
		System.out.println("大米");
	}
	@Override
	public void getCry() {
		System.out.println("叽叽叽");
	}
	public  double getWeight(){
		return 2;
	}
	public void getWeight(double weight){
		this.weight = weight;
	}
	

}
