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
			System.out.println("品种为："+a.getVariety());
			a.setColor("黑白相间");
			System.out.println("毛发颜色为:"+a.getColor());
			a.setWeight("30kg");
			System.out.println("体重是："+a.getWeight());
			a.setAge(3);
			System.out.println("年龄是："+a.getAge());
			a.eyecolor="棕色";
			System.out.println("眼睛为："+a.eyecolor);
			a.leg=4;
			System.out.println("腿有"+a.leg+"条");
			a.fastst=30;
			System.out.println("每小时"+a.fastst+"km/h");
			
			a.eat();
			a.work();
			
		}
}
