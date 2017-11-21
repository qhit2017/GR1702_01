package com.test;

//作业二：
//作者：梁营营；
public abstract class Person {
	// 额外定义say方法调用getContent（）方法并输出；子类Sudent、Workder继承Person类；并实现抽象类的方法getContent；实例化对象并分别调用say（）方法
	// 。 public abstract String getContent();
   public	abstract String getContent();

	void say() {
		getContent();
		System.out.println(getContent());
	}
}