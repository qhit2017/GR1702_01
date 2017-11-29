package com.xx;
//三
public class Mouse implements IAnimal{
	String name;//名字
	String breed;//品种
	String leg;//几条腿
	private String weight ;//体重
	//两种构造方法
	public Mouse(){
		System.out.println();
	}
	public Mouse(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	//调用接口的抽象方法
	@Override
	public void getEat() {
		// TODO Auto-generated method stub
	System.out.println("用两只小爪子抱着吃");
	}
	@Override
	public void getCry() {
		// TODO Auto-generated method stub
	System.out.println("叫声很小，几乎听不见");
	}
	//封装
	public String getWeight() {
		return weight;
	}
	public void setWeight(String string) {
		this.weight = string;
	}

}
