package chenjunyi;

public class Dog extends Animal {
	//第一题
	// 定义一个类：狗，属性包括： 品种，毛的颜色， 年龄，重量  方法包括：叫、吃、睡觉
	//要求属性私有，并提供get、set方法
	private String breed;//品种
	private String color;//毛的颜色
	private int age;//年龄
    private double weight;//重量
    double quantity;//腿的数量
	String EyeColor;//眼睛的颜色
	 //get、set方法
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	//方法包括：叫、吃、睡觉
	void wow(){
		System.out.println("汪汪汪");
	} 
	void eat(){
		System.out.println("吃");
	}
	void sleep(){
		System.out.println("睡觉");
	}
}
