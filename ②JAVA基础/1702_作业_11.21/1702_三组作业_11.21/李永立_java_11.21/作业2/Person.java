package liyongli;
/** 
 * @author  ���� E-mail:������271406@163.com
 * @date    ����ʱ�䣺2017��11��21�� ����7:24:29 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public abstract class  Person {
	int age;
	String name;
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
		abstract String getContent();
	
		void say(){
		System.out.println(getContent());
	}

}
