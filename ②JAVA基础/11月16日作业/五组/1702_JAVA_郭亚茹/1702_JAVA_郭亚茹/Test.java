package guo;
/** 
 * @author  ���� E-mail:2379675496@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {
	public static void main(String[] args) {
		
     //����һ�������࣬
	//ʵ����һ����Ȯ����
	//���þ�ȮƷ�֡�ë����ɫ�����������䡢�۾���ɫ���ȵ����������ʱ�٣�
	//�������ĳԵķ�����work����
	PolicDog policdog=new PolicDog("����Ȯ", "��ɫ", 18, 50, "��ɫ", 4,"10����");
	policdog.setVariety("����Ȯ");
	System.out.println("����Ȯ");
	policdog.setColor("��ɫ");
	System.out.println("��ɫ");
	policdog.setAge(18);
	System.out.println(18);
	policdog.setWeight(50);
	System.out.println(50);
	policdog.eyecolor="��ɫ";
	System.out.println("��ɫ");
	policdog.leg=4;
	System.out.println(4);
	policdog.thefastestspeed="10����";
	System.out.println("10����");
		
	policdog.eat();
	policdog.work();
}
	
}
