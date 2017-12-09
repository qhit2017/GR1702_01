//实现类
package com.qhit;

import java.util.ArrayList;
import java.util.Scanner;

public class PointService implements IPoints {
	void helpInfo(){
		System.out.println("---分数查询系统---");
		System.out.println("1:录入考生的高考信息");
		System.out.println("2:显示所有考生信息");
		System.out.println("3:弹出子菜单");
	}
	void help3(){
		System.out.println("1:打印总分最高分");
		System.out.println("2:打印数学最高分");
		System.out.println("3:打印语文最高分");
		System.out.println("3:打印英语最高分");
		System.out.println("4:退出");
	}

	//增加
	public void addPoints(ArrayList<Points> arrayList, Scanner sc) {
		String string = sc.next();
		String[] a = string.split(",");
		if (a.length!=6) {
			System.out.println("您输入的格式不对，请重新输入：");
		}else{
			Points points=new Points(a[0], Double.parseDouble(a[1]), a[2], a[3], a[4], 0, Double.parseDouble(a[5]));
			arrayList.add(points);
			System.out.println(points.toString());
		}
		
		
	}

	//显示所有
	public void infoPoints(ArrayList<Points> arrayList) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arrayList.size(); i++) {
			Points points=arrayList.get(i);
		System.out.println(points.toString());	
		}

	}

	@Override
	public void findByName(ArrayList<Points> arrayList, String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void findByNum(ArrayList<Points> arrayList, String num) {
		// TODO Auto-generated method stub

	}

	@Override
	public void findBylangmathEng(ArrayList<Points> arrayList, String ceteegory) {
		// TODO Auto-generated method stub

	}

	@Override
	public void findBytotal(ArrayList<Points> arrayList, String total) {
		// TODO Auto-generated method stub

	}
	

}
