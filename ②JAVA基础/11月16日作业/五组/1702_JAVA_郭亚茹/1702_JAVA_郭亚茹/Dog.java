package guo;
/** 
 * @author  ���� E-mail:2379675496@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Dog  extends Animals{
	//����һ���๷
	//�����԰����� Ʒ�֣�ë����ɫ�� ���䣬����  
	//�����������С��ԡ�˯��
   //  Ҫ������˽�У����ṩget��set����
		private String variety; 
		private String color;
		private double age;
		private double weight;
		 void bark() {
			System.out.println();
		}

		 void eat() {
			System.out.println("ϲ���Թ�ͷ��");
		}

		void sleep() {
			System.out.println("˯����һ�����ܣ�");
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
