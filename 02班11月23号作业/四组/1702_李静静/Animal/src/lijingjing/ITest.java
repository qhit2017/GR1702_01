package lijingjing;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��23�� ����7:51:15 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ITest {

	public static void main(String[] args) {
		IDog dog = new IDog();
		dog.setName("����");
		System.out.println(dog.getName());
		System.out.println(dog.toString());
		IAnimal.eat();
		IAnimal.wow();
		IMouse mouse = new IMouse();
		mouse.setName("����");
		System.out.println(mouse.toString());
		
	}
}
