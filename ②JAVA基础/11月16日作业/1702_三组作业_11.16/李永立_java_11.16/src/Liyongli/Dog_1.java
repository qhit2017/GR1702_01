package Liyongli;
/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月15日 下午8:22:00 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Dog_1 extends Animal_3{
	//定义一个类：狗，属性包括： 品种，毛的颜色， 
	//年龄，重量  方法包括：叫、吃、睡觉
    //要求属性私有，并提供get、set方法 
	//属性
	private String breed;
	private String color;
	private int  age;
	private String weight;
	
	//方法
	
	
	
	void call(){
		System.out.println("汪汪汪");
	}
	void eat(){
		System.out.println("吃狗粮");
	}
	void sleep(){
		System.out.println("睡觉");
	}
	//设置和获取
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int  getAge() {
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

}
