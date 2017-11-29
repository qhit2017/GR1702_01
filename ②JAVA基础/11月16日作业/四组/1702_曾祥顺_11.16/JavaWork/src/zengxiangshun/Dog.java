package zengxiangshun;
/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2017年11月16日 上午8:11:03 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Dog extends Animal{
	private String variety;//品种
	private String colour;//颜色
	private int age;//年龄
	private double weight;//重量
	 //叫
	void cry(){
		System.out.println("叫声！");
	}
	//吃
	void eat(){
		System.out.println("吃饭！");
	}
	//睡觉
	void sleep(){
		System.out.println("睡觉！");
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
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}
