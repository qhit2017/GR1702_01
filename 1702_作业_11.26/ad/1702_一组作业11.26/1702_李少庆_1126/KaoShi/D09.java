package KaoShi;

import java.util.Scanner;

/*
日期2017年11月26日时间下午1:14:20
邮箱：2408368509@qq.com
 */
public class D09 {
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	System.out.println("请输入一个大于0，小于1000的整数");
	int N = x.nextInt();
	int a = 1;

	if (N>=0&&N<1000) {
		int sum = 0;
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
		System.out.println("您输入的值无效");
	}
}
}
