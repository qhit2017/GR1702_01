import java.util.ArrayList;
import java.util.Scanner;

public class ScoreService implements IScore {

	@Override
	public void helpInfo() {
		System.out.println("-----------�����ɼ�����ϵͳ------------");
		System.out.println("��1��¼�뿼���ĸ߿���Ϣ������Add");
		System.out.println("��2����ʾ���п�����Ϣ������Info");
		System.out.println("��3����ѯ��߷�������Max");
		System.out.println("��4���˳�ϵͳ������Exit");

	}

	public void help() {
		System.out.println("----------��ѯ��߷��Ӳ˵�-----------");
		System.out.println("��1����ʾ�Ӳ˵�������1");
		System.out.println("��2��������߷�������2");
		System.out.println("��3����ѧ��߷�������3");
		System.out.println("��4��Ӣ����߷�������4");
		System.out.println("��5���˳�������5");
	}

	@Override
	public void addArrayScore(ArrayList<Score> arrayList, Scanner sc) {
		String string = sc.next();
		String[] a = string.split(",");
		if (a.length != 5) {
			System.out.println("���������Ϣ������Χ������������");
		} else {
			Score score = new Score(a[0], a[1], Double.parseDouble(a[2]),
					Double.parseDouble(a[3]), Double.parseDouble(a[4]));
			arrayList.add(score);
			System.out.println(score.toString());
			System.out.println("��ӳɹ���");
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
		System.out.println("���ѽ����Ӳ˵���");
		boolean isMax = true;
		this.help();
		while (isMax) {
			System.out.println("��������Ҫִ�е����");
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
				System.out.println("�������˵�");
				isMax = false;
				break;

			default:
				System.out.println("�������ָ����Ч��");
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
