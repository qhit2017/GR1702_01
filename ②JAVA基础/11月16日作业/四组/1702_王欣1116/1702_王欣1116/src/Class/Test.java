package Class;

/*�����ˣ�����
 *����ʱ�䣺2017��11��16������8:55:48
 *���䣺2408368509@qq.com
 */

public class Test {
	public static void main(String[] args) {
		// ����һ�������࣬ʵ����һ����Ȯ����
		// ���þ�ȮƷ�֡�ë����ɫ��������
		// ���䡢�۾���ɫ���ȵ����������ʱ�٣�
		// �������ĳԵķ�����work����
		PoliceDogs s = new PoliceDogs(4,"��","����Ȯ","��ɫ",5,"40ǧ��",30 );
		System.out.println(s.color2);
		System.out.println(s.Fastestspeed);
		System.out.println(s.leg);
		System.out.println(s.getAge());
		s.eat();
		s.work();
	}

}
