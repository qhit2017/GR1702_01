package WX;

import java.util.Scanner;

/*���ߣ�
����2017��11��17��ʱ������4:39:40
���䣺2408368509@qq.com
 */
public class jiu {
public static void main(String[] args) {
	Scanner z= new Scanner(System.in);
	
	int N=z.nextInt();
	
	for(int a=1;a<=N;a++){
		if(a%7==0||a%10==7||a/10%10==7||a/1000==7||a/100%10==7){
			System.out.println(a);
		}
	}
	
}
}
