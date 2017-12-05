package lishaoqing;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactsImplements implements IContacts {

	void help(){
		System.out.println("----通讯录管理帮助信息----");
		System.out.println("请输入数字");
		System.out.println("1  增加联系人");
		System.out.println("2  显示所有联系人");
		System.out.println("3  通过姓名查找联系人");
		System.out.println("4  通过性别查找联系人");
		System.out.println("5  通过号码查找联系人 ");
		System.out.println("6  退出");
	}
	
	
	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String s = sc.next();
		
		String[] a = s.split(",");
		
		if (a.length !=3) {
			System.out.println("长度不对，请重新输入");
		} else {
			Contacts contacts=new Contacts(a[0], a[1], a[2]);
			arrayList.add(contacts);
			System.out.println(contacts.toString());
		}
		
		
	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {
		// TODO Auto-generated method stub
		for (Contacts contacts : arrayList) {
			System.out.println(contacts.toString());
		}
	}

	@Override
	public void findByNameSexNum(ArrayList<Contacts> arrayList, String category,Scanner sc) {
		// TODO Auto-generated method stub
		
		String string = sc.next();
		if (category.equals("姓名")) {
			
			for (Contacts contacts : arrayList) {
				boolean isname=false;
				String name = contacts.getName();
				if (string.equals(name)) {
					System.out.println(contacts.toString());
					isname=true;
					}
				
				if(!isname){
					System.out.println("您搜索的联系人不存在");
				}
		}
	}
		if (category.equals("性别")) {
			for (Contacts contacts : arrayList) {
				boolean isname=false;
				String sex = contacts.getSex();
				if (string.equals(sex)) {
					System.out.println(contacts.toString());
					isname=true;
				}				
				if(!isname){
					System.out.println("您搜索的联系人不存在");
				}
			}
		}
		if (category.equals("号码")) {
			for (Contacts contacts : arrayList) {
				boolean isname=false;
				String num = contacts.getTelnum();
				if (string.equals(num)) {
					System.out.println(contacts.toString());
					isname=true;
				}
				if(!isname){
					System.out.println("您搜索的联系人不存在");
				}
			}
		}
	}
}
