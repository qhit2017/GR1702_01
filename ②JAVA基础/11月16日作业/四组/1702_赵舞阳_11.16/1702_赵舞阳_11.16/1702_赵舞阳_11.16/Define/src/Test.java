/*4  ����һ�������࣬ʵ����һ����Ȯ����
 * ���þ�ȮƷ�֡�ë����ɫ�����������䡢��
 * ����ɫ���ȵ����������ʱ�٣�
 * �������ĳԵķ�����work����
 */
//����һ��������
public class Test {
public static void main(String[] args) {
	Sleuth sleuth = new Sleuth("����Ȯ","��ɫ",2,20,"��ɫ",4,50);
	sleuth.setBreed("����Ȯ");
	System.out.println("��ȮƷ��:"+sleuth.getBreed());
	sleuth.setColor("��ɫ");
	System.out.println("ë����ɫ:"+sleuth.getColor());
	sleuth.setAge(2);
	System.out.println("����:"+sleuth.getAge()+"��");
	sleuth.setWeight(20);
	System.out.println("����:"+sleuth.getWeight()+"kg");
	sleuth.eyecolor="��ɫ";
	System.out.println("�۾���ɫ:"+sleuth.eyecolor);
	sleuth.leg=4;
	System.out.println("�ȵ�����:"+sleuth.leg+"ֻ");
	sleuth.speed=50;
	System.out.println("���ʱ��:"+sleuth.speed+"km/h");
	sleuth.eat();
	sleuth.work();
}
}
