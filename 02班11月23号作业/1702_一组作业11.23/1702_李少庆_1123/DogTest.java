package animal;

public class DogTest {
public static void main(String[] args) {
	
	Dog dog = new Dog();
	
	Dog a = new Dog("小黑");
	
	a.setColour("黑色");
	a.setBreed("牧羊犬");
	a.setAge("3");
	System.out.println("名字："+a.getName());
	System.out.println("颜色："+a.getColour());
	System.out.println("品种："+a.getBreed());
	System.out.println("年龄："+a.getAge());
	
	System.out.println(a.getCall());
	System.out.println(a.getEat());
	
}
}
