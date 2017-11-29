package com.kong.qinghua;
/** 
 * @author  作者 E-mail:1299394372@qq.com
 * @date    创建时间：2017年11月13日 下午8:09:21 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Category {
	
	
	private String serial;//编号
	String name;//名称
	double price;//价格
	String model;//型号
	String category;//类别
	
	
	//不带参数的构造方法
	Category(){
		
	}
	
	//带三个参数的构造方法
	public Category( String  serial,String names,double prices){
		
		this.serial=serial;
		 this.name= names;
		 this.price=prices;
		
	}
	
	//带五个参数的构造方法
	public Category( String  serial,String name,double price,String model,String category){
		
		this.serial=serial;
		this. name= name;
		this.price=price;
		this. model=model;
		this.category=category;
		
	
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getSerial() {
		return serial;
	}

	
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

