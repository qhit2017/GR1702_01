package SecondTest;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��26�� ����8:51:58 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Ninth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ��1~1000������");
		int a=sc.nextInt();
		int c=0;
		if(a>=1&&a<=1000){
			if(a%2==0){
				System.out.print(a+"��ż����ż�����ǣ�");
				for(int i=1;i<=a;i++){
					if(i%2==0){
						c=c+i;
					}
				}
			}
			else if(a%2!=0){
				System.out.print(a+"���������������ǣ�");
				for(int i=1;i<=a;i++){
					if(i%2!=0){
						c=c+i;
					}
				}
			}
		}
		else{
			System.out.println("�������ֵ������Χ��");
		}
		System.out.println(c);
		sc.close();
	}

}
