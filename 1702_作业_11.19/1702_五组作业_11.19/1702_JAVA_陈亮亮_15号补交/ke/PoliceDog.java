package com.qi.ke;
/**�����ߣ�������
 *����ʱ�䣺2017��11��16������8:16:02
 *���䣺2507147605@qq.com
 */
final public class PoliceDog extends dog {
	String speed;
	public PoliceDog(String  pinzhong,String colour,String weight,int age,String number,String  eyecolor,String speed){}
	
	final void work(){
		System.out.println("����");
	}
	void age(){
		super.age();
	System.out.println("˯������ƽ��");	
	}
}
