package com.User;
/** 
 * @author  ���� E-mail:1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class User {
	
	//1����Ա����Ϣ��װ��User��Ķ���
	//ʹ��HashMap���󱣴�Ա�����󣬲�������Ϊ��tom����Ա����Ϣ������������Ա����Ϣ
	//�ṩ���϶���ĳ�ʼ������ӡ����ҡ��޸ġ�ɾ����������
	//����ʾ����HashMap�����Ԫ��ʹ��put(key , value)������ȡֵͨ��get(key)�õ�Valueֵ������HashMap��Ҫ�ȵõ����������е�key����ͨ��key�õ���Ӧ��valueֵ ����

	private String name;
	private String id;
	private String sex;
	private double salary;
	
	public User() {
		
	}


	public User(String name,String id, String sex, double salary) {
		
		this.name = name;
		this.id = id;
		this.sex = sex;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", sex=" + sex
				+ ", salary=" + salary + "]";
	}
	
	
}
