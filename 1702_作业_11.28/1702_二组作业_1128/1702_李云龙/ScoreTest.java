import java.util.Arrays;

public class ScoreTest implements Score {

	public void Aelp() {
		System.out.println("---ѧ������ϵͳ---");
		System.out.println("[0]��ƽ��ֵArerage");
		System.out.println("[1]���ܷ�Sum");
		System.out.println("[2]�����ֵMax");
		System.out.println("[3]����СֵMin");
		System.out.println("[4]�󲻼�������Not");
		System.out.println("[5]�˳���Quit");
		System.out.println("[6]���������гɼ�������Sort");
		System.out.println("[7]���Ƴɼ�info");
	}

	// ��ƽ��ֵ
	public int getArerage(int[] a) {
		int Arerage = 0;
		for (int i = 0; i < a.length; i++) {
			Arerage += a[i];
		}
		return Arerage / a.length;
	}

	// ���ܷ�
	public int getSum(int[] a) {
		int Sum = 0;
		for (int i = 0; i < a.length; i++) {
			Sum += a[i];
		}
		return Sum;
	}

	// �����ֵ
	public int getMax(int[] a) {
		int Max = 0;
		for (int i = 0; i < a.length; i++) {
			Max += a[i];
		}
		return Max;
	}

	// ����Сֵ
	public int getMin(int[] a) {
		int Min = 0;
		for (int i = 0; i < a.length; i++) {
			Min += a[i];
		}
		return Min;
	}

	// �󲻼�������
	public int getNot(int[] a) {
		int Not = 0;
		for (int i = 0; i < a.length; i++) {
			Not += a[i];
		}
		return Not;
	}

	// ���Ƴɼ�
	public void info(int[] a) {
		System.out.println(Arrays.toString(a));

	}

	// ���������гɼ�������
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
