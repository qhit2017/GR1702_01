package zuoye;

import java.util.Scanner;

/**
 * time:11.16
 *week:Thursday
 *weather:sun
 *author:sun 
 * site:machine room
 */
public class �ڰ��� {
public static void main(String[] args) {
	
	//���λ��Ϊ6���ܱ�3������3λ�������ж���
	Scanner sc=new Scanner(System.in);
	
	int a;
	int b=1;
	for(a=106;a<996;a+=10){
		if(a%3==0){
			b=a+b;
		}
		System.out.println(a);
	}
	
	sc.close();
}

}



