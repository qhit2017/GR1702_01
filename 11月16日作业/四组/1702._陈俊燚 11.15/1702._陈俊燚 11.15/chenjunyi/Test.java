 package chenjunyi;

//4  ����һ�������࣬ʵ����һ����Ȯ�������þ�ȮƷ�֡�ë����ɫ��������
//���䡢�۾���ɫ���ȵ����������ʱ�٣��������ĳԵķ�����work����
public class Test {
	public static void main(String[] args) {
		PoliceDog policedog = new PoliceDog("��������Ȯ", "���ɫ", 3, 10,"��ɫ",4,50);
		policedog.setBreed("��������Ȯ");
		System.out.println("��ȮƷ��:"+policedog.getBreed());
		policedog.setColor("���ɫ");
		System.out.println("ë����ɫ:"+policedog.getColor());
		policedog.setAge(3);
		System.out.println("����:"+policedog.getAge()+"��");
		policedog.setWeight(10);
		System.out.println("����:"+policedog.getWeight()+"kg");
		policedog.EyeColor  ="��ɫ";
		System.out.println("�۾���ɫ:"+policedog.EyeColor);
		policedog.quantity=4;
		System.out.println("�ȵ�����:"+policedog.quantity);
		policedog.speed=50;
		System.out.println("���ʱ��:"+policedog.speed+"m");
		policedog.eat();
		policedog.work();
		}
	}

