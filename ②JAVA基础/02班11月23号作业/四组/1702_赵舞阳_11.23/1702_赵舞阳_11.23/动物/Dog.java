/*
 * b.��������ʵ�ֶ�������ӿڡ�
 * Ҫ�󹷾��е����԰�����������Ʒ�֡�
 * ��ɫ�����䣨����˽�У�
 */
public class Dog implements Ianimal {
	private String name;
	private int age;
	private String color;
	private String breed;

	/*
	 * ���������ֹ��췽����1 �޲ι��췽�� 2 ����Ϊ�����Ĺ��췽����
	 */
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("���Ĳ��˳�ʺ");
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}

	public Dog() {
		super();
	}

	public Dog(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", color=" + color
				+ ", breed=" + breed + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
