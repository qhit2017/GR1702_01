/**
 * 
 */
package fcj;
import java.util.Scanner;

/**
 * @author 作者：  E-mail:2570804732@qq.com
 * @date 创建时间：15 Nov 2017 8:48:53 Ntambama
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
public class Dog2 extends Dog {
//定义一个类：警犬 并继承第一题的类：狗
    //属性：最快时速
	//方法：work
	 int speed;
	 
	 /**
 * @param speed
 */
public Dog2(String breed,String color,int age,double weigth,String eyecolor,int legs,int speed) {
	super();
	this.speed = speed;
}
	void work (){
		 System.out.println("缉毒");
	 }
	
}
