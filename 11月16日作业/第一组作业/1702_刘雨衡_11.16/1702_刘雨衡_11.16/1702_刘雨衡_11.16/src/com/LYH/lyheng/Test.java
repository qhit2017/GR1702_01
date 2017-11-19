package com.kyh.qhit;
/** 
 * @author  作者 E-mail:1299394372@qq.com
 * @date    创建时间：2017年11月16日 下午8:52:30 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

		public static void main(String[] args) {
			PoliceDog a = new PoliceDog();
			a.setVariety("牧羊犬");
			System.out.println(a.getVariety());
			a.setColor("黑白相间");
			System.out.println(a.getColor());
			a.setWeight("30kg");
			System.out.println(a.getWeight());
			a.setAge(36);
			System.out.println(a.getAge());
			a.eyecolor="棕色";
			System.out.println(a.eyecolor);
			a.leg=4;
			System.out.println(a.leg);
			a.fastst=30;
			System.out.println(a.fastst);
			
			a.eat();
			a.work();
			
		}
}
