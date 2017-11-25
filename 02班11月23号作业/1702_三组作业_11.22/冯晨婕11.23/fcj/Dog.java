/**
 * 
 */
package fcj;
import java.util.Scanner;

/**
 * @author 作者：冯晨婕  E-mail:2570804732@qq.com
 * @date 创建时间：23 Nov 2017 9:27:11 Ekuseni
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
/**
 * @author Administrator
 *
 */
public class   Dog implements Animal {
//要求狗具有的属性包括：姓名、品种、颜色、年龄（属性私有） ，
	   //并创建两种构造方法（1 无参构造方法 2 参数为姓名的构造方法）
	 private  String name;
	 private String breed;
	 private String color;
	 private int age;
	 
	 public Dog() {
			super();
		}

		public Dog(String name    ) {
			super();
			this.name = name;
			 
		}

	 
	public String getEat() {
		// TODO Auto-generated method stub
		return "吃狗粮";
	}

	 
	public String getCall() {
		// TODO Auto-generated method stub
		return  "汪汪汪";
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}

	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	 
	
	
	
}
