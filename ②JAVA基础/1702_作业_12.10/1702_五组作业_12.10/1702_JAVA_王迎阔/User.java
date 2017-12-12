package com.user;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author  作者 E-mail:29@qq.com
 * @date    创建时间：2017年11月27日 下午4:24:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class User implements Iuser {

	

	void help(){
		System.out.println("-----版主查询系统-----");
		System.out.println("【1】add添加个人信息");
		System.out.println("【2】find查找个人信息");
		System.out.println("【3】modification修改个人信息");
		System.out.println("【4】remove删除个人信息");
		System.out.println("【5】info遍历个人信息");
	}
	@Override
	public void addEmployee(ArrayList<ScoreUser> arrayList, Scanner sc) {
		String s = sc.next();
		
		String[] arrs = s.split(",");
		 
		int leanth = arrs.length;
		if(leanth!=3){
			System.out.println("您输入的信息错误，请您重新输入，格式如下:");
			System.out.println("007，李小豪，男");
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
