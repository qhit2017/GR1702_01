package Sunday;

import java.util.Scanner;

/*制作人：王欣
 *制作时间：2017年11月19日下午4:49:32
 *邮箱：2408368509@qq.com
 */

public class jiu {
	public static void main(String[] args) {
		//通过控制台输入一个整数N（N不大于10000）输出所有7的倍数和包含7的数字
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		
		for(int i=1;i<=a;i++){
			if(i%7==0||i/1000==7||i/100%10==7||i/10%10==7||i%10==7){
				System.out.println(i);
			}
		}//这题我不会，是我同桌教的
	}

}
