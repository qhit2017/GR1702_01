package Three;

//c.�������� ʵ�ֶ�������ӿڡ�Ҫ��������е����԰�����������Ʒ�֡������ȡ����أ�����˽�У� ��
//���������ֹ��췽����1 �޲ι��췽�� 2 ����Ϊ������Ʒ�ֵĹ��췽����
public class Mouse implements IAnimal {
	String name;
	String breed;// Ʒ��
	int leg;// ������
	double weight;// ����

	// �޲ι��췽��
	public Mouse() {
		super();
	}

	// ����Ϊ������Ʒ�ֵĹ��췽��
	public Mouse(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		
	}

	

}
