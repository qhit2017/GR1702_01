package Dog;

/**
 * @author 作者 E-mail:738348954@qq.com
 * @date 创建时间：2017年11月15日 下午8:11:27
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Dog extends Animal{
	private String breed;// 品种
	private String colour;// 颜色
	private int age;//年龄
	private double weight;//重量

	void eat() {
		System.out.println("每天吃肉");

	}

	void cry() {
		System.out.println("叫");

	}

	void sleep() {
		System.out.println("睡觉");

	}
	//get set 方法

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

	
	
	
	
	
	
	
	
	
	
}
