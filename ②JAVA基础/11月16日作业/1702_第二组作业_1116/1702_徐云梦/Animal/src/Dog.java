/**
 * 
 */

/**
 * @author 作者 :xuyunmeng
 * @date 创建时间：2017年11月16日 上午8:45:14
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Dog extends Animal{
	String breed;
	private String color;
	int age;
	double weight;

	// 方法

	void cry() {
		System.out.println("狗再叫");

	}

	void eat() {
		System.out.println("吃东西");

	}

	void sleep() {
		System.out.println("睡觉");
	}

	// 无参的
	Dog() {
		System.out.println();
	}

	//get set

	public void setColor(String color) {
		System.out.println("黄色");
		this.color = color;
	}
	public String setColor(){
		return color;
	}
}
