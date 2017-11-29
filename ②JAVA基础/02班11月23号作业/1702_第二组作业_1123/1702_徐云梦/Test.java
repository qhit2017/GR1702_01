/**
 * 
 */

/** 
 * @author  作者 :xuyunmeng
 * @date    创建时间：2017年11月23日 上午9:32:49 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {
	public static void main(String[] args) {
		//实例化
		Dog dog = new Dog();
		dog.name="豆豆";
		System.out.println(dog.name);
		dog.breed="拉布拉多犬";
		System.out.println(dog.breed);
		dog.colour="黄色";
		System.out.println(dog.colour);
		dog.getAge();
		System.out.println(dog.getAge());
	}

}
