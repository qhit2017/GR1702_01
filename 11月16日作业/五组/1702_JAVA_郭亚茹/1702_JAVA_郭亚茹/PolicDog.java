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
public class PolicDog extends Dog {
	
	 PolicDog(String variety, String color, double age, double weight,String eyecolor,int leg,String thefastestspeed) {
		super(variety, color, age, weight);
	
	}

// ����һ���ࣺ��Ȯ ���̳е�һ����ࣺ��
    //  ���ԣ����ʱ��
   //	������work
String thefastestspeed;

	void work(){
		System.out.println("����");
	}
}
