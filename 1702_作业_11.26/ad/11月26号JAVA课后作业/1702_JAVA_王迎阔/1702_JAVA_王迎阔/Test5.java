import java.util.Scanner;

/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��26�� ����8:12:08 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test5 {

	public static void main(String[] args) {
		 
		
		System.out.println("������:");
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int sum;
		if(x<y){
			sum=x;
			x=y;
			y=sum;
		}if(x<z){
			sum=x;
			x=z;
			z=sum;
		}if(y<z){
			sum=y;
			y=z;
			z=sum;
		}
		System.out.println(z+" "+y+" "+x);
	}
}
