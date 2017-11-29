package asfsa;

public class Test {
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.setName("ƒ¡—Ú»Æ");
		dog.setVariety("¥Û–Õ»Æ¿‡");
		dog.setColour("Black and white");
		dog.setAge(5);
		System.out.println(dog.toString());
		Mouse mouse = new Mouse();
		
		mouse.setName("ø≠µŸ");
		mouse.setVariety("–°≤÷ Û");
		mouse.setLeg(4);
		mouse.setWeight("6ΩÔ");
		mouse.toString();
		System.out.println(mouse.toString());
		IAnimal.eat();
		IAnimal.wow();
	}

}
