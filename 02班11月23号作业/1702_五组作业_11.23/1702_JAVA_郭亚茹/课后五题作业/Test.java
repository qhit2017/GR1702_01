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
		
		//d.���������࣬�ֱ𴴽����������ʵ�������󣬸���������Ը�ֵ�����ҵ��ö���ĳԡ��еķ���
		
		Dog  dog = new Dog();
		dog.setName("����");
		dog.setVariety("̩��");
		dog.setColour("�ػ�ɫ");
		dog.setAge(3);
		
		System.out.println("���ֽУ�"+dog.getName()+"\n"+"Ʒ��Ϊ��"
							+dog.getVariety()+"\n"+"ëɫΪ��"
							+dog.getColour()+"\n"+"����Ϊ��"+dog.getAge()+"��");
		
		System.out.println(dog.getWow());
		
		System.out.println(dog.getEat());
		
		System.out.println();
		
		Mouse mouse = new Mouse();
		
		mouse.setName("С��");
		mouse.setVariety("������");
		mouse.setLeg(2);
		mouse.setWeight(6.5);
		
		System.out.println("���ֽУ�"+mouse.getName()+"\n"+"Ʒ��Ϊ��"
							+mouse.getVariety()+"\n"+"�ȵ�����Ϊ��"
							+mouse.getLeg()+"\n"+"����Ϊ��"+mouse.getWeight()+"�");
		
		System.out.println(mouse.getEat());
		
		System.out.println(mouse.getWow());

		
		
		
		
	}

}
