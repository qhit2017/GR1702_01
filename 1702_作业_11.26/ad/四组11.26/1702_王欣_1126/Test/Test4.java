package Test;

import java.util.Scanner;
/*�����ˣ�����
 *����ʱ�䣺2017��11��26������6:15:28
 *���䣺2408368509@qq.com
 */

public class Test4 {
	public static void main(String[] args) {
	//�ɼ�>=90�ֵ���A��ʾ��60~89��֮����B��ʾ��60��������C��ʾ����дjava����
		Scanner sc =new Scanner(System.in);
		System.out.println("������ɼ���");
		int i = sc.nextInt();
		if(i>=90){
			System.out.println("A");
		}else if(i>60){
			System.out.println("B");
		}else{
			System.out.println("C");
		}
		
		
	}

}
