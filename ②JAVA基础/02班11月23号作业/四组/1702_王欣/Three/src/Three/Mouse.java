package Three;
/*制作人：王欣
 *制作时间：2017年11月23日下午7:06:50
 *邮箱：2408368509@qq.com
 */

public class Mouse implements Animal{
	//创建老鼠 实现动物这个接口。要求老鼠具有的属性包括：
	//姓名、品种、几条腿、体重（属性私有） ，
	//并创建两种构造方法（1 无参构造方法 2 参数为姓名、品种的构造方法）

	
	private String name;
	private String breed;
	private int legs;
	private double weight;
	
	
	
	
	public String getEat() {
		// TODO Auto-generated method stub
		return "奶酪";
	}
	
	public String getCall() {
		// TODO Auto-generated method stub
		return "喵喵";
	}
	
	
	
	
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

	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
