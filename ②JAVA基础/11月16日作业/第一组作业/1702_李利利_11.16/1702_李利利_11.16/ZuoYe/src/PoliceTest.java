
public class PoliceTest {
     public static void main(String[] args) {
		PoliceDog  police =new PoliceDog ();
		police.legs = 4;
		System.out.println("�ȵ�����:"+police.legs );
		police.eyecolor="��ɫ";
		System.out.println("�۾�����ɫ��"+police.eyecolor);
		police.breed="����Ȯ";
		System.out.println("����Ʒ����:"+police.breed);
		police.colour="��ɫ";
		System.out.println("��ë����ɫ��:"+police.colour);
		police.setAge(2);
		System.out.println("������:"+police.getAge());
		police.weight=60;
		System.out.println("������:"+police.weight);
		police.speed=3.5;
		System.out.println("ʱ����:"+police.speed);
		
		police.howl();
		police.eat();
		police.sleep();
		
		police.work();
	}
}
