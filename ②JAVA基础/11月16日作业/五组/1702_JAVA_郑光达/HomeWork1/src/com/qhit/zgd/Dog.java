/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��15�� ����8:18:48 
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
		System.out.println("������");
	}
	void eat(){
		System.out.println("�ԳԳ�");
	}
    void sleep(){
    	System.out.println("˯�� ");
    	
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
