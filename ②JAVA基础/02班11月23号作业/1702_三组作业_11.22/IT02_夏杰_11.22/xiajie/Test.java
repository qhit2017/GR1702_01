package com.xiajie;
/**
 * @author  作者  E——mai l:程洁/夏杰 2564963490@QQ.com/378901749
 * @date    创建时间: 2017年11月23日 上午8:30:28
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @functin
 */
public class Test {
	
	public static void main(String[] args) {
		
		Dog d = new Dog("小王");
		System.out.println("小狗的名字："+d.getName());
		
		Mouse m = new Mouse("杰克","米老鼠");
		System.out.println("老鼠的名字是:"+m.getName());
		System.out.println("老鼠的种类是:"+m.getKind());
		
		d.eat();
		d.Wow();
		
		m.eat();
		m.Wow();
	}

}
