/**
 * 
 */
package f;
import java.util.Scanner;

/**
 * @author ���ߣ��볿�  E-mail:2570804732@qq.com
 * @date ����ʱ�䣺26 Nov 2017 6:43:04 Ntambama
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
public class Ten {
public static void main(String[] args) {
	for(int a=1900;a<=2017;a++){
		if(a%4==0&&a%100!=0||a%400==0){
			System.out.println(a);
		}
	}
}
}
