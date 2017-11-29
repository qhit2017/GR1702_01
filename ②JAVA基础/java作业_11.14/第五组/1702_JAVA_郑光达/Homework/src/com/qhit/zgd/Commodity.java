/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月13日 下午8:08:14 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

import java.util.function.Predicate;

public class Commodity {
	// 创建管理员与商品类，并通过调用构造方法进行实例化
	// 创建商品类，并给出商品编号、名称、价格、型号、类别五个属性，
	// 并提供三个不同的构造方法：不带参数的，带编号、名称、价格三个参数的，
	// 带五个参数的构造方法；分别调用三个构造方法实例化对象，
	// 并观察成员变量赋值情况；
	// 创建一个私有的变量private
	String SerialNumbe;
	String name;
	int price;
	char model;
	String category;
	//不带参数的
	Commodity() {
		System.out.println("不带参数的");
	}
	//带三个参数的
	Commodity(String SerialNumbes,String names,int prices){
		SerialNumbe=SerialNumbes;
		name = names;
		price = prices;
	}
	//带五个参数的
	Commodity(String SerialNumbez,String namez,int pricez,char modelz,String categoryz){
		SerialNumbe = SerialNumbez;
		name = namez;
		price = pricez;
		model = modelz;
		category = categoryz;
	}

	}
	

	

	

	
	
	
	
		
	

