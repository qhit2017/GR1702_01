import java.util.Scanner;

/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��25�� ����4:17:17 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test3 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("������һ����:");
		int a=sc.nextInt();
		if(a>0&&a<10){
			System.out.println("����һλ��");
		}
		if(a>=10&&a<100){
			System.out.println("���Ƕ�λ��");
		}
		if(a>=100&&a<1000){
			System.out.println("������λ��");
		}
		if(a>=1000&&a<10000){
			System.out.println("������λ��");
		}
		if(a==10000){
			System.out.println("������λ��");
		}
	}
}
