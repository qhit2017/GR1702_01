package Test;

import java.util.Scanner;

/*�����ˣ�����
 *����ʱ�䣺2017��11��26������6:45:53
 *���䣺2408368509@qq.com
 */

public class Test9 {
	public static void main(String[] args) {
		//����һ������n��0<n<=1000)��nΪ����ʱ�����1��n֮���������
		//��nΪż��ʱ�����1��n֮���ż����
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����0<n<=1000");
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

}}
