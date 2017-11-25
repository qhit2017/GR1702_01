package guo;
/** 
 * @author  作者 E-mail:2379675496@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {
	
	public static void main(String[] args) {
		
		//d.创建测试类，分别创建狗和老鼠的实例化对象，给对象的属性赋值，并且调用对象的吃、叫的方法
		
		Dog  dog = new Dog();
		dog.setName("胖胖");
		dog.setVariety("泰迪");
		dog.setColour("棕黄色");
		dog.setAge(3);
		
		System.out.println("名字叫："+dog.getName()+"\n"+"品种为："
							+dog.getVariety()+"\n"+"毛色为："
							+dog.getColour()+"\n"+"年龄为："+dog.getAge()+"岁");
		
		System.out.println(dog.getWow());
		
		System.out.println(dog.getEat());
		
		System.out.println();
		
		Mouse mouse = new Mouse();
		
		mouse.setName("小黑");
		mouse.setVariety("米老鼠");
		mouse.setLeg(2);
		mouse.setWeight(6.5);
		
		System.out.println("名字叫："+mouse.getName()+"\n"+"品种为："
							+mouse.getVariety()+"\n"+"腿的数量为："
							+mouse.getLeg()+"\n"+"体重为："+mouse.getWeight()+"斤！");
		
		System.out.println(mouse.getEat());
		
		System.out.println(mouse.getWow());

		
		
		
		
	}

}
