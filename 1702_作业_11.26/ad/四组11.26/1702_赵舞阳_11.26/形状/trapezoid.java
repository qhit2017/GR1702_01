/*
 * c.�������Σ�ʵ����״����ӿڡ�Ҫ�����ξ��е�
 * ���԰������ϱ߳����±߳����ߡ��ܳ����������
 * ��˽�У� �����������ֹ��췽����1 �޲ι��췽��
 *  2 ����Ϊ�ϱ߳����±߳��Ĺ��췽����
 */
public class trapezoid implements Shape {
	private int OnLong;// �ϱ߳�
	private int InLong;// �±߳�
	private int tall;// ��
	private int perimeter;// �ܳ�
	private int area;// ���

	public void perimeter() {
		System.out.println("�����޲ι��췽��");
	}

	public void area() {
		System.out.println("�����޲ι��췽��");
	}

	public trapezoid(int onLong, int inLong) {
		super();
		OnLong = onLong;
		InLong = inLong;
	}
}
