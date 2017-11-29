import java.util.Arrays;

public class ScoreImplment implements Score {
	public void help() {
		System.out.println("******分数管理系统帮助信息******");
		System.out.println("【0】平均分请输入\t\t^average");
		System.out.println("【1】总分请输入\t\t^sum");
		System.out.println("【2】最高分请输入\t\t^max");
		System.out.println("【3】最低分请输入\t\t^min");
		System.out.println("【4】及格人数请输入\t^Not60");
		System.out.println("【5】退出请输入\t\t^Esc");
		System.out.println("【6】浏览10人成绩请输入\t^Info");
		System.out.println("【7】升序排列成绩请输入\t^Sort");
	}

	public int getAverage(int[] a) {
		return getSum(a) / a.length;
	}

	public int getSum(int[] a) {
		if (a.length > Score.NUMBER) {
			System.out.println("您输入的个数有误，请重新输入");
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	public int getMax(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public int getMin(int[] a) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

	@SuppressWarnings("unused")
	public int getNot60(int[] a) {
		int Not60 = a[0];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 60) {
				sum++;
			}
		}
		return sum;
	}

	public void info(int[] a) {
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	@SuppressWarnings("unused")
	public int[] sort(int[] a) {
		boolean isSort;
		int temp;
		for (int j = 0; j < a.length - 1; j++) {
			isSort = true;
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					isSort = false;
				}
			}
			if (isSort) {
				break;
			}
			System.out.println(Arrays.toString(a));
		}
		int b[] = a;
		return a;
	}
}
