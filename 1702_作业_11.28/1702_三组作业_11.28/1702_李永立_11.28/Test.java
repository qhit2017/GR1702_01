package Score;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:������271406@163.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:31:34 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("�������"+(i+1)+"������");
			a[i] = sc.nextInt();
		}
		Implment b = new Implment();
		int s;
		boolean  isqust = true;
		
		b.help();
		
		
		
		
		while (isqust) {
			
			System.out.println("Ոݔ����Ҫ���е����������܇�I");
			 s = sc.nextInt();	
			switch (s) {
			case  1:
				System.out.println("�����ǣ�"+b.getSum(a)+"\n");
				
			break;
			case 2:
				System.out.println("ƽ����Ϊ��"+b.getAverage(a));
				break;
			case 3:
				System.out.println("��߷�Ϊ��"+b.getMax(a));
				
				break;
			case 4:
				System.out.println("��ͷ�Ϊ��"+b.getMin(a));
				
				break;
			case 5:
				System.out.println("������Ϊ��"+b.getNot(a));
				
				break;
			case  6:
				System.out.print("ȫ��������");
				b.info(a);
				break;
				
			case 7:
				System.out.print("�������Ϊ��");
				b.sort(a);
				break;
			case 8 :
				System.out.println("��л���ʹ�ã��ټ���");
				isqust = false;
				
			default:
				
			}
		}
		
	}

	

}
