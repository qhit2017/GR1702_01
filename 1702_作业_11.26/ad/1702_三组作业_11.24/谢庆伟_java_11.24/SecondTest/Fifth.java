package SecondTest;

import java.util.Arrays;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月26日 下午8:30:53 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Fifth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int x=sc.nextInt();
		System.out.println("请输入第二个数：");
		int y=sc.nextInt();
		System.out.println("请输入第三个数：");
		int z=sc.nextInt();
		int a[]={x,y,z};
		Arrays.sort(a);
		System.out.println("从小到大为：");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
		sc.close();

	}

}
