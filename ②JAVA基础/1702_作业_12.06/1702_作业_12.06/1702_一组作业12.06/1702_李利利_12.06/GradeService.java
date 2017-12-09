import java.util.ArrayList;
import java.util.Scanner;

public class GradeService implements IGrade {

	public void help() {
		System.out.println("------高考评分系统帮助------");
		System.out.println("1.录入考生的高考信息");
		System.out.println("2.显示所有考生信息");
		System.out.println("3.进入子菜单");
		System.out.println("4.退出系统");
	}

	public void help1() {
		System.out.println("------子菜单帮助------");
		System.out.println("1.打印总分最高分");
		System.out.println("2.打印语文最高分");
		System.out.println("3.打印数学最高分");
		System.out.println("4.打印英语最高分");
		System.out.println("5.退出");
	}

	@Override
	public void addGrade(ArrayList<GradeSystem> arrayList, Scanner sc) {
		String s = sc.next();
		String[] g = s.split(",");
		if (g.length != 5) {
			System.out.println("你输入的信息格式不对,请重新输入");
		} else {

			GradeSystem gradeSystem = new GradeSystem(g[0], g[1],
					Double.parseDouble(g[2]), Double.parseDouble(g[3]),
					Double.parseDouble(g[4]));
			arrayList.add(gradeSystem);
			System.out.println(gradeSystem.toString());

		}

	}

	@Override
	public void infoGrade(ArrayList<GradeSystem> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).toString());
		}

	}

	@Override
	public void findsungrade(ArrayList<GradeSystem> arrayList) {
		double sungrade = arrayList.get(0).getSungrade();
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getSungrade() > sungrade) {
				sungrade = arrayList.get(i).getSungrade();
			}
		}
		System.out.println(sungrade);
	}

	@Override
	public void findchinesegrade(ArrayList<GradeSystem> arrayList) {
		double chinesegrade = arrayList.get(0).getChinesegrade();
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getChinesegrade() > chinesegrade) {
				chinesegrade = arrayList.get(i).getChinesegrade();
			}
		}
		System.out.println(chinesegrade);
	}

	@Override
	public void findmathgrade(ArrayList<GradeSystem> arrayList) {
		double mathgrade = arrayList.get(0).getMathgrade();
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getMathgrade() > mathgrade) {
				mathgrade = arrayList.get(i).getMathgrade();
			}
		}
		System.out.println(mathgrade);
	}

	@Override
	public void findenglishgrade(ArrayList<GradeSystem> arrayList) {
		double englishgrade = arrayList.get(0).getEnglishgrade();
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getEnglishgrade() > englishgrade) {
				englishgrade = arrayList.get(i).getEnglishgrade();
			}
		}
		System.out.println(englishgrade);
	}

}
