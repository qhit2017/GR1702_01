import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> arrayList = new ArrayList<Student>();
		Scrvice scrvice = new Scrvice();
		boolean isQuit = true;
		boolean isSub = false;
		int key = 0;
		scrvice.help();
		while (isQuit) {
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("�밴���¸�ʽ����:\n����,001,89,87,65");
				scrvice.addStudent(arrayList, sc);
				break;
			case 2:
				scrvice.infoStudent(arrayList);
				break;
			case 3:
				scrvice.helpinfo();
				isSub = true;
				while (isSub) {
					key = sc.nextInt();
					switch (key) {
					case 1:
						scrvice.getMax(arrayList, "�ܳɼ�");
						break;
					case 2:
						scrvice.getMax(arrayList, "����");
						break;
					case 3:
						scrvice.getMax(arrayList, "��ѧ");
						break;
					case 4:
						scrvice.getMax(arrayList, "Ӣ��");
						break;
					case 5:
						isSub = false;
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
		System.out.println("�˳�ϵͳ");
		sc.close();
	}
}
