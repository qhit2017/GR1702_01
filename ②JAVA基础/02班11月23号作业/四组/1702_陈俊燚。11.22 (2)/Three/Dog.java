package Three;
//b.��������ʵ�ֶ�������ӿڡ�Ҫ�󹷾��е����԰�����������Ʒ�֡���ɫ�����䣨����˽�У� ��
//���������ֹ��췽����1 �޲ι��췽�� 2 ����Ϊ�����Ĺ��췽����
public class Dog implements IAnimal{
	private String name;
	private String breed;
	private String color;
	private int age;
     
	public Dog() {
		super();
	}

	public Dog(String name) {
		super();
		this.setName(name);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		
     	
		
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

}

