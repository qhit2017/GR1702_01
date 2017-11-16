/**
 * 
 */
package fengchenjie;
import java.util.Scanner;

/**
 * @author 作者：冯晨婕  E-mail:2570804732@qq.com
 * @date 创建时间：14 Nov 2017 8:34:16 Ntambama
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
public class SUM {
public static void main(String[] args) {
	//4、一个数如果恰好等于它的因子之和，
	//这个数就称为 "完数 "。
	//例如6=1＋2＋3.编程找出1000以内的所有完数。 
				int a;
				for(int i=1;i<=1000;i++){
				a=0;
				for(int j =1;j<i;i++){
					if(i%j==0)
					a=a+j;
			if(i==a)		
				System.out.println(i+" ");	
				}	
				System.out.println();	
				}
				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
