/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��13�� ����8:08:14 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

import java.util.function.Predicate;

public class Commodity {
	// ��������Ա����Ʒ�࣬��ͨ�����ù��췽������ʵ����
	// ������Ʒ�࣬��������Ʒ��š����ơ��۸��ͺš����������ԣ�
	// ���ṩ������ͬ�Ĺ��췽�������������ģ�����š����ơ��۸����������ģ�
	// ����������Ĺ��췽�����ֱ�����������췽��ʵ��������
	// ���۲��Ա������ֵ�����
	// ����һ��˽�еı���private
	String SerialNumbe;
	String name;
	int price;
	char model;
	String category;
	//����������
	Commodity() {
		System.out.println("����������");
	}
	//������������
	Commodity(String SerialNumbes,String names,int prices){
		SerialNumbe=SerialNumbes;
		name = names;
		price = prices;
	}
	//�����������
	Commodity(String SerialNumbez,String namez,int pricez,char modelz,String categoryz){
		SerialNumbe = SerialNumbez;
		name = namez;
		price = pricez;
		model = modelz;
		category = categoryz;
	}

	}
	

	

	

	
	
	
	
		
	

