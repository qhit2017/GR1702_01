/**
 * 
 */

/** 
 * @author  ���� :xuyunmeng
 * @date    ����ʱ�䣺2017��11��16�� ����8:44:37 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {
	public static void main(String[] args) {
		Police dog =new Police();
		
		dog.breed="��������Ȯ";
		dog.setColor("��ɫ");
		dog.weight=30;
		dog.age=2;
		dog.eyecolor="��ɫ";
		dog.number=4;
		dog.speed=("30km/h");
		
		System.out.println("����Ʒ���� "+dog.breed+"\n"
		+"ë����ɫ�� "+dog.setColor()+"\n"+"���������� "+dog.weight+"\n"
		+"���������� "+dog.age+"\n"+"���۾�����ɫ�� "+dog.eyecolor+"\n"
		+"���ȵ����� "+dog.number+"\n"+"����ʱ���� "+dog.speed+"\n"	);	
		
		dog.eat();
		dog.work();
	}
}
