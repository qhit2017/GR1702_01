import java.util.ArrayList;
import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		SXstudent a = new SXstudent();
		SXstudent c = new SXstudent();
		Scanner sc = new Scanner(System.in);
		boolean isQuit = true;
		int b;
		a.help();
		while (isQuit) {
			b=sc.nextInt();
			switch (b) {
			case 1:
				a.addStudent(arrayList, sc);
				break;
			case 2:
				a.infoStudent(arrayList);
				break;
			case 3:
				c.helpc();
				int d;
				boolean Quit = true;
				while (Quit) {
					d=sc.nextInt();
					switch (d) {
					case 1:
						c.findMaxStudent(arrayList, "总分");
						break;
					case 2:
						c.findMaxStudent(arrayList, "数学");
						break;
					case 3:
						c.findMaxStudent(arrayList, "语文");
						break;
					case 4:
						c.findMaxStudent(arrayList, "英语");
						break;
					case 5:
						Quit = false;
						break;
					default:
						break;
					}
				}
			a.help();
				break;
			case 4:
				isQuit = false;
				break;
			default:
				break;
			}
		}
		System.out.println("再见！！！");
	}

}
