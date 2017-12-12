package com.user;
/**
 * @author  ���� E-mail:295852280@qq.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:24:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ScoreUser {

	//1����Ա����Ϣ��װ��User��Ķ���
	//ʹ��HashMap���󱣴�Ա�����󣬲�������Ϊ��tom����Ա����Ϣ������������Ա����Ϣ��
	//�ṩ���϶���ĳ�ʼ������ӡ����ҡ��޸ġ�ɾ����������
	//����ʾ����HashMap�����Ԫ��ʹ��put(key , value)������
	//ȡֵͨ��get(key)�õ�Valueֵ������HashMap��Ҫ�ȵõ����������е�key����ͨ��key�õ���Ӧ��valueֵ ����
	private String id;
	private String name;
	private String Sex;
	
	
	/**
	 * 
	 */
	public ScoreUser() {
		super();
	}


	/**
	 * @param name
	 * @param sex
	 * @param id
	 */
	public ScoreUser( String id,String name, String sex) {
		super();
		this.id = id;
		this.name = name;
		Sex = sex;
		
	}
	
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSex() {
		return Sex;
	}


	public void setSex(String sex) {
		Sex = sex;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", Sex=" + Sex + "]";
	}


	
	
}
