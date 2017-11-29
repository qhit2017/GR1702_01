import java.util.Arrays;

/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2017年11月27日 下午4:40:18 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Boos implements Administration {

	public  void help() {
		System.out.println("---帮助---");
		System.out.println("输入1，求和");
		System.out.println("输入2，求平均值");
		System.out.println("输入3，升序排序");
		System.out.println("输入4，遍历");
		System.out.println("输入5，小于4");
	}

	//和
	@Override
	public int sum(int[] a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}

		return sum;
	}

	//平均值
	@Override
	public int Average(int[] a) {
		return sum(a)/a.length ;
	
		
	}

	//排序
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

	//遍历
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
