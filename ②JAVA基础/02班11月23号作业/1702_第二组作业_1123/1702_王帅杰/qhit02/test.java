package qhit02;

public class test {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "��";
		System.out.println("����:" + dog.name);
		dog.breed = "��ʿ��";
		System.out.println("Ʒ��:" + dog.breed);
		dog.color = "��ɫ";
		System.out.println("��ɫ:" + dog.color);
		System.out.println("��:" + dog.getEat());
		System.out.println("��:" + dog.getCry());
		System.out.println("����:" + dog.getAge());

		Mouse mouse = new Mouse();
		mouse.name = "��";
		System.out.println("����:" + mouse.name);
		mouse.breed = "����";
		System.out.println("Ʒ��:" + mouse.breed);
		mouse.leg = 4;
		System.out.println("������:" + mouse.leg);
		System.out.println("����:" + mouse.getWeight());
		System.out.println("��:" + mouse.getEat());
		System.out.println("��:" + mouse.getCry());
	}
}
