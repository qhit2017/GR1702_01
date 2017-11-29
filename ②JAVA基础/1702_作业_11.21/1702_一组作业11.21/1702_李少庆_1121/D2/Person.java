package D2;

public abstract class Person {

	String name;
	int age;
	
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	

	abstract String getContent();
	
	
	void say(String a){
		System.out.println(a+getContent());
	}


	
	
}
