import java.util.Arrays;

/**
 * 
 */

/**
 * @author 作者 :xuyunmeng
 * @date 创建时间：2017年11月27日 下午4:30:40
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class ScoreTest implements ScoreManagement {

	/*
	 * (non-Javadoc)
	 * 
	 * @see ScoreManagement#help()
	 */
	@Override
	public void help() {
		System.out.println("---分数管理系统帮助---");
		System.out.println("[0]求平均值请输入Average");
		System.out.println("[1]求总分请输入Sum");
		System.out.println("[2]求最大值请输入Max");
		System.out.println("[3]求最小值请输入Min");
		System.out.println("[4]求不及格人数请输入Not");
		System.out.println("[5]退出请输入Quit");
		System.out.println("[6]浏览各科成绩请输入Info");
		System.out.println("[7]按升序排列成绩请输入Sort");

	}

	@Override
	public int getAverage(int[] a) {

		return getSum(a) / a.length;
	}

	@Override
	public int getSum(int[] a) {
		if (a.length > ScoreManagement.NUMBER) {
			System.out.println("输入错误，请重新输入");
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}

	@Override
	public int getMax(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	@Override
	public int getMin(int[] a) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;

	}

	@Override
	public int getNot(int[] a) {
		int n = 0;
		System.out.println("不及格的成绩有");
		for (int i = 0; i < a.length; i++) {
			if (a[i]<60) {
				System.out.println(a[i]+" ");
				n++;
			}
		}
		return n;
	}

	public void info(int[] a) {
		//第一种方法
		System.out.println(Arrays.toString(a));
		
		
	}

	@Override
	public int[] sort(int[] a) {
		// 冒泡排序法
		// { 25, 89, 96, 68, 77, 56, 78, 99, 12, 71 }
		// { 25, 89, 68, 96, 77, 56, 78, 99, 12, 71 }
		// { 12, 25, 56, 68, 71, 77, 78, 89, 96, 99 }

		boolean isSort = false;
		int empty;
		for (int i = 0; i < a.length - 1; i++) {
			isSort = true;
			for (int j = 0; j < a.length - 1; j++) {

				if (a[j] > a[j + 1]) {
					empty = a[j];
					a[j] = a[j + 1];
					a[j + 1] = empty;
					isSort = false;
				}
			}
			if (isSort) {
				break;
			}
			System.out.println(Arrays.toString(a));
		}
		int b[] = a;
		return b;
	}

}
