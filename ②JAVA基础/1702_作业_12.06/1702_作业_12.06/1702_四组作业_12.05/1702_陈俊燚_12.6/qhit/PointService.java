//ʵ����
package com.qhit;

import java.util.ArrayList;
import java.util.Scanner;

public class PointService implements IPoints {
	void helpInfo(){
		System.out.println("---������ѯϵͳ---");
		System.out.println("1:¼�뿼���ĸ߿���Ϣ");
		System.out.println("2:��ʾ���п�����Ϣ");
		System.out.println("3:�����Ӳ˵�");
	}
	void help3(){
		System.out.println("1:��ӡ�ܷ���߷�");
		System.out.println("2:��ӡ��ѧ��߷�");
		System.out.println("3:��ӡ������߷�");
		System.out.println("3:��ӡӢ����߷�");
		System.out.println("4:�˳�");
	}

	//����
	public void addPoints(ArrayList<Points> arrayList, Scanner sc) {
		String string = sc.next();
		String[] a = string.split(",");
		if (a.length!=6) {
			System.out.println("������ĸ�ʽ���ԣ����������룺");
		}else{
			Points points=new Points(a[0], Double.parseDouble(a[1]), a[2], a[3], a[4], 0, Double.parseDouble(a[5]));
			arrayList.add(points);
			System.out.println(points.toString());
		}
		
		
	}

	//��ʾ����
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
