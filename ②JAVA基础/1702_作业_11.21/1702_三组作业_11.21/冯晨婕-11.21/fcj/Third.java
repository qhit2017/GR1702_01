/**
 * 
 */
package fcj;
import java.util.Scanner;

/**
 * @author 作者：冯晨婕  E-mail:2570804732@qq.com
 * @date 创建时间：20 Nov 2017 7:33:04 Ntambama
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
public class Third {
//输入三个整数x,y,z，请把这三个数由小到大输出。
public static void main(String[] args) {
	Scanner a =new Scanner(System.in);
	System.out.println("请输入x:");
	int x =a.nextInt();
	Scanner b =new Scanner(System.in);
	System.out.println("请输入y:");
	int y =b.nextInt();
	Scanner c =new Scanner(System.in);
	System.out.println("请输入z:");
	int z =c.nextInt();
	int m=0;
	if(x>y){
	m=x;
	x=y;
	y=m;}
	if(x>z){
		m=x;
		x=z;
		z=m;
	}
	if(y>z){
		m=z;
		z=y;
		y=m;
	}
	

	
	System.out.println("从小到大排序为："+"\t" +x+" "+y+" "+z);

}
}