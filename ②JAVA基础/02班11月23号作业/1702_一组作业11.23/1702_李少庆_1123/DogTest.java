package animal;

public class DogTest {
public static void main(String[] args) {
	
	Dog dog = new Dog();
	
	Dog a = new Dog("С��");
	
	a.setColour("��ɫ");
	a.setBreed("����Ȯ");
	a.setAge("3");
	System.out.println("���֣�"+a.getName());
	System.out.println("��ɫ��"+a.getColour());
	System.out.println("Ʒ�֣�"+a.getBreed());
	System.out.println("���䣺"+a.getAge());
	
	System.out.println(a.getCall());
	System.out.println(a.getEat());
	
}
}
