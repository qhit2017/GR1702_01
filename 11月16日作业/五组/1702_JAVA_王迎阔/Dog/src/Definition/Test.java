package Definition;

import java.security.Policy;

/**
 * @author ���� E-mail:1456014420@qq.com
 * @date ����ʱ�䣺2017��11��16�� ����8:34:21
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test {
	public static void main(String[] args) {

		// ����һ�������࣬ʵ����һ����Ȯ����
		// ���þ�ȮƷ�֡�ë����ɫ�����������䡢�۾���ɫ���ȵ����������ʱ�٣�
		// �������ĳԵķ�����work����
		Dogs policdog = new Dogs("��ʿ��", "�ڰ�ɫ", 9, 23.5, 4, "��ɫ", "20����");
		policdog.setBreed("��ʿ��");
		System.out.println("����" + policdog.getBreed());
		policdog.eyecolor = "�ڰ�ɫ";
		System.out.println("�۾�����ɫ" + policdog.getColour());
		policdog.setWeight(12);
		System.out.println(policdog.getWeight());
		policdog.setAge(8);
		System.out.println(policdog.getAge());
		policdog.setColour("bule");
		System.out.println(policdog.getColour());
		policdog.number = 4;
		System.out.println(policdog.number);
		System.out.println(policdog.Speedperhour);
		policdog.eat();
		policdog.work();

	}
}