package liyongli;
/** 
 * @author  ���� E-mail:������271406@163.com
 * @date    ����ʱ�䣺2017��11��21�� ����7:32:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Test {
	public static void main(String[] args) {
		Student l = new Student(20,"������");
		System.out.println(l.name);	
		System.out.println(l.age);
		System.out.println(l.getContent());
		
		
		
		Student y = new Student(18,"������");
		System.out.println(y.name);	
		System.out.println(y.age);
		System.out.println(y.getContent());
	
		y.say();
	}

}
