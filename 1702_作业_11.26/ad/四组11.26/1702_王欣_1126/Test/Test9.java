package Test;

import java.util.Scanner;

/*制作人：王欣
 *制作时间：2017年11月26日下午6:45:53
 *邮箱：2408368509@qq.com
 */

public class Test9 {
	public static void main(String[] args) {
		//输入一个整数n（0<n<=1000)当n为奇数时，输出1到n之间的奇数和
		//当n为偶数时，输出1到n之间的偶数和
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数0<n<=1000");
		int N =sc.nextInt();
		int sum = 0;
		int a=1;
		if(N>=0&&N<1000){
			
			if(N%2==1){
				for(a=1;a<=N;a++){
					if(a%2==1){
						sum+=a;
					}
				}
				System.out.println("奇数和："+sum);
			}else{
				for(a=1;a<=N;a++){
					if(a%2==0){
						sum+=a;
					}
				}
				System.out.println("偶数和："+sum);
			}
		}else{
			System.out.println("你输入的值无效");
		}

}}
