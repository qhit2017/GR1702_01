/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��13�� ����8:06:44 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

import javax.xml.crypto.dsig.CanonicalizationMethod;

public class Admin {

	// ��������Ա����Ʒ�࣬��ͨ�����ù��췽������ʵ����
	// ������Ʒ�࣬��������Ʒ��š����ơ��۸��ͺš����������ԣ�
	// ���ṩ������ͬ�Ĺ��췽�������������ģ�����š����ơ��۸����������ģ�
	// ����������Ĺ��췽�����ֱ�����������췽��ʵ��������
	// ���۲��Ա������ֵ�����
	public static void main(String[] args) {

		Commodity a = new Commodity();
		System.out.println("����Ʒ�ı�ţ�"+a.SerialNumbe);
		System.out.println("����Ʒ�����ƣ�"+a.name);
		System.out.println("����Ʒ�ļ۸�"+a.price);
		System.out.println("����Ʒ���ͺţ�"+a.model);
		System.out.println("����Ʒ�����"+a.category);
		
		Commodity b = new Commodity("007","�����",3);
		System.out.println("\n"+"������������");
		System.out.println(b.SerialNumbe);
		System.out.println(b.name);
		System.out.println(b.price);
		
		Commodity c = new Commodity("008","�̲�",5,'A',"����");
		System.out.println("\n"+"�����������");
		System.out.println(c.SerialNumbe);
		System.out.println(c.name);
		System.out.println(c.price);
		System.out.println(c.model);
		System.out.println(c.category);
		
	}

}
