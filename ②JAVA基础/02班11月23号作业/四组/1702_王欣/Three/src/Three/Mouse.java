package Three;
/*�����ˣ�����
 *����ʱ�䣺2017��11��23������7:06:50
 *���䣺2408368509@qq.com
 */

public class Mouse implements Animal{
	//�������� ʵ�ֶ�������ӿڡ�Ҫ��������е����԰�����
	//������Ʒ�֡������ȡ����أ�����˽�У� ��
	//���������ֹ��췽����1 �޲ι��췽�� 2 ����Ϊ������Ʒ�ֵĹ��췽����

	
	private String name;
	private String breed;
	private int legs;
	private double weight;
	
	
	
	
	public String getEat() {
		// TODO Auto-generated method stub
		return "����";
	}
	
	public String getCall() {
		// TODO Auto-generated method stub
		return "����";
	}
	
	
	
	
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

	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
