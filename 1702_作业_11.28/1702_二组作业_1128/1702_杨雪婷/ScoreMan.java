package yangxueting;
/** 
 * @author  ���� qqE-mail:157334005@qq.co
 * @date    ����ʱ�䣺2017��11��27�� ����4:32:10 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ScoreMan implements Score{

	@Override
	public void help() {
		// TODO Auto-generated method stub
		System.out.println("----��������ϵͳ������Ϣ");
		System.out.println("[0]��ƽ��ֵ������Average");
		System.out.println("[1]���ܷ�������Sum");
		System.out.println("[2]�����ֵ������Max");
		System.out.println("[3]����Сֵ������Min");
		System.out.println("[4]�󲻼�������������Not");
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}

	public int getAverage(int[] a) {
		// TODO Auto-generated method stub
		
		return getSum(a)/a.length;
	}

	public int getSum(int[] a) {
		// TODO Auto-generated method stub
		if (a.length>Score.NUMBER) {
			System.out.println("������ĸ���������������");
		}
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}

	@Override
	public int getMax(int[] a) {
		// TODO Auto-generated method stub
		
		int Max = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>Max){
				
				Max=a[i];
			}
		}
		return Max;
	}

	@Override
	public int getMin(int[] a) {
		// TODO Auto-generated method stub
		int Min =a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]<Min){
				
				Min = a[i];
			}
		}
		return Min;
	}

	@Override
	public int getNot60(int[] a) {
		// TODO Auto-generated method stub
		int sum =0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]<60){
				
				sum++;
			}
		}
		return sum;
	}


}
