import java.util.Scanner;


/** 
 * @author  ���� E-mail:1603559382@qq.com
 * @date    ����ʱ�䣺2017��11��13�� ����8:36:50 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Operation {

	public static void main(String[] args) {
		//ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ��
			Scanner sc = new Scanner(System.in);
			System.out.println("����һ���ɼ�");
			int a = sc.nextInt();
			boolean b;
			b = (a>=60)?true:false;
			System.out.println("b��ֵΪ:"+b);
			if(a >= 90){
				System.out.println("ΪA");
			}else if (a>=60 && a <= 89){
				System.out.println("ΪB");
			}else if (a < 60){
				System.out.println("ΪC");
			}
	}
}
