package com.xiajie;
/**
 * @author  作者  E——mai l:程洁/夏杰 2564963490@QQ.com/378901749
 * @date    创建时间: 2017年11月23日 上午8:11:16
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @functin
 */
public class Dog  implements IZoo{
	//b.创建狗，实现动物这个接口。要求狗具有的属性包括：姓名、品种、颜色、年龄（属性私有） ，并创建两种构造方法（1 无参构造方法 2 参数为姓名的构造方法）
	private String name;
	private String kind;
	private String color;
	private int age;
	
	

	/**
	 * 
	 */
	public Dog() {
	}

	
	/**
	 * @param name
	 */
	public Dog(String name) {
		this.name = name;
	}


	@Override
	public String eat() {
		System.out.println("啊呜！！");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Wow() {
		System.out.println("哇哦！！");
		// TODO Auto-generated method stub
		return null;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
