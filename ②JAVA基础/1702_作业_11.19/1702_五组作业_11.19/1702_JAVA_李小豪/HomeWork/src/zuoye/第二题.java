package zuoye;

import java.util.Scanner;

/**
 * time:11.16
 *week:Thursday
 *weather:sun
 *author:sun 
 * site:machine room
 */
public class �ڶ��� {
public static void main(String[] args) {
	
	//ͨ������̨��������С��,�ж�����С����С,������жϽ��
	Scanner sc =new Scanner(System.in);
	System.out.println("����������С��:");
	double a =sc.nextDouble();
	double b =sc.nextDouble();
	boolean c =true;
	if(a>b){
		System.out.println("true");
		System.out.println("a>b���жϽ��Ϊ:"+c);
	}else if(a<b){
		boolean d =false;
		System.out.println("false");
		System.out.println("a<b���жϽ��Ϊ:"+d);
	}
	
	System.out.println();
	
}

}



