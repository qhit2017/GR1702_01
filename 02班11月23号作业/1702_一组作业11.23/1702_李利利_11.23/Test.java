
public class Test {
	
	public static void main(String[] args) {
		//狗的实例化
		Dog dog = new Dog();
		dog.name="大花";
		System.out.println(dog.name);
		dog.breed="吉娃娃";
		System.out.println(dog.breed);
		dog.colour="黑白色";
		System.out.println(dog.colour);
		dog.getAge();
		System.out.println(dog.getAge());
		
		dog.getEat();
		System.out.println(dog.getEat());
		dog.getWow();
		System.out.println(dog.getWow());
		
		//老鼠的实例化
		Mouse mouse = new Mouse();
		mouse.name="束束";
		System.out.println(mouse.name);
		mouse.breed="野生";
		System.out.println(mouse.breed);
		mouse.legs=4;
		System.out.println(mouse.legs);
		mouse.getWeight();
		System.out.println(mouse.getWeight());
		
		mouse.getEat();
		System.out.println(mouse.getEat());
		mouse.getWow();
		System.out.println(mouse.getWow());
	}
  
}
