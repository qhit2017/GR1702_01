package com.ooo;

import java.util.ArrayList;
import java.util.Scanner;

/*�����ˣ�����
 *����2017��12��5��ʱ������4:56:20
 *����:2408368509@qq.com
 */

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> arrayList = new ArrayList<Student>();
		ScoreService service = new ScoreService();
		service.helpinfo();
		boolean isQuit = true;
		
		int key = 0;
		while (isQuit) {
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("��¼�뿼����Ϣ��ÿ����Ϣ֮���ö��Ÿ���"+"���"+"�ɼ�");
				service.AddStudent(arrayList, sc);
				
				break;
			case 2:
				System.out.println("��ʾ���п�����Ϣ"+"���,���ģ���ѧ��Ӣ��");
				service.infoStudent(arrayList);
				
				break;
			case 3:
				service.getMAX(arrayList, sc);
			case 4:
				isQuit=false;
				break;
			default:
				System.out.println("�������������Ч");
				break;
			}
			
		}System.out.println("�ݰ�");
	}

}
