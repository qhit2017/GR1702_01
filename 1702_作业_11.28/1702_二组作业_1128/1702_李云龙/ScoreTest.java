import java.util.Arrays;

public class ScoreTest implements Score {

	public void Aelp() {
		System.out.println("---学生管理系统---");
		System.out.println("[0]求平均值Arerage");
		System.out.println("[1]求总分Sum");
		System.out.println("[2]求最大值Max");
		System.out.println("[3]求最小值Min");
		System.out.println("[4]求不及格人数Not");
		System.out.println("[5]退出按Quit");
		System.out.println("[6]按升序排列成绩请输入Sort");
		System.out.println("[7]各科成绩info");
	}

	// 求平均值
	public int getArerage(int[] a) {
		int Arerage = 0;
		for (int i = 0; i < a.length; i++) {
			Arerage += a[i];
		}
		return Arerage / a.length;
	}

	// 求总分
	public int getSum(int[] a) {
		int Sum = 0;
		for (int i = 0; i < a.length; i++) {
			Sum += a[i];
		}
		return Sum;
	}

	// 求最大值
	public int getMax(int[] a) {
		int Max = 0;
		for (int i = 0; i < a.length; i++) {
			Max += a[i];
		}
		return Max;
	}

	// 求最小值
	public int getMin(int[] a) {
		int Min = 0;
		for (int i = 0; i < a.length; i++) {
			Min += a[i];
		}
		return Min;
	}

	// 求不及格人数
	public int getNot(int[] a) {
		int Not = 0;
		for (int i = 0; i < a.length; i++) {
			Not += a[i];
		}
		return Not;
	}

	// 各科成绩
	public void info(int[] a) {
		System.out.println(Arrays.toString(a));

	}

	// 按升序排列成绩请输入
	public int[] sort(int[] a) {
		@SuppressWarnings("unused")
		int sort = 0;
		for (int i = 0; i < a.length; i++) {
			sort += a[i];
		}
		return null;
	}

	public void help() {

	}

}
