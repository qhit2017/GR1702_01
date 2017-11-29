package D2;

public class Test {
public static void main(String[] args) {
	

	Student a =new Student("小智", 15);
	System.out.println("姓名："+a.name);
	System.out.println("年龄："+a.age);
	a.say("职业：");
	
	System.out.println("\t\t");
	
	Workder b =new Workder("张玉", 18);
	System.out.println("姓名："+b.name);
	System.out.println("年龄："+b.age);

	
	b.say("职业：");
	
}
}