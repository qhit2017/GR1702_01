package Sunday;

import java.util.Scanner;

/*�����ˣ�����
 *����ʱ�䣺2017��11��19������4:49:32
 *���䣺2408368509@qq.com
 */

public class jiu {
	public static void main(String[] args) {
		//ͨ������̨����һ������N��N������10000���������7�ı����Ͱ���7������
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		
		for(int i=1;i<=a;i++){
			if(i%7==0||i/1000==7||i/100%10==7||i/10%10==7||i%10==7){
				System.out.println(i);
			}
		}//�����Ҳ��ᣬ����ͬ���̵�
	}

}
