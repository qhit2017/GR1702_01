/**
 * 
 */
package f;
import java.util.Scanner;

/**
 * @author 作者：冯晨婕  E-mail:2570804732@qq.com
 * @date 创建时间：26 Nov 2017 6:12:00 Ntambama
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
public class Five {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入三個数");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int m=0;
	if(a>b){
		m=a;
		a=b;
		b=m;}
		if(a>c){
			m=a;a=c;c=m;
		}
	if(b>c){
		m=b;b=c;c=m;
	}
	System.out.println("小到大："+a+" "+b+" "+c);
	
}
}
