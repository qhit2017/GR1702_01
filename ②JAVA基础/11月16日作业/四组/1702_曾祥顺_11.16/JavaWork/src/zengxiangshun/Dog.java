package zengxiangshun;
/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2017��11��16�� ����8:11:03 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Dog extends Animal{
	private String variety;//Ʒ��
	private String colour;//��ɫ
	private int age;//����
	private double weight;//����
	 //��
	void cry(){
		System.out.println("������");
	}
	//��
	void eat(){
		System.out.println("�Է���");
	}
	//˯��
	void sleep(){
		System.out.println("˯����");
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
