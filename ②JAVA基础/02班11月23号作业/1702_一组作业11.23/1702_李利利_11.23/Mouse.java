import java.util.jar.Attributes.Name;


public class Mouse implements Animal{
	String name;
	String breed;
	double legs;
	private double weight;
	

	@Override
	public String getEat() {
		// TODO Auto-generated method stub
		return "肉";
	}

	@Override
	public String getWow() {
		// TODO Auto-generated method stub
		return "汪汪汪";
	}

	public double getWeight() {
		return 2;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	//无参构造方法

	public Mouse() {
		System.out.println("老鼠的无参构造方法");
	}
    // 参数为姓名、品种的构造方法
	public Mouse(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	

}
