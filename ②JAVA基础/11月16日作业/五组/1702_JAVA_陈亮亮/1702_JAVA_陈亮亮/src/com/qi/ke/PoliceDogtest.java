package com.qi.ke;
/**�����ߣ�������
 *����ʱ�䣺2017��11��16������9:09:07
 *���䣺2507147605@qq.com
 */
// ����һ�������࣬ʵ����һ����Ȯ�������þ�ȮƷ�֡�ë����ɫ��������
//���䡢�۾���ɫ���ȵ����������ʱ�٣�
public class PoliceDogtest {
	public static void main(String[] args) {
		
		PoliceDog  a = new  PoliceDog("�����", "��ɫ","102", 9,"4","��ɫ","10")	;
		a.setPingzhong("�����");
		System.out.println("��ȮƷ��:"+a.getPingzhong());
		a.setPingzhong("��ɫ");
		System.out.println("ëɫ:"+a.getColour());
		a.setPingzhong("102");
		System.out.println("����:"+a.getPingzhong());
		a.setPingzhong("9");
		System.out.println("����:"+a.getPingzhong());
		a.number=("4");
		System.out.println("�ȵ�����:"+a.number);
		a.eyecolor=("��ɫ");
		System.out.println("�۾�����ɫ:"+a.eyecolor);
		a.speed=("10");
		System.out.println("���ʱ��:"+a.speed);
		a.eat();
		a.work();
	}
  
   
}
