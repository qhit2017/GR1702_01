package Class;

/*制作人：王欣
 *制作时间：2017年11月14日下午8:16:17
 *邮箱：2408368509@qq.com
 */

public class Dog extends Animals{
	public Dog(int leg, String colour) {
		super(leg, colour);
		// TODO Auto-generated constructor stub
	}

	// 定义一个类：狗，属性包括： 品种，毛的颜色， 年龄，重量
	// 方法包括：叫、吃、睡觉
	// 要求属性私有，并提供get、set方法
	private String variety;
	private String color;
	private int age;
	private String weight;

	
	
	public Dog(int leg, String color, String variety, String color2, int age,
			String weight) {
		super(leg, color);
		this.variety = variety;
		this.color2 = color2;
		this.age = age;
		this.weight = weight;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
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

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	void say() {
		System.out.println("汪汪汪");
	}

	void eat() {
		System.out.println("狗粮");
	}

	void sheep() {
		System.out.println("狗窝");
	}

}
