package com.kyh.qhit;
/** 
 * @author  ���� E-mail:1299394372@qq.com
 * @date    ����ʱ�䣺2017��11��16�� ����8:52:30 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

		public static void main(String[] args) {
			PoliceDog a = new PoliceDog();
			a.setVariety("����Ȯ");
			System.out.println(a.getVariety());
			a.setColor("�ڰ����");
			System.out.println(a.getColor());
			a.setWeight("30kg");
			System.out.println(a.getWeight());
			a.setAge(36);
			System.out.println(a.getAge());
			a.eyecolor="��ɫ";
			System.out.println(a.eyecolor);
			a.leg=4;
			System.out.println(a.leg);
			a.fastst=30;
			System.out.println(a.fastst);
			
			a.eat();
			a.work();
			
		}
}
