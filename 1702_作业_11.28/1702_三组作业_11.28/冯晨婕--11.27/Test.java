/**
 * 
 */
package com;
import java.util.Scanner;

/**
 * @author ���ߣ��볿� /�ֻ۲�  E-mail:2570804732@qq.com
 * @date ����ʱ�䣺27 Nov 2017 4:29:12 Ntambama
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
public class Test {
	public static void main(String[] args) {
		int[]a={23,67,99,77,55,87,87,56,65,69};
		 Scanner sc =new Scanner(System.in);
		 Score02 score02 = new Score02();
		 boolean isQuit=true;
		 String  s ;
		 score02.help();
			while (isQuit) {
				System.out.println("��������Ҫִ�е�ָ������س���");
				s = sc.next();
				switch (s) {
				case "sum":
					int sum =score02.getSum(a);
					System.out.println("�ܷ���"+sum);
					break;
				
				case "Average":
					
					int average = score02.getAverage(a);
					System.out.println("��ƽ������"+average);
					break;
				case"max":
					int max=score02.getMax(a);
					System.out.println("�����ֵ��"+max);
					break;
				case"min":
					int min=score02.getMin(a);
					System.out.println("�����ֵ��"+min);
					break;
				case"Not60":
					int Not60=score02.getNot60(a);
					System.out.println("������������"+Not60);
					break;
					
					
				case "Info":
					
					score02.info(a);

					break;
				
				case "Sort":
					
					score02.sort(a);

					break;
					
				case "Quit":
					isQuit = false;
					break;
				default:
					break;
				}
			}

			System.out.println("�ݰ�");
		

	}

			
			
		
	}


