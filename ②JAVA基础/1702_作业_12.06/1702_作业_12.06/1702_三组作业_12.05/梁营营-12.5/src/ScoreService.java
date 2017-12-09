import java.util.ArrayList;
import java.util.Scanner;

public class ScoreService implements IScore {

	@Override
	public void helpInfo() {
		System.out.println("-----------考生成绩管理系统------------");
		System.out.println("【1】录入考生的高考信息请输入Add");
		System.out.println("【2】显示所有考生信息请输入Info");
		System.out.println("【3】查询最高分请输入Max");
		System.out.println("【4】退出系统请输入Exit");

	}

	public void help() {
		System.out.println("----------查询最高分子菜单-----------");
		System.out.println("【1】显示子菜单请输入1");
		System.out.println("【2】语文最高分请输入2");
		System.out.println("【3】数学最高分请输入3");
		System.out.println("【4】英语最高分请输入4");
		System.out.println("【5】退出请输入5");
	}

	@Override
	public void addArrayScore(ArrayList<Score> arrayList, Scanner sc) {
		String string = sc.next();
		String[] a = string.split(",");
		if (a.length != 5) {
			System.out.println("您输入的信息超出范围，请重新输入");
		} else {
			Score score = new Score(a[0], a[1], Double.parseDouble(a[2]),
					Double.parseDouble(a[3]), Double.parseDouble(a[4]));
			arrayList.add(score);
			System.out.println(score.toString());
			System.out.println("添加成功！");
		}

	}

	@Override
	public void infoArrayScore(ArrayList<Score> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Score score = arrayList.get(i);
			System.out.println(score.toString());
		}

	}

	@Override
	public void FindMax(ArrayList<Score> arrayList, Scanner sc) {
		System.out.println("您已进入子菜单！");
		boolean isMax = true;
		this.help();
		while (isMax) {
			System.out.println("请输入您要执行的命令：");
			String key = sc.next();
			switch (key) {
			case "1":
				this.help();
				break;
			case "2":
				this.Findchinese(arrayList, sc);
				break;
			case "3":
				this.Findmath(arrayList, sc);
				break;
			case "4":
				this.Findenglish(arrayList, sc);
				break;
			case "5":
				System.out.println("返回主菜单");
				isMax = false;
				break;

			default:
				System.out.println("您输入的指令无效！");
				break;
			}
		}

	}

	@Override
	public void Findchinese(ArrayList<Score> arrayList, Scanner sc) {
		double max = 0;
		double temp;
		for (int i = 0; i < arrayList.size(); i++) {
			double chinese = arrayList.get(i).getChinese();
			if (max < chinese) {
				temp = max;
				max = chinese;
				chinese = temp;
			}
		}
		System.out.println(max);
	}

	@Override
	public void Findmath(ArrayList<Score> arrayList, Scanner sc) {
		double max = 0;
		double temp;
		for (int i = 0; i < arrayList.size(); i++) {
			double math = arrayList.get(i).getMath();
			if (max < math) {
				temp = max;
				max = math;
				math = temp;
			}
		}
		System.out.println(max);

	}

	@Override
	public void Findenglish(ArrayList<Score> arrayList, Scanner sc) {
		double max = 0;
		double temp;
		for (int i = 0; i < arrayList.size(); i++) {
			double english = arrayList.get(i).getEnglish();
			if (max < english) {
				temp = max;
				max = english;
				english = temp;
			}
		}
		System.out.println(max);

	}

}
