package yangxueting;

public class Dog extends Animal{

	private String varieties;
	private String colour;
	private int age;
	private int weight;
	
	
	
	void call(){
		System.out.println("������");
	}
	void eat(){
		System.out.println("�ԳԳ�");
	}
	void sleep(){
		System.out.println("˯��");
	}
	public String getVarieties() {
		return varieties;
	}
	public void setVarieties(String varieties) {
		this.varieties = varieties;
	}
	public String getcolour() {
		return colour;
	}
	public void setcolour(String colour) {
		this.colour = colour;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
