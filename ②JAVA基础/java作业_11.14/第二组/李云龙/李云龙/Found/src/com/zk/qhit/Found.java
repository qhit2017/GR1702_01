package com.zk.qhit;

public class Found {
String name;//����
String id;  //ѧ��
String level;//�꼶
 Found(String names, String ids, String levels) {
	
	this.name = names;
	this.id = ids;
	this.level = levels;
}
public static void main(String[] args) {
	Found a = new Found("����","6547","17");
	System.out.println("������"+a.name);
	System.out.println("6547:"+a.id);
	System.out.println("17:"+a.level);
}
}
