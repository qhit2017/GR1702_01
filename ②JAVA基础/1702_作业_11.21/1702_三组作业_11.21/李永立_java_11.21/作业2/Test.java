package liyongli;
/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月21日 下午7:32:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Test {
	public static void main(String[] args) {
		Student l = new Student(20,"李永立");
		System.out.println(l.name);	
		System.out.println(l.age);
		System.out.println(l.getContent());
		
		
		
		Student y = new Student(18,"李晓红");
		System.out.println(y.name);	
		System.out.println(y.age);
		System.out.println(y.getContent());
	
		y.say();
	}

}
