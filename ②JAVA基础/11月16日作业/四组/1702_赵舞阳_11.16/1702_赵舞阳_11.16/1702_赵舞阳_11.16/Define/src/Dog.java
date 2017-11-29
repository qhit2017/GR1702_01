/*1  定义一个类：狗，属性包括： 品种，毛的颜色，
 *  年龄，重量  方法包括：叫、吃、睡觉
 *       要求属性私有，并提供get、set方法 
 * * */
	//定义一个类：狗
public class Dog extends Animal{
	//属性包括
	private String breed;
	private String color;
	private int age;
	private double weight;
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
		System.out.println("叫");
	}
	void eat(){
		System.out.println("我今天吃了许多狗粮！");
	}
	void seleep(){
		System.out.println("睡觉");
	}
}
