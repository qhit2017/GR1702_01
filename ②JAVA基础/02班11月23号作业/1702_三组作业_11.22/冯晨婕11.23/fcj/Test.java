/**
 * 
 */
package fcj;
import java.util.Scanner;

/**
 * @author 作者：冯晨婕  E-mail:2570804732@qq.com
 * @date 创建时间：23 Nov 2017 6:57:28 Ntambama
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
	//
	  // d.创建测试类，分别创建狗和老鼠的实例化对象，
	   //给对象的属性赋值，并且调用对象的吃、叫的方法
	Dog d  =new Dog();
  d.setName("dog");
	d.setBreed("牧羊犬");
	d.setAge(3);
	d.setColor("黑");
	System.out.println(d.getEat());
	System.out.println(d.getCall());
	
	//mouse
	Mouse m =new Mouse();
	m.setName("mouse");
    m.setBreed("小白鼠");
	m.setLegs(4);
	m.setWeight(50.8);
	System.out.println(m.getEat());
	System.out.println(m.getCall());
	
	
	
}
}
