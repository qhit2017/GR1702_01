package yangxueting;

import java.util.Scanner;

/** 
 * @author  作者 qqE-mail:157334005@qq.com
 * @date    创建时间：2017年11月25日 上午11:11:45 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一位数");
		int x=sc.nextInt();
		System.out.println("请输入第二位数");
		int y=sc.nextInt();
		System.out.println("请输入第三位数");
		int z=sc.nextInt();
		int l=0;
		if (x>y) {
			l=x;x=y;y=l;
		}else if (x>z) {
			l=x;x=z;z=l;
		}else if (y>z) {
			l=y;y=z;z=l;
		}
		System.out.println("由小到大输出："+x+"<"+y+"<"+z);
		sc.close();
	}
}
