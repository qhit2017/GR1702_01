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
			System.out.println("请输入您要执行的指令，并按回车键：");
			key = sc.next();
			switch (key) {
			case "Add":
				System.out.println("添加类型如下：");
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
				System.out.println("您输入的指令无效！");
				break;
			}
		}
		System.out.println("再见!");
	}
}
