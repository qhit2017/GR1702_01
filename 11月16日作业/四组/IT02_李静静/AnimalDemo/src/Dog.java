 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��15�� ����8:18:41 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Dog extends Animal{
/*����һ���ࣺ�������԰����� Ʒ�֣�
 * ë����ɫ�� ���䣬����  �����������С��ԡ�˯��
 *  Ҫ������˽�У����ṩget��set���� 
 */
       private String breed ;
       private String color ;
       private int age ;
       private int weiget ;	
	Dog(){
		System.out.println("�����޲ε�");
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
		System.out.println("��");
	}
	void eat (){
		System.out.println("��");
	}
	void sleep (){
		System.out.println("˯��");
	}
	
	
	
	
	
	
	
	
}
