package Dog;
/** 
 * @author  ���� E-mail:738348954@qq.com
 * @date    ����ʱ�䣺2017��11��15�� ����8:33:24 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {
public static void main(String[] args) {
	policeDog dog =new policeDog();
	dog.setBreed("��ʿ��");
	dog.setColour("��ɫ");
	dog.setWeight(30);
	dog.setAge(6);
	dog.eye ="��ɫ";
	dog.leg=4;
	dog.speed="50km/h";
	System.out.println("�ù���Ʒ��Ϊ��"+dog.getBreed());
	System.out.println("��ɫΪ��"+dog.getColour());
	System.out.println("����Ϊ:"+dog.getWeight());
	System.out.println("����Ϊ:"+dog.getAge());
	System.out.println("�۾���ɫΪ��"+dog.eye);
	System.out.println("��Ȯ������Ϊ��"+dog.leg);
	System.out.println("ʱ��Ϊ��" +dog.speed);
	dog.eat();
	dog.work();
	
}
}
