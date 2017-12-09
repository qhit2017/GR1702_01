package com.xxy;

import java.util.ArrayList;
import java.util.Scanner;

public class Systems implements IMarking {
	


	public void infohelp(){
		System.out.println("高考成绩系统");
		System.out.println("1	录入考生的高考信息");
		System.out.println("2	显示所有考生信息");
	}
	@Override
	public void addMarkingSystem(ArrayList<MarkingSystem> arrayList, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		
if (a.length!=5) {
	System.out.println("你输入的有误");
} else {
	MarkingSystem markingSystem = new MarkingSystem ();
	markingSystem.setName(a[0]);
	markingSystem.setNum(a[1]);
	markingSystem.setMathematics(Double.parseDouble(a[2]));
	markingSystem.setEnglish(Double.parseDouble(a[3]));
	markingSystem.setLanguage(Double.parseDouble(a[4]));
	
	arrayList.add(markingSystem);
	
	System.out.println(markingSystem);
}
}

	@Override
	public void infoMarkingSystem(ArrayList<MarkingSystem> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			MarkingSystem markingSystem = arrayList.get(i);
			System.out.println(markingSystem.toString());
		}
	
	}

	@Override
	public void findByName(ArrayList<MarkingSystem> arrayList, String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findByNum(ArrayList<MarkingSystem> arrayList, String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findByLanguage(ArrayList<MarkingSystem> arrayList, String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findByMathematics(ArrayList<MarkingSystem> arrayList,
			String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findByEnglish(ArrayList<MarkingSystem> arrayList, String name) {
		// TODO Auto-generated method stub
		
	}

}
