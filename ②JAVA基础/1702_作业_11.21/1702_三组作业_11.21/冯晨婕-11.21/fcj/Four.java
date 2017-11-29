/**
 * 
 */
package fcj;
import java.util.Scanner;

/**
 * @author 作者：冯晨婕  E-mail:2570804732@qq.com
 * @date 创建时间：20 Nov 2017 7:52:44 Ntambama
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
public class Four {
//一个5位数，判断它是不是回文数。
	//即12321是回文数，个位与万位相同，十位与千位相同。 
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入一个五位数");
		int a=sc.nextInt();
		
			if((a%10==a/10000)&&(a/1000%10==a/10%10)){
				System.out.println("是回文数");
			}else{
				System.out.println("不是回文数");
			}
		}
	}
	
	
	
	
	
	
	

