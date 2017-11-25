package Three;
//d.创建测试类，分别创建狗和老鼠的实例化对象，给对象的属性赋值，并且调用对象的吃、叫的方法
public class Tese {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.setEat("吃的方法");
		System.out.println(dog.getEat());
		dog.setCry("叫的方法");
		System.out.println(dog.getCry());
		Mouse mouse=new Mouse();
		mouse.setEat("吃");
		System.out.println(mouse.getEat());
		mouse.setCry("叫");
		
}
}