package guo;
/** 
 * @author  作者 E-mail:2379675496@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Dog implements IZoo{
	
	
	/*b.创建狗，实现动物这个接口。要求狗具有的属性包括：
	姓名、品种、颜色、年龄（属性私有） ，并创建两种构造方法
	（1 无参构造方法 2 参数为姓名的构造方法）
	*/
	
	private String   name;
	private String   variety;
	private String   colour;
	private int age;

	public String getEat() {
		// TODO Auto-generated method stub
		return "吃狗粮";
	}

	public String getWow() {
		// TODO Auto-generated method stub
		return "汪汪叫";
	}

	
	public Dog() {
		super();
	}

	
	public Dog(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
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
	
	

	
	
	

}
