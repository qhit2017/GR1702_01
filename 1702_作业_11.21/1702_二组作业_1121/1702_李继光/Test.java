package com.ssx;

public class Test {
public static void main(String[] args) {
	Student st = new Student();
	System.out.println("����"+st.name);
	System.out.println("����"+st.age+"��");
	System.out.print("����");
	st.say();
	
	//---------------------------------
	
	Worker we = new Worker();
	System.out.println("����"+we.name);
	System.out.println("����"+we.age+"��");
	System.out.print("����");
	we.say();
}
}
