package com.ad;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:30:18 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class TestFill {

	public static void main(String[] args) {
		System.out.println("-----�ɼ�����-----");
		Scanner sc=new Scanner(System.in);
		System.out.println("����Ҫ�Զ��ٸ��ɼ������أ�");
		int a[]=new int[sc.nextInt()];
		for (int i = 0; i < a.length; i++) {
			System.out.println("�������"+(i+1)+"���ɼ���");
			a[i]=sc.nextInt();
		}
		System.out.println("������ϣ�������ָ������롾0���鿴������");
		Fill f=new Fill();
		boolean is=true;
		while(is){
			int ins=sc.nextInt();
			switch (ins) {
			case 0:
				f.help();
				break;
			case 1:
				System.out.println("���ֵ��"+f.max(a));
				break;
			case 2:
				System.out.println("��Сֵ��"+f.min(a));
				break;
			case 3:
				System.out.println("�ܷ���"+f.sum(a));
				break;
			case 4:
				System.out.println("ƽ������"+f.average(a));
				break;
			case 5:
				System.out.println("���гɼ���"+f.info(a));
				break;
			case 6:
				System.out.println("С��60���У�");
				f.less60(a);
				break;
			case 7:
				System.out.println("�������к��ǣ�"+f.sort(a));
				break;
			case 9:
				System.out.println("��л����ʹ�ã��ټ���");
				is=false;
				break;
			default:
				break;
			}
		}
		sc.close();

	}

}
