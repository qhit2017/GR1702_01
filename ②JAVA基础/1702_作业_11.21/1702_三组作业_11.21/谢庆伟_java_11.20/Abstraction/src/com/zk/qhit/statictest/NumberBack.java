package com.zk.qhit.statictest;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��20�� ����8:46:40 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class NumberBack {

	public static void main(String[] args) {
		//�����Ŀ
		System.out.println("�ġ��ж��Ƿ��������\n");
		//��ؿ���̨
		Scanner sc=new Scanner(System.in);
		//��ȡ�û�����ֵ
		System.out.println("����������ֵ��");
		int a=sc.nextInt();
		//�����洢�ǻ��
		boolean or=true;
		//��int��תΪString
		String s=""+a+"";
		//��StringתΪchar����
		char a1[] =s.toCharArray();
		//�ж���β��ӦԪ���Ƿ����
		for(int i=0;i<=a1.length/2;i++){
			if(a1[i]==a1[a1.length-1-i]){
				continue;
			}
			else{
				or=false;
				break;
			}
		}
		//������
		if(or){
			System.out.println(a+"�ǻ�����");
		}
		else{
			System.out.println(a+"���ǻ�����");
		}
		//�˳�����̨		
		sc.close();

	}

}
