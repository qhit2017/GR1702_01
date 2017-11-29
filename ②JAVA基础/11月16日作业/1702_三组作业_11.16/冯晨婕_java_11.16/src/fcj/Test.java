/**
 * 
 */
package fcj;
import java.util.Scanner;

/**
 * @author 作者：  E-mail:2570804732@qq.com
 * @date 创建时间：16 Nov 2017 7:55:30 Ekuseni
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
	//创建一个测试类，实例化一个警犬对象，
	//设置警犬品种、毛的颜色、重量、年龄、眼睛颜色、
	//腿的数量、最快时速，
    //调用它的吃的方法和work方法
	Dog2 a =new Dog2("德牧"," 黑", 3,30 ,"黄",4,120);
	a.setBreed("德牧");
	System.out.println("警犬的品种："+a.getBreed());
	a.setColor("黑");
	System.out.println("警犬的颜色："+a.getColor());
	a.setWeigth(30);
	System.out.println("警犬的重量："+a.getWeigth());
	a.setAge(3);
	System.out.println("警犬的年龄："+a.getAge());
	a.eyecolor=("黄");
	System.out.println("警犬眼睛的颜色："+a.eyecolor);
	a.legs=4;
	System.out.println("警犬腿的数量: "+a.legs);
	a.speed=120;
	System.out.println("最快时速"+a.speed+"米每分钟");
	//调用
	a.eat();
	a.work();
}
}
