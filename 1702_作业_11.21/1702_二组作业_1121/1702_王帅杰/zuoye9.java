package zuoye;

import java.util.Scanner;

/**
 * @author 作者 E-mail:738348954@qq.com
 * @date 创建时间：2017年11月18日 下午2:08:02
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class zuoye9 {
	public static void main(String[] args) {
		System.out.println("第九题：");
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入一个不大于10000的数字");
		int l =sc.nextInt();
		for (int i= 1; i <l; i++) {
		if(i%7==0 || i%10==7 || i/10%10==7 || i/100==7 || 
				i/1000==7){
			System.out.println(i);
		}
		}
		
		
		sc.close();
		
		
	}
}
