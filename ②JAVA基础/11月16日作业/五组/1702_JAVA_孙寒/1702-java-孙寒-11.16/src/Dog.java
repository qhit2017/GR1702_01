
public class Dog extends Animal{
	//定义一个类：狗，属性包括： 品种，毛的颜色， 年龄，重量  
	private String  breed;//品种
	private String  colour;//颜色
	private double age;//年龄
	private  double weight;//重量
	 
	
	//方法包括：叫、吃、睡觉
	void wow(){
		System.out.println("汪汪汪");
	}
	void eat(){
		 System.out.println("撑死了");
	 }
	void sleep(){
		 System.out.println("睡觉是一种众生平等");
	 }
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
