package Three;
//b.创建狗，实现动物这个接口。要求狗具有的属性包括：姓名、品种、颜色、年龄（属性私有） ，
//并创建两种构造方法（1 无参构造方法 2 参数为姓名的构造方法）
public class Dog implements IAnimal{
	private String name;
	private String breed;
	private String color;
	private int age;
     
	public Dog() {
		super();
	}

	public Dog(String name) {
		super();
		this.setName(name);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		
     	
		
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

}

