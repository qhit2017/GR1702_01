public class Dog implements Animal {
	String name;
	String breed;
	String colour;
	private double age;

	public double getAge() {
		return 3;
	}

	public void setAge(double age) {
		this.age = age;
	}

	// 无参构造方法
	public Dog() {
		System.out.println("狗的无参构造方法");

	}

	// 参数为姓名的构造方法
	public Dog(String name) {
		this.name = name;
	}

	public String getEat() {
		// TODO Auto-generated method stub
		return "eat";
	}

	@Override
	public String getWow() {
		// TODO Auto-generated method stub
		return "wow";
	}

	

	

}
