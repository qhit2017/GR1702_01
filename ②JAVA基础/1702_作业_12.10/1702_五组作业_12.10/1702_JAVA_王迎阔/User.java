package com.user;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author  ���� E-mail:29@qq.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:24:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class User implements Iuser {

	

	void help(){
		System.out.println("-----������ѯϵͳ-----");
		System.out.println("��1��add��Ӹ�����Ϣ");
		System.out.println("��2��find���Ҹ�����Ϣ");
		System.out.println("��3��modification�޸ĸ�����Ϣ");
		System.out.println("��4��removeɾ��������Ϣ");
		System.out.println("��5��info����������Ϣ");
	}
	@Override
	public void addEmployee(ArrayList<ScoreUser> arrayList, Scanner sc) {
		String s = sc.next();
		
		String[] arrs = s.split(",");
		 
		int leanth = arrs.length;
		if(leanth!=3){
			System.out.println("���������Ϣ���������������룬��ʽ����:");
			System.out.println("007����С������");
		}else{
			ScoreUser ScoreUser=new ScoreUser();
			ScoreUser.setId(arrs[0]);
			ScoreUser.setName(arrs[1]);
			ScoreUser.setSex(arrs[2]);
			
			arrayList.add(ScoreUser);
			System.out.println(ScoreUser.toString());
		}

	}

	@Override
	public void findEmployee(ArrayList<ScoreUser> arrayList, String name) {
	 for (int i = 0; i < arrayList.size(); i++) {
		 ScoreUser ScoreUser=arrayList.get(i);
		 String string = ScoreUser.toString();
		 System.out.println(string);
	}

	}

	@Override
	public void modificationEmployee(ArrayList<ScoreUser> arrayList, String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeEmployee(ArrayList<ScoreUser> arrayList, Scanner sc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void infoEmployee(ArrayList<ScoreUser> arrayList, String name) {
		// TODO Auto-generated method stub

	}

}
