package com.zk;
/** 
 * @author  ���� �ں��
 * @date    ����ʱ�䣺2017��11��13�� 

����8:29:36 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class CommodityTest {

	public static void main(String[] args) {
		
		Commodity a = new Commodity();
	
		
		System.out.println("����Ʒ���Ϊ:"+a.number);
		System.out.println("����Ʒ��Ϊ:"+a.name);
		System.out.println("����Ʒ�۸�Ϊ:"+a.price);
		System.out.println("����Ʒ�ͺ�Ϊ:"+a.type);
		System.out.println("����Ʒ���Ϊ:"+a.sort);
		
		System.out.println();
		
		Commodity b = new Commodity(66,"������ϴ��Һ",15.5);
		System.out.println("����Ʒ���Ϊ:"+b.number);  
		System.out.println("����Ʒ��Ϊ:"+b.name);
		System.out.println("����Ʒ�۸�Ϊ:"+b.price);
		System.out.println("����Ʒ�ͺ�Ϊ:"+b.type);
		System.out.println("����Ʒ���Ϊ:"+b.sort);
		
		System.out.println();
		
		Commodity c = new Commodity(66,"������ϴ��Һ",15.5,'A',"������Ʒ");
		System.out.println("����Ʒ���Ϊ:"+c.number);
		System.out.println("����Ʒ��Ϊ:"+c.name);
		System.out.println("����Ʒ�۸�Ϊ:"+c.price);
		System.out.println("����Ʒ�ͺ�Ϊ:"+c.type);
		System.out.println("����Ʒ���Ϊ:"+c.sort);
		
		
	}
}
