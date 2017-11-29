package Three;

//c.创建老鼠 实现动物这个接口。要求老鼠具有的属性包括：姓名、品种、几条腿、体重（属性私有） ，
//并创建两种构造方法（1 无参构造方法 2 参数为姓名、品种的构造方法）
public class Mouse implements IAnimal {
	String name;
	String breed;// 品种
	int leg;// 几条腿
	double weight;// 体重

	// 无参构造方法
	public Mouse() {
		super();
	}

	// 参数为姓名、品种的构造方法
	public Mouse(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		
	}

	

}
