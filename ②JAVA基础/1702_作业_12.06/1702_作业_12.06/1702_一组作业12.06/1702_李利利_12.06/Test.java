import java.util.ArrayList;
import java.util.Scanner;


public class Test {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 ArrayList<GradeSystem> arrayList = new ArrayList<GradeSystem>();
		 GradeService gradeService = new GradeService();
		 gradeService.help();
		 
		 int key = 0;
		 int key1 = 0;
		 boolean isQuit = true;
		 boolean Exit = true;
		 while (isQuit) {
			System.out.println("������ָ��,�����س���");
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("¼�뿼����Ϣ��������������š����ġ���ѧ��Ӣ��ɼ�����Ҫ������ܳɼ�");
				gradeService.addGrade(arrayList, sc);
				break;
			case 2:
				System.out.println("������п�����Ϣ");
				gradeService.infoGrade(arrayList);
				break;
			case 3:
				gradeService.help1();
				while (Exit) {
					System.out.println("������ָ��,�����س���");
					key1 = sc.nextInt();
					switch (key1) {
					case 1:
						System.out.println("�ܷ���߷���");
					    gradeService.findsungrade(arrayList);
						break;
					case 2:
						System.out.println("������߷���");
						gradeService.findchinesegrade(arrayList);
						break;
					case 3:
						System.out.println("��ѧ��߷���");
						gradeService.findmathgrade(arrayList);
						break;
					case 4:
						System.out.println("Ӣ����߷���");
						gradeService.findenglishgrade(arrayList);
						break;
					case 5:
						Exit = false;
						break;

					default:
						break;
					}
				}
				System.out.println("�˳��Ӳ˵���");
				break;
			case 4:
				isQuit = false;
				break;

			default:
				break;
			}
		}
		 System.out.println("�˳�ϵͳ��,�ݰ�");
	}

}
