package com.zk;

import java.util.Scanner;

import javax.xml.ws.handler.MessageContext.Scope;

/**�����ߣ�������
 *����ʱ�䣺2017��11��13������8:24:18
 *���䣺2507147605@qq.com
 */
public class object {
public static void main(String[] args) {
	System.out.println("������");
	Scanner in=new Scanner(System.in);
	System.out.println("�������һ���ɼ�");
	int score=in.nextInt();
	System.out.println("��ѧ���ĳɼ���:"+score);
	if(score>=90){
		System.out.println("A");
		
	}if(score<=89&&score>=60){
		System.out.println("B");
	}if(score<=60){
		System.out.println("c");
	}
	
}
}
