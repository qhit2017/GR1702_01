/**
 * 
 */
package fcj;
import java.util.Scanner;

/**
 * @author 作者：冯晨婕  E-mail:2570804732@qq.com
 * @date 创建时间：15 Nov 2017 8:17:09 Ntambama
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
public class Dog extends Animal {
//定义一个类：狗，属性包括： 品种，毛的颜色， 年龄，重量  方法包括：叫、吃、睡觉
    //要求属性私有，并提供get、set方法
	private String breed;
	private String color;
	private int age;
	private double weigth;
	Dog(){
	System.out.println("我是无参的");
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
	public double getWeigth() {
		return weigth;
	}
	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}
	 //方法
	void call (){
	System.out.println("汪汪汪");
	}
	void eat (){
		System.out.println("吃吃吃，吃狗粮");
	}
	void sleep(){
		System.out.println("睡睡睡， 觉");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
