package com.kong.qinghua;
/** 
 * @author  ���� E-mail:1299394372@qq.com
 * @date    ����ʱ�䣺2017��11��13�� ����8:09:21 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Category {
	
	
	private String serial;//���
	String name;//����
	double price;//�۸�
	String model;//�ͺ�
	String category;//���
	
	
	//���������Ĺ��췽��
	Category(){
		
	}
	
	//�����������Ĺ��췽��
	public Category( String  serial,String names,double prices){
		
		this.serial=serial;
		 this.name= names;
		 this.price=prices;
		
	}
	
	//����������Ĺ��췽��
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

