/*
 * c.�������� ʵ�ֶ�������ӿڡ�Ҫ��������е����԰�����
 * ������Ʒ�֡������ȡ����أ�����˽�У� �����������ֹ�
 * �췽����1 �޲ι��췽�� 2 ����Ϊ������Ʒ�ֵĹ��췽����
 */
public class Mouse {
	private String name;
	private String breed;
	private int leg;
	private double weight;

	public Mouse() {
		super();
	}

	public Mouse(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
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

	@Override
	public String toString() {
		return "Mouse [name=" + name + ", breed=" + breed + ", leg=" + leg
				+ ", weight=" + weight + "]";
	}

}
