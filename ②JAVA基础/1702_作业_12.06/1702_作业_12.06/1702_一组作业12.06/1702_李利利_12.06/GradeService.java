import java.util.ArrayList;
import java.util.Scanner;

public class GradeService implements IGrade {

	public void help() {
		System.out.println("------�߿�����ϵͳ����------");
		System.out.println("1.¼�뿼���ĸ߿���Ϣ");
		System.out.println("2.��ʾ���п�����Ϣ");
		System.out.println("3.�����Ӳ˵�");
		System.out.println("4.�˳�ϵͳ");
	}

	public void help1() {
		System.out.println("------�Ӳ˵�����------");
		System.out.println("1.��ӡ�ܷ���߷�");
		System.out.println("2.��ӡ������߷�");
		System.out.println("3.��ӡ��ѧ��߷�");
		System.out.println("4.��ӡӢ����߷�");
		System.out.println("5.�˳�");
	}

	@Override
	public void addGrade(ArrayList<GradeSystem> arrayList, Scanner sc) {
		String s = sc.next();
		String[] g = s.split(",");
		if (g.length != 5) {
			System.out.println("���������Ϣ��ʽ����,����������");
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
