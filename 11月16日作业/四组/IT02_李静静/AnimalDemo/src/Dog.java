 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月15日 下午8:18:41 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Dog extends Animal{
/*定义一个类：狗，属性包括： 品种，
 * 毛的颜色， 年龄，重量  方法包括：叫、吃、睡觉
 *  要求属性私有，并提供get、set方法 
 */
       private String breed ;
       private String color ;
       private int age ;
       private int weiget ;	
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
	public int getWeiget() {
		return weiget;
	}
	public void setWeiget(int weiget) {
		this.weiget = weiget;
	}
	void wow (){
		System.out.println("叫");
	}
	void eat (){
		System.out.println("吃");
	}
	void sleep (){
		System.out.println("睡觉");
	}
	
	
	
	
	
	
	
	
}
