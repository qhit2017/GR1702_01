package com.qi.ke;

/**
 * 制作者：陈亮亮 制作时间：2017年11月15日下午8:13:20 邮箱：2507147605@qq.com
 */
public  class dog extends Animal{
	private String pinzhong ; //品种
	private String  colour ;//颜色
	private int age;//年龄
	private String weight ;//重量
	void wow(){
	System.out.println("汪汪汪");	
	
	}
	void  eat(){
	System.out.println("吃吃吃");	
	}
	void age(){
	System.out.println("睡觉众生平等");	
	}
	public String getPingzhong() {
		return pinzhong;
	}
	public void setPingzhong(String pingzhong) {
		this.pinzhong = pingzhong;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	void age(int a){
	System.out.println("睡觉众生平等");	
	
	}
	void age(int a,int b){
	System.out.println("睡觉众生平等");	
	
	}
}

