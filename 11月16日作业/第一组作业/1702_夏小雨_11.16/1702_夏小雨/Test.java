package xiaxiaoyu;

public class Test {
/*
 * ����һ�������࣬ʵ����һ����Ȯ����
 * ���þ�ȮƷ�֡�ë����ɫ�����������䡢�۾���ɫ���ȵ����������ʱ�٣�
 */
	public static void main(String[] args) {
		PoliceDog d = new PoliceDog(4,"��ɫ","�ո�������Ȯ","��ɫ",5,"15kg","һ��10��");
		System.out.println("��ȮƷ�֣�"+d.kind);
		System.out.println("ë����ɫ��"+d.getHaircolor());
		System.out.println("������"+d.weight);
		System.out.println("���䣺"+d.age);
		System.out.println("�۾�����ɫ��"+d.color);
		System.out.println("�ȵ�����"+d.leg);
		System.out.println("����ٶȣ�"+d.fastspeed);
	}
}
