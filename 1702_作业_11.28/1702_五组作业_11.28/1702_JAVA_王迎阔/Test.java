package com.qhit.wyk;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:34:47 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {
		
		int[]a= {17,8,9,10,12,13,14,15,16,7};

		Scanner sc = new Scanner(System.in);
		ScoerImplements scoerImplements = new ScoerImplements();
		boolean isQuit =true;
		String s;
		scoerImplements.help();
		while (isQuit) {
			System.out.println("��������Ҫִ�е�ָ������س���");
			s=sc.next();
			switch (s) {
			case "sum":
				int sum=scoerImplements.getsum(a);
				System.out.println("�ܷ���"+sum);
				break;
				
			case"Average":
				
				int average = scoerImplements.getAverage(a);
				System.out.println("ƽ������"+average);
				break;
				
				
				
			case"Max":
				System.out.println("���ֵΪ:"+scoerImplements.getMax(a));
				break;
				
				
			case"min":
				System.out.println("��СֵΪ:"+scoerImplements.getmin(a));
				break;
				
				
				
				
			case "Not":	
				System.out.println("�����������Ϊ:"+scoerImplements.getNot60(a)+"��");
				break;
				
				
			case"Info":
				scoerImplements.info(a);
				
				break;
				
				
			case"Sort":
				
				scoerImplements.sort(a);
				
				break;
				
				
			case"Quit":
				isQuit=false;
				break;
			default:
				break;
			}
		}
		System.out.println("�ݰ�");
	}
}


