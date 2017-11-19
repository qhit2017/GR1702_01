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
public class Dog  extends Animals{
	//定义一个类狗
	//狗属性包括： 品种，毛的颜色， 年龄，重量  
	//方法包括：叫、吃、睡觉
   //  要求属性私有，并提供get、set方法
		private String variety; 
		private String color;
		private double age;
		private double weight;
		 void bark() {
			System.out.println();
		}

		 void eat() {
			System.out.println("喜欢吃骨头！");
		}

		void sleep() {
			System.out.println("睡觉是一种享受！");
		}
		Dog( String variety, String color,double age,double weight){
			
		}
	
	public String getVariety() {
		return variety;
	}



	public void setVariety(String variety) {
		this.variety = variety;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public double getAge() {
		return age;
	}



	public void setAge(double age) {
		this.age = age;
	}



	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}



		
}
