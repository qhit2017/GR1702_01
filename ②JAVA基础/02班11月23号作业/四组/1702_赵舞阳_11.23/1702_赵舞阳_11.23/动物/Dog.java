/*
 * b.创建狗，实现动物这个接口。
 * 要求狗具有的属性包括：姓名、品种、
 * 颜色、年龄（属性私有）
 */
public class Dog implements Ianimal {
	private String name;
	private int age;
	private String color;
	private String breed;

	/*
	 * 并创建两种构造方法（1 无参构造方法 2 参数为姓名的构造方法）
	 */
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("狗改不了吃屎");
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("汪汪");
	}

	public Dog() {
		super();
	}

	public Dog(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", color=" + color
				+ ", breed=" + breed + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
