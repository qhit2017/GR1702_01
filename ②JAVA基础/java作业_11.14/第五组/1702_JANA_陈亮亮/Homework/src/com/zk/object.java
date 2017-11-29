package com.zk;

import java.util.Scanner;

import javax.xml.ws.handler.MessageContext.Scope;

/**制作者：陈亮亮
 *制作时间：2017年11月13日下午8:24:18
 *邮箱：2507147605@qq.com
 */
public class object {
public static void main(String[] args) {
	System.out.println("第三题");
	Scanner in=new Scanner(System.in);
	System.out.println("请输入第一个成绩");
	int score=in.nextInt();
	System.out.println("该学生的成绩是:"+score);
	if(score>=90){
		System.out.println("A");
		
	}if(score<=89&&score>=60){
		System.out.println("B");
	}if(score<=60){
		System.out.println("c");
	}
	
}
}
