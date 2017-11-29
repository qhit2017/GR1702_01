/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月15日 下午8:18:48 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
*/
package com.qhit.zgd;

public class Dog extends Animal{
	
	private String PingZhong;
	private String maocolor;
	private int    age;
	private String TiZhong;
	
	void wow(){
		System.out.println("汪汪汪");
	}
	void eat(){
		System.out.println("吃吃吃");
	}
    void sleep(){
    	System.out.println("睡觉 ");
    	
    }
	public String getPingZhong() {
		return PingZhong;
	}
	public void setPingZhong(String pingZhong) {
		PingZhong = pingZhong;
	}
	public String getColor() {
		return maocolor;
	}
	public void setColor(String color) {
		this.maocolor = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTiZhong() {
		return TiZhong;
	}
	public void setTiZhong(String tiZhong) {
		TiZhong = tiZhong;
	}
    
}
