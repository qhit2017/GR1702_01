
public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("����");
		dog.setVariety("����");
		dog.setColour("Black and white");
		dog.setAge(5);
		System.out.println(dog.toString());
		Mouse mouse = new Mouse();
		
		mouse.setName("С��");
		mouse.setBreed("С����");
		mouse.setLegs("4");
		mouse.setWeight(5);
		mouse.toString();
		System.out.println(mouse.toString());
		Animal.eat();
		Animal.wow();
	}

}
