package yangxueting;
/** 
 * @author  作者 qqE-mail:157334005@qq.co
 * @date    创建时间：2017年11月27日 下午4:32:10 
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
		System.out.println("----分数管理系统帮助信息");
		System.out.println("[0]求平均值请输入Average");
		System.out.println("[1]求总分请输入Sum");
		System.out.println("[2]求最大值请输入Max");
		System.out.println("[3]求最小值请输入Min");
		System.out.println("[4]求不及格人数请输入Not");
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
			System.out.println("您输入的个数有误，请重输入");
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
