package asfsa;

public class Test {
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.setName("����Ȯ");
		dog.setVariety("����Ȯ��");
		dog.setColour("Black and white");
		dog.setAge(5);
		System.out.println(dog.toString());
		Mouse mouse = new Mouse();
		
		mouse.setName("����");
		mouse.setVariety("С����");
		mouse.setLeg(4);
		mouse.setWeight("6��");
		mouse.toString();
		System.out.println(mouse.toString());
		IAnimal.eat();
		IAnimal.wow();
	}

}
