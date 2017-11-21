package com.qi.ke;
/**制作者：陈亮亮
 *制作时间：2017年11月16日上午8:16:02
 *邮箱：2507147605@qq.com
 */
final public class PoliceDog extends dog {
	String speed;
	public PoliceDog(String  pinzhong,String colour,String weight,int age,String number,String  eyecolor,String speed){}
	
	final void work(){
		System.out.println("工作");
	}
	void age(){
		super.age();
	System.out.println("睡觉众生平等");	
	}
}
