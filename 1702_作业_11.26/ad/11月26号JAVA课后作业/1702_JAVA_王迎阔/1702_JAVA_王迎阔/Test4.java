import java.util.Scanner;

/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��26�� ����8:06:18 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test4 {

	public static void main(String[] args) {
		System.out.println("������:");
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��1��100������");
		int a =sc.nextInt();
		
		if(a>=90){
			System.out.println("A");
		}else if(a>=60&&a<=89){
			System.out.println("B");
		}else{
			System.out.println("C");
		}
	}
}
