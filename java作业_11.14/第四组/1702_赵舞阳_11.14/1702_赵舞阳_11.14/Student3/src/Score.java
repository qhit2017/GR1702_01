import java.util.Scanner;

/** 
 * @author  ���� E-mail:1243629747@163.com
 * @date    ����ʱ�䣺2017��11��14�� ����5:07:56 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
/*3��������Ԫ�����������Ƕ
  	 �׻�ѡ��ṹ����ɴ��⣺
     ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��
     60-89��֮�����B��ʾ��
     60�����µ���C��ʾ��
*/
public class Score {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("������:\n���������:");
	int score = sc.nextInt();
	if(score >= 90){
		System.out.println("A");
	}
	 if(score >= 60 && score <90){
		System.out.println("B");
	}
	if(score < 60){
		System.out.println("C");
	}
	sc.close();
}
}
