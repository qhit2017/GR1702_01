package N1;

import java.util.Scanner;

/*�����ˣ�����
 *����ʱ�䣺2017��11��13������8:13:14
 *���䣺2408368509@qq.com
 */

public class N3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("����ĳɼ���");
		int score =sc.nextInt();
		
		if (score>=90){
			System.out.println("A");
		}else if(score>=60){
			System.out.println("B");
		}else{
			System.out.println("C");
		}
	}

}
