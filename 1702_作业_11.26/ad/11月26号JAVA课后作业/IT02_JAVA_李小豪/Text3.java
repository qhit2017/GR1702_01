package ��С��;

import java.util.Scanner;

public class Text3 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("������һ������N");
	int a=sc.nextInt();
	if(a<10){
	System.out.println("������Ǹ�λ��:"+a);
}
    if((a<100)&&(a>=10)){
    System.out.println("�������ʮλ��:"+a);
}
    if((a<1000)&&(a>100)){
    	System.out.println("�����λ��:"+a);
    }

}
}