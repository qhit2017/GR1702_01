package Class;

/*�����ˣ�����
 *����ʱ�䣺2017��11��14������8:16:17
 *���䣺2408368509@qq.com
 */

public class Dog extends Animals{
	public Dog(int leg, String colour) {
		super(leg, colour);
		// TODO Auto-generated constructor stub
	}

	// ����һ���ࣺ�������԰����� Ʒ�֣�ë����ɫ�� ���䣬����
	// �����������С��ԡ�˯��
	// Ҫ������˽�У����ṩget��set����
	private String variety;
	private String color;
	private int age;
	private String weight;

	
	
	public Dog(int leg, String color, String variety, String color2, int age,
			String weight) {
		super(leg, color);
		this.variety = variety;
		this.color2 = color2;
		this.age = age;
		this.weight = weight;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
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

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	void say() {
		System.out.println("������");
	}

	void eat() {
		System.out.println("����");
	}

	void sheep() {
		System.out.println("����");
	}

}
