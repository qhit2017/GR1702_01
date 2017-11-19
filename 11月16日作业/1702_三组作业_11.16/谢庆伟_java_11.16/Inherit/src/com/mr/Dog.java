package com.mr;
/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月15日 下午8:29:29 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Dog extends Animal{
	private String  breed;  //品种
	private String chaetacolor;  //毛的颜色
	private int age;  //年龄
	private int weight;  //重量
	//吠声
	void bark(){
		System.out.println("狗狗会“汪汪汪”地叫");
	}
	//进食
	void feed(){
		System.out.println("狗狗正在进食......");
	}
	//睡觉
	void sleep(){
		System.out.println("狗狗睡着了...zZ");
	}
	//更改和获取
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public String getChaetacolor() {
		return chaetacolor;
	}
	public void setChaetacolor(String chaetacolor) {
		this.chaetacolor = chaetacolor;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>30||age<0){
			System.out.println("年龄已经超出记录！请检查一下是否有误！");
		}else{
			this.age = age;
		}
		
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		if(weight>300||weight<0.037){
			System.out.println("体重已经超出世界记录！请检测一下是否有误！");
		}else{
			this.weight = weight;
		}
		
	}
	

}
