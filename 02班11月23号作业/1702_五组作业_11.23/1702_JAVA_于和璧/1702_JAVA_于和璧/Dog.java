package com.zk;

public class Dog implements IZoology{
	
	/*b.创建狗，实现动物这个接口。要求狗具有的属性包括：
	姓名、品种、颜色、年龄（属性私有） ，并创建两种构造方法
	（1 无参构造方法 2 参数为姓名的构造方法）
	*/

	String name;//姓名
	String variety;//品种
	String colour;//颜色
	private int age;//年龄

	public String getEat() {
		// TODO Auto-generated method stub
		return "狗吃骨头！";
	}

	public String getWow() {
		// TODO Auto-generated method stub
		return "狗汪汪汪叫！";
	}
	
	public Dog() {
		
		
	}

	public Dog(String name) {
		
		this.name = name;
		
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getVariety() {
		return variety;
	}
	public void setVariety(String variety) {
		this.variety = variety;
	}

	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
	
	
	

	
	
	
	

	
	}
	
	

	
	


