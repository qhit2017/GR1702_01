/**
 * 
 */
package fcj;
import java.util.Scanner;

/**
 * @author ���ߣ��볿�  E-mail:2570804732@qq.com
 * @date ����ʱ�䣺20 Nov 2017 7:52:44 Ntambama
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
/**
 * @author Administrator
 *
 */
public class Four {
//һ��5λ�����ж����ǲ��ǻ�������
	//��12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ�� 
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("������һ����λ��");
		int a=sc.nextInt();
		
			if((a%10==a/10000)&&(a/1000%10==a/10%10)){
				System.out.println("�ǻ�����");
			}else{
				System.out.println("���ǻ�����");
			}
		}
	}
	
	
	
	
	
	
	

