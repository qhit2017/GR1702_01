 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��16�� ����8:22:01 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Text {

	/*����һ�������࣬ʵ����һ����Ȯ����
	 * ���þ�ȮƷ�֡�ë����ɫ�����������䡢
	 * �۾���ɫ���ȵ����������ʱ�٣�
	 * �������ĳԵķ�����work����
	 */
     public static void main(String[] args) {
    	 PoliceDog policeDog =new PoliceDog ("����","��",2,15,4,"��ɫ","120");
    	 policeDog.setBreed("����");
             System.out.println("��ȮƷ��:"+policeDog.getBreed());
         policeDog.setColor("��");   
    		 System.out.println("ë����ɫ:"+policeDog.getColor());
    	 policeDog.setAge(2);	 
    		 System.out.println("����:"+policeDog.getAge());
    	 policeDog.setWeiget(15);	 
    		 System.out.println("����:"+policeDog.getWeiget());
         policeDog.leg=4;
    		 System.out.println("�ȵ�����:"+policeDog.leg);
    	 policeDog.eyecolor="��ɫ";
    	     System.out.println("�۾���ɫ:"+policeDog.eyecolor);
    	 policeDog.speed="120";
    	     System.out.println("���ʱ��:"+policeDog.speed);
    	     policeDog.eat();
    	     policeDog.work();
    	     
    	     
    	     
    	     
    	 
	}
}
