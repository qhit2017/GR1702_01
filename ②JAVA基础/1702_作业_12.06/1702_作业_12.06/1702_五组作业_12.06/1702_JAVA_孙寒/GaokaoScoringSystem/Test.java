package GaokaoScoringSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ArrayList<Student>arrayList=new ArrayList<Student>();
		StudentSerive studentserive=new StudentSerive();
		
		Scanner sc=new Scanner(System.in);
		
		studentserive.helpinfo();
		
		boolean isQuit=true;
		boolean isQabuit=true;
		int k=0;
		int key=0;
		
		while (isQuit) {
			key=sc.nextInt();
			
			switch (key) {

			case 1:
				System.out.println("¼�뿼����Ϣ");
				studentserive.addStudent(arrayList, sc);
				
				break;
			case 2:
				System.out.println("��ʾ���п�����Ϣ");
				studentserive.infoStudent(arrayList);
				
				break;
			case 3:
				studentserive.helpinfoZi();
				isQabuit=true;
				while (isQabuit) {
					k=sc.nextInt();
					switch (k) {
					case 1:
						studentserive.getMax(arrayList,"�ܳɼ�");
						
						break;
					case 2:
						studentserive.getMax(arrayList, "��ѧ��߷�");
						
						break;
					case 3:
						studentserive.getMax(arrayList, "������߷�");
						
						break;
					case 4:
						studentserive.getMax(arrayList, "Ӣ����߷�");
						
						break;
					case 5:
						studentserive.helpinfo();
						isQabuit=false;
						break;

					default:
						break;
					}
					
				}System.out.println("�˳�");
				break;
			case 4:
				
				
				break;
				

			default:
				break;
			}
		}
		System.out.println("�˳�");
	}
	

}
