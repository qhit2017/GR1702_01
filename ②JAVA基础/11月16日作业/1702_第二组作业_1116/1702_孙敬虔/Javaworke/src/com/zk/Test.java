package com.zk;
/** 
 * @author  作者 E-mail:chenglong793708@547.com
 * @date    创建时间：2017年11月15日 下午8:34:00 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @func
 */
public class Test {

	public static void main(String[] args) {
		
		Policedog dog =new Policedog();
		dog.setBreed("牧羊犬");
		dog.setColor("黑色");
		dog.setWeight(24);
		dog.setAge(3);
		dog.eyes="黑色";
		dog.legs=4;
		dog.speed="65Km/h";
		System.out.println("该警犬的品种为："+dog.getBreed());
		System.out.println("该警犬毛色为："+dog.getColor());
		System.out.println("该警犬体重为:"+dog.getWeight());
		System.out.println("该警犬年龄为："+dog.getAge());
		System.out.println("该警犬眼睛颜色为："+dog.eyes);
		System.out.println("该警犬腿数为："+dog.legs);
		System.out.println("该警犬时速为："+dog.speed);
		dog.eat();
		dog.work();
	}
}
