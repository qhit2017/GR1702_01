/**
 * 
 */
package fcj;
import java.util.Scanner;

/**
 * @author 作者：冯晨婕  E-mail:2570804732@qq.com
 * @date 创建时间：19 Nov 2017 5:09:21 Ntambama
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
public class Eight {
//求个位为6且能被3整除的三位数
	public static void main(String[] args) {
		int d =0;
	
	for( int a=100;a<=999;a++){
	if(a%10==6&&a%3==0){
		d++;
	}	
}
	System.out.println(d);
}}