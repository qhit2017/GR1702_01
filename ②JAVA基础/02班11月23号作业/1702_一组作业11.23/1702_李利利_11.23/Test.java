
public class Test {
	
	public static void main(String[] args) {
		//����ʵ����
		Dog dog = new Dog();
		dog.name="��";
		System.out.println(dog.name);
		dog.breed="������";
		System.out.println(dog.breed);
		dog.colour="�ڰ�ɫ";
		System.out.println(dog.colour);
		dog.getAge();
		System.out.println(dog.getAge());
		
		dog.getEat();
		System.out.println(dog.getEat());
		dog.getWow();
		System.out.println(dog.getWow());
		
		//�����ʵ����
		Mouse mouse = new Mouse();
		mouse.name="����";
		System.out.println(mouse.name);
		mouse.breed="Ұ��";
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
