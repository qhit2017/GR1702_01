package com.zk;

import java.util.Scanner;

/** 
 * @author  ���� �ں��
 * @date    ����ʱ�䣺2017��11��26�� ����3:17:18 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test04 {
	
  //�ɼ�>=90����A��ʾ,60-89��֮�����B��ʾ��
  //60�����µ���C��ʾ����дJAVA��������ɼ��������Ӧ�Ľ��(A����B����C)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����뿼�Գɼ���");
		
		int a = sc.nextInt();
		
		if(a>=90){
			
			System.out.println("A����");
			
		}else{
			
			if(a>=60 && a<=89){
				
				System.out.println("B����");
				
			}else{
				
				System.out.println("C����");
			}
			
		}
		sc.close();
	}
}
