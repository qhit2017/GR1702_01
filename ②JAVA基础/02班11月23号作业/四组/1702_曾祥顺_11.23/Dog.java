package zengxiangshun;
/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2017��11��23�� ����8:45:51 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Dog implements Animal {
	private String name;//����
	private String breed;//Ʒ��
	private String colour;//��ɫ
	private int age;//����

	public Dog() {
	}

	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "���ĳԷ���";
	}

	@Override
	public String cry() {
		// TODO Auto-generated method stub
		return "���Ľз���";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}
