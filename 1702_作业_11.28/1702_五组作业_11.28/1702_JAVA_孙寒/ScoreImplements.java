import java.util.Arrays;


public class ScoreImplements implements Score {

	public static void main(String[] args) {
		
		
	}

	@Override
	public void help() {
		System.out.println("----ѧ���ɼ�����ϵͳ----");
		System.out.println("��ƽ��������average");
		System.out.println("���������sum");
		System.out.println("�����ֵ����max");
		System.out.println("����Сֵ����min");
		System.out.println("�󲻼�����������not");
		System.out.println("����������sort");
		System.out.println("ֹͣ����Quit");
	}

	@Override
	public void info(int[] a) {
		// TODO Auto-generated method stub
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		
	}

	@Override
	public int getAverage(int[] a) {
		
		return getSum(a)/a.length;
	}

	@Override
	public int getSum(int[] a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		
		return sum;
	}

	@Override
	public int getmax(int[] a) {
		int max=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
				max=a[i];
			}
		}
		
		return max;
	}

	@Override
	public int getmin(int[] a) {
		int min=100;
		for (int i = 0; i < a.length; i++) {
			if (a[i]<min) {
				min=a[i];
			}
		}
		return min;
	}

	@Override
	public int getNot(int[] a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]<60) {
				sum++;
			}
		}
	
		return sum;
	}

	@Override
	public int getSort(int[] a) {
		// TODO Auto-generated method stub
		boolean isSort;
		int temp;
		for (int j= 0;j < a.length-1; j++) {
			isSort=true;
			for (int i = 0; i < a.length-1;i++) {
				if (a[i]>a[i+1]) {
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					isSort=false;
				}
			}
			if (isSort) {
				break;
			}
			System.out.println(Arrays.toString(a));
		}
		return 0;
	}

	@Override
	public int[] Sort(int[] a) {
		// TODO Auto-generated method stub
		return null;
	}

}
