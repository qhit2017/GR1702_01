package com.zk.qhit;

public class Found {
String name;//名字
String id;  //学号
String level;//年级
 Found(String names, String ids, String levels) {
	
	this.name = names;
	this.id = ids;
	this.level = levels;
}
public static void main(String[] args) {
	Found a = new Found("李明","6547","17");
	System.out.println("李明："+a.name);
	System.out.println("6547:"+a.id);
	System.out.println("17:"+a.level);
}
}
