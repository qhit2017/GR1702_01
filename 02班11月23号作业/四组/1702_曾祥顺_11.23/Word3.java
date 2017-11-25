package zengxiangshun;

import java.util.Scanner;

/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2017年11月23日 上午9:14:57 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Word3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入10000以内的整数");
		int a=sc.nextInt();
		if (a>10000||a<0) {
			System.out.println("你输的数字有误");
		}else{
			for (int b = 1; b <= a; b++) {
				if (b%10==7||b%7==0||b%100==7||b/10%10==7) {
					System.out.println(b);
				}
			}
		}
		sc.close();
	}
}
