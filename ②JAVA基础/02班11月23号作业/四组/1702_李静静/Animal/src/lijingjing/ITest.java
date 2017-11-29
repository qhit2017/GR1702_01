package lijingjing;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月23日 下午7:51:15 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ITest {

	public static void main(String[] args) {
		IDog dog = new IDog();
		dog.setName("耳性");
		System.out.println(dog.getName());
		System.out.println(dog.toString());
		IAnimal.eat();
		IAnimal.wow();
		IMouse mouse = new IMouse();
		mouse.setName("杰瑞");
		System.out.println(mouse.toString());
		
	}
}
