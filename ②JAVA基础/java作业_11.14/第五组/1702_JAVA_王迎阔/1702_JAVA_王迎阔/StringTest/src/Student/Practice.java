package Student;

import java.sql.Blob;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:295852280@qq.com
 * @date    ����ʱ�䣺2017��11��13�� ����8:08:29 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Practice {
	public static void main(String[] args) {
		//������Ԫ�����������Ƕ�׻�ѡ��ṹ����ɴ��⣺ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ��
		
		System.out.println("������:");
		Scanner sc =new Scanner(System.in);
		System.out.println("������һ��ͬѧ�ĳɼ�:");
		int score =sc.nextInt();
		if(score>90){
			System.out.println("��ͬѧ��õĵȼ�Ϊ:A");
		}
		if(score>=60&&score<90){
			System.out.println("��ͬѧ��õĵȼ�Ϊ:B");
		}
		if(score<60){
			System.out.println("��ͬѧ��õĵȼ�Ϊ:c");
		}
		boolean math=(score>=60)?true:false;
		System.out.println(true);
		
	}

}
