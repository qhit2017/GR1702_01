/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月13日 下午8:06:44 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

import javax.xml.crypto.dsig.CanonicalizationMethod;

public class Admin {

	// 创建管理员与商品类，并通过调用构造方法进行实例化
	// 创建商品类，并给出商品编号、名称、价格、型号、类别五个属性，
	// 并提供三个不同的构造方法：不带参数的，带编号、名称、价格三个参数的，
	// 带五个参数的构造方法；分别调用三个构造方法实例化对象，
	// 并观察成员变量赋值情况；
	public static void main(String[] args) {

		Commodity a = new Commodity();
		System.out.println("该商品的编号："+a.SerialNumbe);
		System.out.println("该商品的名称："+a.name);
		System.out.println("该商品的价格："+a.price);
		System.out.println("该商品的型号："+a.model);
		System.out.println("该商品的类别："+a.category);
		
		Commodity b = new Commodity("007","冰红茶",3);
		System.out.println("\n"+"带三个参数的");
		System.out.println(b.SerialNumbe);
		System.out.println(b.name);
		System.out.println(b.price);
		
		Commodity c = new Commodity("008","绿茶",5,'A',"饮料");
		System.out.println("\n"+"带五个参数的");
		System.out.println(c.SerialNumbe);
		System.out.println(c.name);
		System.out.println(c.price);
		System.out.println(c.model);
		System.out.println(c.category);
		
	}

}
