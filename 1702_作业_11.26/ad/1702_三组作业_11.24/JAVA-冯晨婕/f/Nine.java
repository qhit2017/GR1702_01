/**
 * 
 */
package f;
import java.util.Scanner;

/**
 * @author ���ߣ��볿�  E-mail:2570804732@qq.com
 * @date ����ʱ�䣺26 Nov 2017 6:28:06 Ntambama
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
	System.out.println("������һ����0<N<=1000");
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
