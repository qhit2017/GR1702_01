package com.system;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:24:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<student> arrayList = new ArrayList<student>();

		ScoreService service = new ScoreService();

		boolean isQuit = true;
		boolean isSubQuit = false;
		int key = 0;
		int k = 0;
		service.help();
		while (isQuit) {
			key = sc.nextInt();
			switch (key) {
			case 1:
				service.addExaminee(arrayList, sc);
				break;
			case 2:
				service.Information(arrayList);
				break;
			case 3:
				service.helpSubInfo();
				isSubQuit=true;
				while (isSubQuit) {
					k = sc.nextInt();
					switch (k) {
					case 1:
						service.getMax(arrayList, "�ܳɼ�");
						break;
					case 2:
						service.getMax(arrayList, "����");
						break;
					case 3:
						service.getMax(arrayList, "��ѧ");
						break;
					case 4:
						service.getMax(arrayList, "Ӣ��");
						break;
					case 5:
						service.help();
						isSubQuit =false;
						
						break;

					default:
						break;
					}
				}
				break;
			case 4:
				isQuit = false;
				break;
			default:
				break;
			}

		}
		System.out.println("ллʹ�ã�");

	}
}
	
