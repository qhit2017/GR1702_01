package Liyongli;
/** 
 * @author  ���� E-mail:������271406@163.com
 * @date    ����ʱ�䣺2017��11��16�� ����8:14:58 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Test_4 {
	//4  ����һ�������࣬ʵ����һ����Ȯ����
	
	public static void main(String[] args) {
		//ʵ��������

		Police_dog dog = new Police_dog();
		//���þ�ȮƷ��ë����ɫ�����������䡢
		//�۾���ɫ���ȵ����������ʱ�٣�
		dog.setBreed("��Ȯ");
		System.out.println("����Ʒ��:"+dog.getBreed());
		dog.setColor("��ɫ");
		System.out.println("��ë����ɫ��"+dog.getColor());
		dog.setAge(2);
		System.out.println("�������䣺"+dog.getAge());
		dog.setWeight("40ǧ��");
		System.out.println("����������"+dog.getWeight());
		dog.speed ="20ǧ��ÿСʱ";
		System.out.println("�������ʱ�٣�"+dog.speed);
		dog.eyecolor ="��ɫ";
		System.out.println("���۾�����ɫ��"+dog.eyecolor);
		dog.legs =4;
		System.out.println("���ȵ�������"+dog.legs);
		
		//�������ĳԵķ�����work����
		dog.eat();
		dog.work();
		

		
		
		
	}
}
