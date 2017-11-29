package com.qhit.guguoxin;
/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月23日 下午7:04:46 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Mouse implements Animal{

	String name;
	String breed;
	int leg;
	@SuppressWarnings("unused")
	private double weight;

	Mouse() {
		System.out.println("我是鼠的无参构造方法");
	}

	public Mouse(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

	@Override
	public String getEat() {
		// TODO Auto-generated method stub
		return "奶酪";
	}

	@Override
	public String getCry() {
		// TODO Auto-generated method stub
		return "吱吱吱";
	}

	public double getWeight() {
		return 1;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
