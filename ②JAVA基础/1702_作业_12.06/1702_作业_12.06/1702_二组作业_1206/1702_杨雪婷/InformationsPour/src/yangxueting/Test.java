package yangxueting;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ���� qqE-mail:157334005@qq.com
 * @date ����ʱ�䣺2017��12��5�� ����7:02:33
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test {

	public static void main(String[] args) {
		ArrayList<formationsPour> arrayList = new ArrayList<formationsPour>();

		NformationsPour nformationsPour = new NformationsPour();
		Scanner sc = new Scanner(System.in);
		nformationsPour.help();
		boolean isQuit = true;
		while (isQuit) {

			System.out.println("������������س�����");
			String key = sc.next();
			switch (key) {
			case "1":

				System.out.println("�����뿼����Ϣ");

				nformationsPour.add(arrayList, sc);
				break;

			case "2":
				System.out.println("���������п�����Ϣ");
				nformationsPour.info(arrayList);

				break;
			case "3":
			boolean	isQuit1=true;
				while (isQuit1) {
					String as=sc.next(); 
					switch (as) {
					case "1":
						nformationsPour.findmax(arrayList, sc);
						break;
					case "2":
						nformationsPour.findmath(arrayList, sc);
						break;
					case "3":
						nformationsPour.findchina(arrayList, sc);
						break;
					case "4":
						nformationsPour.findenglish(arrayList, sc);
						break;
					case "5":
						isQuit1=false;
						break;
					default:
						break;
					}
				}
			case "4":

				isQuit1 = false;
			default:
				break;
			}

		}
		System.out.println("���˳�����");
	}
}
