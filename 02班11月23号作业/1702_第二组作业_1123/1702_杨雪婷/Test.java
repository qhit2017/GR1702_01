package yangxueting;
/** 
 * @author  ���� qqE-mail:157334005@qq.com
 * @date    ����ʱ�䣺2017��11��23�� ����7:37:25 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {
	public static void main(String[] args) {
		Dog h=new Dog();
		h.setName("��������");
		h.setBreed("��Ȯ");
		h.setColour("��ɫ");
		h.setAge(7.5);
		h.eat();
		h.wow();
		System.out.println();
		
		Mouse j=new Mouse();
		j.setName("��ķ");
		j.setBreed("����");
		j.setLegs(4);
		j.setWeight(1);
		j.eat();
		j.wow();
}
}