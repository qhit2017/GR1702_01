import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ArrayList<Score> arrayList = new ArrayList<Score>();
		Scanner sc = new Scanner(System.in);
		ScoreService scoreService = new ScoreService();
		boolean isQuit = true;
		scoreService.helpInfo();
		String key;
		while (isQuit) {
			System.out.println("��������Ҫִ�е�ָ������س�����");
			key = sc.next();
			switch (key) {
			case "Add":
				System.out.println("����������£�");
				System.out.println("xxx,001,98,87,76");
				scoreService.addArrayScore(arrayList, sc);
				break;
			case "Info":
				scoreService.infoArrayScore(arrayList);
				break;

			case "Max":
				scoreService.FindMax(arrayList, sc);
				break;
			case "Exit":
				isQuit = false;
				break;

			default:
				System.out.println("�������ָ����Ч��");
				break;
			}
		}
		System.out.println("�ټ�!");
	}
}
