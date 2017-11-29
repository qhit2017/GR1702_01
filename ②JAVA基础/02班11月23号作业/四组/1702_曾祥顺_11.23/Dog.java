package zengxiangshun;
/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2017年11月23日 上午8:45:51 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Dog implements Animal {
	private String name;//姓名
	private String breed;//品种
	private String colour;//颜色
	private int age;//年龄

	public Dog() {
	}

	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "狗的吃方法";
	}

	@Override
	public String cry() {
		// TODO Auto-generated method stub
		return "狗的叫方法";
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
