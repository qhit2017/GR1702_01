import java.util.Arrays;


public class ScoreImplment implements Score{

	@Override
	public void help() {
		System.out.println("----��������ϵͳ������Ϣ----");
		System.out.println("��0����ƽ��ֵ������Average");
		System.out.println("��1�����ܷ�������Sum ");
		System.out.println("��2�������ֵ������Max");
		System.out.println("��3������Сֵ������Min");
		System.out.println("��4���󲻼�������������Not");
		System.out.println("��5���˳�������Quit");
		System.out.println("��6��������Ƴɼ�������Infor");
		System.out.println("��7�����������гɼ�������Sort");
	}

	@Override
	public void infor(int[] a) {
		System.out.println(Arrays.toString(a));
	}

	@Override
	public int getAverage(int[] a) {
	
		return getSum(a)/a.length;
	}

	@Override
	public int getSum(int[] a) {
		if(a.length>Score.NUMBER){
			System.out.println("�����������������������");
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
				
		return sum;
	}

	@Override
	public int getMax(int[] a) {
     int max = a[0];
     for (int i = 0; i < a.length; i++) {
		if(a[i]>max){
			max = a[i];
		}
	}
		
		return max;
	}

	@Override
	public int getMin(int[] a) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min){
				min = a[i];
			}
		}
		
		return min;
	}

	@Override
	public int getNot60(int[] a) {
		int a4=0;
		System.out.println("������ĳɼ���:");
		for (int i = 0; i < a.length; i++) {
			if(a[i]<60){
				
				System.out.print(a[i]+" ");
				a4++;
			}
		}
		return a4;
	}

	@Override
	public int[] sort(int[] a) {
		//ð�ݷ�����
		boolean isSort;
		int temp;
		for (int j = 0; j < a.length; j++) {
			isSort = true;
			for (int i = 0; i < a.length-1; i++) {
				if(a[i]>a[i+1]){
					temp = a[i];
					a[i] = a[i+1];
					a[i+1]=temp;
					isSort = false;
				}
			}
			if(isSort){
				break;
			}
			System.out.println(Arrays.toString(a));
		}
		int b[] = a;
		return a;
	}

}
