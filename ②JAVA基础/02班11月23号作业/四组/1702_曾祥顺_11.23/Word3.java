package zengxiangshun;

import java.util.Scanner;

/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2017��11��23�� ����9:14:57 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Word3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������10000���ڵ�����");
		int a=sc.nextInt();
		if (a>10000||a<0) {
			System.out.println("�������������");
		}else{
			for (int b = 1; b <= a; b++) {
				if (b%10==7||b%7==0||b%100==7||b/10%10==7) {
					System.out.println(b);
				}
			}
		}
		sc.close();
	}
}
