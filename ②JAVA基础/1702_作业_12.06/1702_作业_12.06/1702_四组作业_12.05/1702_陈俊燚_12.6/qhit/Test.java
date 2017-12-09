package com.qhit;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Points>arrayList=new ArrayList<Points>();
		PointService pservice=new PointService();
		Scanner sc=new Scanner(System.in);
		pservice.helpInfo();
		
		int key=0;
		boolean isQuit=true;
		while (isQuit) {
			key=sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("请输入考生信息,格式如下：");
				System.out.println("大胖,145,45,85,74,204");
				pservice.addPoints(arrayList, sc);
				break;
			case 2:
				pservice.infoPoints(arrayList);
				break;
			case 3:
				pservice.help3();
				
				break;
			case 4:
				String num= sc.next();
				pservice.findByNum(arrayList, num);
				break;
			case 5:
				String ceteegory= sc.next();
 			pservice.findBylangmathEng(arrayList, ceteegory);
				break;
			case 6:
				String total= sc.next();
				pservice.findBytotal(arrayList, total);
				break;	
			case 7:
				isQuit=false;
				break;
			default:
				
				break;
			}
		}System.out.println("退出本系统！");
	}

}
