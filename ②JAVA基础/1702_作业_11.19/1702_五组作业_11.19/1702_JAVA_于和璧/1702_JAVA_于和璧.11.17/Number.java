package Yu;

import java.util.Scanner;

/** 
 * @author  作者 于和璧
 * @date    创建时间：2017年11月18日 下午4:44:07 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Number {
		//输入一个整数N（N不大于10000），输出所有7的倍数和包含7的数。
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个不大于10000整数N:");
		
		int N = sc.nextInt();
		
		if(N>10000){
			
			System.out.println("抱歉，您所输入的数字超出范围！");
			
		}
		for(int a = 1;a<=N;a++){
			
			if(a/1000==7 || a/100==7 || a/10%10==7 || a%10==7 || a%7==0 ){
				
				System.out.println(a);
			}
			sc.close();
		}
		
	}

}
