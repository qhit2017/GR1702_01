/**
 * 
 */
package f;
import java.util.Scanner;

/**
 * @author 作者：冯晨婕  E-mail:2570804732@qq.com
 * @date 创建时间：26 Nov 2017 6:28:06 Ntambama
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
public class Nine {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入一個数0<N<=1000");
	int n=sc.nextInt();
	
	int sum=0;
	for(int a=1;a<=n;a++){
	if(n%2!=0){
		if(a%2!=0){
			sum+=a;
		}
	}else if(n%2==0){
		if(a%2==0)
			sum+=a;
	}}
		System.out.println(sum);
	
}
}
