package Definition;

/**
 * @author 作者 E-mail:1456014420@qq.com
 * @date 创建时间：2017年11月15日 下午8:24:41
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Dog extends Animals {
	private String breed;
	private String colour;
	private int age;
	private double weight;

	void wow() {
		System.out.println("汪汪汪");
	}

	void eat() {
		System.out.println("吃吃吃");
	}

	void sleep() {
		System.out.println("睡觉");
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
