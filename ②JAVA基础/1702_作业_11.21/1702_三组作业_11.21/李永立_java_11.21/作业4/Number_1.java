package com.zk.qhit.statictest;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:������271406@163.com
 * @date    ����ʱ�䣺2017��11��20�� ����7:21:46 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Number_1 {
	//һ��5λ�����ж����ǲ��ǻ�������
	//��12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����λ����");
		int i = sc.nextInt();
		if(i<10000||i>99999){
			System.out.println("������������������");
		}
		
		else if((i%10==i/10000)&&(i/1000%10==i/10%10)){
				System.out.println("�����ǻ�����");
			}else{
				System.out.println("���ǻ�����");
			}
				
			}
			
		}



