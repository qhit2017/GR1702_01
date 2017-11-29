/*
 * c.创建老鼠 实现动物这个接口。要求老鼠具有的属性包括：
 * 姓名、品种、几条腿、体重（属性私有） ，并创建两种构
 * 造方法（1 无参构造方法 2 参数为姓名、品种的构造方法）
 */
public class Mouse {
	private String name;
	private String breed;
	private int leg;
	private double weight;

	public Mouse() {
		super();
	}

	public Mouse(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Mouse [name=" + name + ", breed=" + breed + ", leg=" + leg
				+ ", weight=" + weight + "]";
	}

}
