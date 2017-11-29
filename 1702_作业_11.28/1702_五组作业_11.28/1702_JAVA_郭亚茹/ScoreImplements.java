package Com.score;

/**
 * @author 作者 E-mail:2379675496@qq.com
 * @date 创建时间：2017年11月8日 下午6:44:32
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class ScoreImplements implements Score {

	@Override
	public void help() {
		System.out.println("【0】---分数管理系统---");
		System.out.println("【1】求平均值请输入Average");
		System.out.println("【2】求总分请输入 sum");
		System.out.println("【3】求最大值请输入 max");
		System.out.println("【4】求最小值请输入min");
		System.out.println("【5】求不及格人数请输入not60");
		System.out.println("【6】返回请输入quit");
		System.out.println("【7】升序排列请输入score");
	}

	@Override
	public int getaverage(int[] a) {

		return getsum(a) / a.length;
	}

	@Override
	public int getsum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += i;
		}
		return sum;
	}

	@Override
	public int getmax(int[] a) {

		return 0;
	}

	@Override
	public int getmin(int[] a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getnot60(int[] a) {

		return 0;
	}

	@Override
	public void info(int[] a) {

	}

	public void scort(int[] a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int[] sort(int[] a) {
		// TODO Auto-generated method stub
		return null;
	}

}
