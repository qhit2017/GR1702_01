package KaoShi;

import java.util.Scanner;

/*
����2017��11��26��ʱ������1:14:20
���䣺2408368509@qq.com
 */
public class D09 {
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	System.out.println("������һ������0��С��1000������");
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
			System.out.println("�����ͣ�"+sum);
			}else{
			for(a=1;a<=N;a++){
				if(a%2==0){
					sum+=a;
				}
			}	
		System.out.println("ż���ͣ�"+sum);
		
		}
	}else{
		System.out.println("�������ֵ��Ч");
	}
}
}
