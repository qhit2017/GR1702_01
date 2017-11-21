/**
 * 
 */
package fengchengjie;
import java.util.Scanner;

/**
 * @author 作者：冯晨婕  E-mail:2570804732@qq.com
 * @date 创建时间：21 Nov 2017 7:24:40 Ntambama
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
/**
 * @author Administrator
 *
 */
public class Test {
public static void main(String[] args) {
	Student a=new Student(18, "冯晨婕");
	System.out.println(a.getContent());
	System.out.println("姓名："+a.name);
	System.out.println("年龄："+a.age);
	
	Worker b = new Worker(25, "张玉");
	System.out.println(b.getContent());
	System.out.println("姓名："+b.name);
	System.out.println("年龄："+b.age);
	 
	
	
}
}
