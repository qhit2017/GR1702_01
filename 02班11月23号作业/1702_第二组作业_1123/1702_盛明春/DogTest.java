package person;

public class DogTest {
public static void main(String[] args) {
	Dog dog1=new Dog();
	Dog dog2=new Dog("��ķ");
	dog1.setAge(7);
	dog1.setBreed("̩��");
	dog1.setColor("��ɫ");
	System.out.println("����:"+dog2.getName()+"\n"
			+"Ʒ��:"+dog1.getBreed()+"\n"
			+"��ɫ:"+dog1.getColor()+"\n"
			+"����:"+dog1.getAge());
	System.out.println(dog2.geteat()+"\n"+dog2.getcry());
	
}
}
