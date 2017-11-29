package com.ssx;

public class Test {
public static void main(String[] args) {
	Student st = new Student();
	System.out.println("她叫"+st.name);
	System.out.println("今年"+st.age+"岁");
	System.out.print("她，");
	st.say();
	
	//---------------------------------
	
	Worker we = new Worker();
	System.out.println("她是"+we.name);
	System.out.println("现在"+we.age+"岁");
	System.out.print("她，");
	we.say();
}
}
