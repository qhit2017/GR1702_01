 package option;

import java.util.Scanner;

public class Option {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("������ѧ���ĳɼ���");
	int s = sc.nextInt();
	if(s>=90&&s<=100){
		System.out.println("��ѧ���ĳɼ�ΪA");
	}else if(s>=60){
		System.out.println("��ѧ���ĳɼ�ΪB");
	}else{
		System.out.println("��ѧ���ĳɼ�ΪC");
	}
    sc.close();
}
}
