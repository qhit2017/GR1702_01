package kaoshi;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ArrayList<Student> arrayList =new ArrayList<Student>();
		Array a=new Array();
		Scanner sc=new Scanner(System.in);
		a.help();
		int i=0;
		boolean isquit = true;
		while (isquit) {
			 i = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("�����뿼����Ϣ");
				a.addStudent(arrayList, sc);
				break;
			case 2:
				a.infoStudent(arrayList);
				break;
			case 3:
				a.help1();
				int b;
				boolean is = true;
				while (is) {
					 b = sc.nextInt();
					 switch (b) {
					case 1:
						a.maxStudent(arrayList, "�ܳɼ�");
						break;
					case 2:
						a.maxStudent(arrayList, "��ѧ");
						break;
					case 3:
						a.maxStudent(arrayList, "����");
						break;
					case 4:
						a.maxStudent(arrayList, "Ӣ��");
						break;
					case 5:
						is=false;
						break;
					default:
						break;
					}
					 
				}
				System.out.println("�˳���ϵͳ");
				a.help();
				break;
			case 4:
				isquit=false;
				break;
			default:
				break;
			}
		}
	
		
System.out.println("�ټ���������");
	}

}
