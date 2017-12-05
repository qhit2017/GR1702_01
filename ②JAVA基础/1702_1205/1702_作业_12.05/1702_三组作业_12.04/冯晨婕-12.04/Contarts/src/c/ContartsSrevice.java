package c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ContartsSrevice implements IContarts {
void helpinfo(){
	System.out.println("1	录入通讯录信息");
	System.out.println("2	显示所有通讯录信息");
	System.out.println("3	姓名搜索");
	System.out.println("4	性别搜索");
	System.out.println("5	电话搜索");
	System.out.println("6	退出功能");
 
}
	 
	@Override
	public void addContarts(ArrayList<Contarts> arrayList, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length != 3) {
			System.out.println("请重新输入,eg:（姓名，性别，号码）   ");
		} else {
			Contarts contarts = new Contarts(a[0], a[1], a[2]);
			arrayList.add(contarts);
			System.out.println(contarts.toString());
		}

	}

	@Override
	public void infoContarts(ArrayList<Contarts> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Contarts contarts = arrayList.get(i);
			System.out.println(contarts.toString());
		}
		/*
		 * 增强for循环 ``// for (Contarts contarts : arrayList) {
		 * System.out.println(contarts.toString()); }
		 */
		// 迭代
		/*
		 * Iterator<Contarts> iterator = arrayList.iterator(); while
		 * (iterator.hasNext()) { Contarts contarts = (Contarts)
		 * iterator.next(); System.out.println(contarts.toString()); }
		 */

	}

	@Override
	public void findByName(ArrayList<Contarts> arrayList, String name) {
		boolean isfind=true;
		for (int i = 0; i < arrayList.size(); i++) {
			Contarts contarts = arrayList.get(i);
			String string = contarts.getName();
			if (name.equals(string)) {
				System.out.println(contarts.toString());
				isfind=false;}}
		if(isfind){
		System.out.println("你要查找的对象不存在！");
	}
	}
	@Override
	public void findBySex(ArrayList<Contarts> arrayList, String sex) {
		boolean isfind=true;
		for (int i = 0; i < arrayList.size(); i++) {
			Contarts contarts = arrayList.get(i);
			String string = contarts.getSex();
			if (sex.equals(string)) {
				System.out.println(contarts.toString());
				isfind=false;
		}}
		if(isfind){
			System.out.println("你要查找的对象不存在！");
		}

	}

	@Override
	public void findByNum(ArrayList<Contarts> arrayList, String num) {
		boolean isfind=true;
		for (int i = 0; i < arrayList.size(); i++) {
			Contarts contarts = arrayList.get(i);
			String string = contarts.getTelnum();
			if (num.equals(string)) {
				System.out.println(contarts.toString());
				isfind=false;
			}}if(isfind){
				System.out.println("你要查找的对象不存在！");
			}
		

	}
}

// @Override
// public void findByNameSexNum(ArrayList<Contarts> arrayList, String category)
// {

