package zk.college.com;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		ArrayList<College> arrayList = new ArrayList<College>();
		CollegeScore a = new CollegeScore();
		Scanner s = new Scanner(System.in);
		boolean f = true;
		int l;
		a.hashCode();
		while (f) {
			l = s.nextInt();
			switch (l) {
			case 2:
				a.addCollege(arrayList, s);
				break;
			case 3:
				s.nextLine();
				int d;

				while (f) {
					d = s.nextInt();
					switch (d) {
					case 1:
						s.findInLine("�ܷ�");
						break;
					case 2:
						s.findInLine("��ѧ");
						break;

					case 3:
						s.findInLine("����");
						break;

					case 4:
						s.findInLine("Ӣ��");
						break;
					case 5:
						f = false;
						break;

					default:
						break;
					}
				}
				a.hashCode();
				break;
			case 4:
				f = false;
				break;
			default:
				break;
			}
		}
	}
}
