package xiajie;

public class Test {
	public static void main(String[] args) {
		//��ȮƷ�֡�ë����ɫ�����������䡢�۾���ɫ���ȵ����������ʱ�٣�
		PoliceDog d = new PoliceDog(4,"��","��ʿ��","�ڰ����",5,"50kg","50km/h");
		
		d.eat();
		d.work();
		
		System.out.println("��ȮƷ��:"+d.kinds);
		System.out.println("�۾���ɫ:"+d.eyescolor);
		System.out.println("ë����ɫ:"+d.gethaircolor());
		System.out.println("����:"+d.age);
		System.out.println("����:"+d.weight);
		System.out.println("���ʱ��:"+d.speed);
		
	}

}
