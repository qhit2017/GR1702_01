import java.util.jar.Attributes.Name;


public class Mouse implements Animal{
	String name;
	String breed;
	double legs;
	private double weight;
	

	@Override
	public String getEat() {
		// TODO Auto-generated method stub
		return "��";
	}

	@Override
	public String getWow() {
		// TODO Auto-generated method stub
		return "������";
	}

	public double getWeight() {
		return 2;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	//�޲ι��췽��

	public Mouse() {
		System.out.println("������޲ι��췽��");
	}
    // ����Ϊ������Ʒ�ֵĹ��췽��
	public Mouse(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	

}
