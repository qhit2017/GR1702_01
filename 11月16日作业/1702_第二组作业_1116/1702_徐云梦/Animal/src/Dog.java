/**
 * 
 */

/**
 * @author ���� :xuyunmeng
 * @date ����ʱ�䣺2017��11��16�� ����8:45:14
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Dog extends Animal{
	String breed;
	private String color;
	int age;
	double weight;

	// ����

	void cry() {
		System.out.println("���ٽ�");

	}

	void eat() {
		System.out.println("�Զ���");

	}

	void sleep() {
		System.out.println("˯��");
	}

	// �޲ε�
	Dog() {
		System.out.println();
	}

	//get set

	public void setColor(String color) {
		System.out.println("��ɫ");
		this.color = color;
	}
	public String setColor(){
		return color;
	}
}
