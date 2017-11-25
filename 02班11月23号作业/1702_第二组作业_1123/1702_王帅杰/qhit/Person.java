package qhit;

public  abstract class  Person {

	
		String name ;
		int age;
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
		public abstract String getContent(String character);
		String say(){
			System.out.println(this.getContent(name));
			return name;
		}
		
		
	
}
