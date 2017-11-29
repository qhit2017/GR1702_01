package person;

public class DogTest {
public static void main(String[] args) {
	Dog dog1=new Dog();
	Dog dog2=new Dog("汤姆");
	dog1.setAge(7);
	dog1.setBreed("泰迪");
	dog1.setColor("黄色");
	System.out.println("名称:"+dog2.getName()+"\n"
			+"品种:"+dog1.getBreed()+"\n"
			+"颜色:"+dog1.getColor()+"\n"
			+"年龄:"+dog1.getAge());
	System.out.println(dog2.geteat()+"\n"+dog2.getcry());
	
}
}
