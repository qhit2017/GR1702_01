package liyongli;
/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月21日 下午7:24:29 
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
