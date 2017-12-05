package com.qhit;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactsString implements IContactsBook {
            void Info(){
            	System.out.println("-----通讯录管理-----");
            	System.out.println("【1】添加通讯录信息");
            	System.out.println("【2】查看以输入的通讯录信息");
            	System.out.println("【3】姓名查找");
            	System.out.println("【4】性别查找");
            	System.out.println("【5】电话号码查找");
            	System.out.println("【6】退出系统请输入Quit");
            }
	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		//接受输入的值
	String s = sc.next();
	    //拆分:把上面接受的字符串拆分成字符数组
	String[] a = s.split(",");
	if(a.length !=3){
		System.out.println("你输入的格式不对,请重新输入,请按Jackie,man,12547896这种格式输入");
	}else{
		Contacts contacts=new Contacts(a[0],a[1],a[2]);
		arrayList.add(contacts);
		System.out.println(contacts.toString());
	}
	   //通过上面的信息构造一个Contacts的实体信息
	Contacts contacts=new Contacts(a[0],a[1],a[2]);
	   //添加到arrayList里面
	arrayList.add(contacts);
	  //打印刚刚添加的这条通讯录信息
	System.out.println(contacts.toString());

	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			 Contacts contacts = arrayList.get(i);
			 System.out.println(contacts.toString());
		}

	}

	@Override
	public void findByName(ArrayList<Contacts> arrayList, String name) {
			boolean isFind=false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String String = contacts.getName();
			if(name.equals(String)){
				System.out.println(contacts.toString());
			isFind=true;
				
			}
		}
              if(!isFind){
            	  System.out.println("你要查找的对象不存在");
              }
	}
	 public void findBysex(ArrayList<Contacts> arrayList, String sex) {
		boolean isFind=false;
	for (int i = 0; i < arrayList.size(); i++) {
		Contacts contacts = arrayList.get(i);
		String String = contacts.getSex();
		if(sex.equals(String)){
			System.out.println(contacts.toString());
		isFind=true;
			
		}
	}
          if(!isFind){
        	  System.out.println("你要查找的对象不存在");
          }
}
	 public void findBynum(ArrayList<Contacts> arrayList, String num) {
			boolean isFind=false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String String = contacts.getName();
			if(num.equals(String)){
				System.out.println(contacts.toString());
			isFind=true;
				
			}
		}
           if(!isFind){
         	  System.out.println("你要查找的对象不存在");
           }
	}
	@Override
	public void findByName(ArrayList<Contacts> arrayList, Scanner sc,
			String Name) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void findBySex(ArrayList<Contacts> arrayList, Scanner sc, String Sex) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void findByNum(ArrayList<Contacts> arrayList, Scanner sc, String Num) {
		// TODO Auto-generated method stub
		
	}

}
