package Com.score;

/**
 * @author ���� E-mail:2379675496@qq.com
 * @date ����ʱ�䣺2017��11��8�� ����6:44:32
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class ScoreImplements implements Score {

	@Override
	public void help() {
		System.out.println("��0��---��������ϵͳ---");
		System.out.println("��1����ƽ��ֵ������Average");
		System.out.println("��2�����ܷ������� sum");
		System.out.println("��3�������ֵ������ max");
		System.out.println("��4������Сֵ������min");
		System.out.println("��5���󲻼�������������not60");
		System.out.println("��6������������quit");
		System.out.println("��7����������������score");
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
