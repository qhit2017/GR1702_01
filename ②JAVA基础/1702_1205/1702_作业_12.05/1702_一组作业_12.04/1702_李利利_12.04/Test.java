import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ArrayList<Contacts> arrayList = new ArrayList<Contacts>();
		ContactsService cService = new ContactsService();

		Scanner sc = new Scanner(System.in);
		cService.helpInfo();
		int key = 0;

		boolean isQuit = true;
		while (isQuit) {
			System.out.println("请输入指令,并按回车键");
			key = sc.nextInt();
			switch (key) {
			case 1:
				cService.addContacts(arrayList, sc);
				break;
			case 2:
				cService.infoContacts(arrayList);
				break;
			case 3:
				String name = sc.next();
				cService.findByName(arrayList, name);
				break;
			case 4:
				String sex = sc.next();
				cService.findBySex(arrayList, sex);
				break;
			case 5:
				String Telnum = sc.next();
				cService.findByTelnum(arrayList, Telnum);
				break;
			case 6:
				isQuit = false;
				break;

			default:
				System.out.println("你输入的命令无效");
				break;
			}
		}
		System.out.println("退出了,拜拜");

	}

}
