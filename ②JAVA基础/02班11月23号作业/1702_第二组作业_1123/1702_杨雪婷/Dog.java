package yangxueting;
/** 
 * @author  作者 qqE-mail:157334005@qq.com
 * @date    创建时间：2017年11月23日 下午7:18:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Dog implements Dongwu{

	private String name;
	private String breed;
	private String colour;
	private double age;
	public Dog(String name, String breed, String colour, double age) {
		super();
		this.name = name;
		this.breed = breed;
		this.colour = colour;
		this.age = age;
	}
	public Dog(String name) {
		super();
		this.name = name;
	}
	public Dog() {
		super();
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
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("吃吃吃");
	}
	@Override
	public void wow() {
		// TODO Auto-generated method stub
		System.out.println("汪汪汪");
	}
	
}
