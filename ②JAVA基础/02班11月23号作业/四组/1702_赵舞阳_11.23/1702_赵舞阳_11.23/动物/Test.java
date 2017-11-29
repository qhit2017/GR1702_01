/*
 * d.创建测试类，分别创建狗和老鼠的实例化对象，
 * 给对象的属性赋值，并且调用对象的吃、叫的方法
 */
public class Test {

	public static void main(String[] args) {
		Dog dog = new Dog("比特犬");
		System.out.println(dog.getName());
		Mouse mouse = new Mouse();
		mouse.setBreed("波斯猫");
		System.out.println(mouse.getBreed());
		mouse.setName("小白");
		System.out.println(mouse.getName());
		dog.eat();
		dog.say();
	}
}
