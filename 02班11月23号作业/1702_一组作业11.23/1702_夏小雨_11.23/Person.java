package xiaxiaoyu;

public abstract class Person {
String name;
int age;


	public Person(String name, int age) {
	this.name = name;
	this.age = age;
}


	public abstract String getContent();
	
	void say(){
		System.out.println();
	}
}
