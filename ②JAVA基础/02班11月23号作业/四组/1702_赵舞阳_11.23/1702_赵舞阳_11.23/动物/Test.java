/*
 * d.���������࣬�ֱ𴴽����������ʵ��������
 * ����������Ը�ֵ�����ҵ��ö���ĳԡ��еķ���
 */
public class Test {

	public static void main(String[] args) {
		Dog dog = new Dog("����Ȯ");
		System.out.println(dog.getName());
		Mouse mouse = new Mouse();
		mouse.setBreed("��˹è");
		System.out.println(mouse.getBreed());
		mouse.setName("С��");
		System.out.println(mouse.getName());
		dog.eat();
		dog.say();
	}
}
