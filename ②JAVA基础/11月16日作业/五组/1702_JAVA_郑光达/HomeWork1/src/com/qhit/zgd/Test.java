/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��15�� ����8:37:52 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

public class Test {

	public static void main(String[] args) {

		PoliceDog a = new PoliceDog("��ʿ��", "black", 8, "22����",
				"ÿСʱ22����", 4,"blue");
		// ���þ�ȮƷ�֡�ë����ɫ�����������䡢�۾���ɫ���ȵ����������ʱ�٣�
		a.setPingZhong("��ʿ��");
		System.out.println("���ࣺ" + a.getPingZhong());
		a.YanJingcolor = "black";
		System.out.println("�۾�����ɫ" + a.YanJingcolor);
		a.setTiZhong("22����");
		System.out.println("���أ�" + a.getTiZhong());
		a.setAge(8);
		System.out.println(a.getAge());
		a.setColor("blue");
		System.out.println(a.getColor());
		a.number = 4;
		System.out.println(a.number);
		System.out.println(a.Speedperhour);

		a.eat();

		a.work();

	}

}
