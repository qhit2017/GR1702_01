import java.util.Arrays;

/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2017��11��27�� ����4:40:18 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Boos implements Administration {

	public  void help() {
		System.out.println("---����---");
		System.out.println("����1�����");
		System.out.println("����2����ƽ��ֵ");
		System.out.println("����3����������");
		System.out.println("����4������");
		System.out.println("����5��С��4");
	}

	//��
	@Override
	public int sum(int[] a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}

		return sum;
	}

	//ƽ��ֵ
	@Override
	public int Average(int[] a) {
		return sum(a)/a.length ;
	
		
	}

	//����
	@Override
	public int[] sort(int[] a) {
		boolean isSort;
		int temp;
		for (int j = 0; j < a.length-1; j++) {
			isSort = true;
			for (int i = 0; i < a.length-1; i++) {
				if (a[i]>a[i+1]) {
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					isSort = false;
				}
			}
			
			if(isSort){
				break;
			}
			System.out.println(Arrays.toString(a));
		}

		
		return a;
	}

	//����
	@Override
	public void info(int[] a) {
		System.out.println(Arrays.toString(a));
		
		
	}

	
	@Override
	public int getNot60(int[] a) {
		int not =0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]<4) {
				not=a[i];
				break;
			}
		}
		return not;
	}

}
