
public class Dog extends Animal{
	//����һ���ࣺ�������԰����� Ʒ�֣�ë����ɫ�� ���䣬����  
	private String  breed;//Ʒ��
	private String  colour;//��ɫ
	private double age;//����
	private  double weight;//����
	 
	
	//�����������С��ԡ�˯��
	void wow(){
		System.out.println("������");
	}
	void eat(){
		 System.out.println("������");
	 }
	void sleep(){
		 System.out.println("˯����һ������ƽ��");
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
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
