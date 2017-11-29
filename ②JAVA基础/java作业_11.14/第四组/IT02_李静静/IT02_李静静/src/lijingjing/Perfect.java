package lijingjing;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月14日 下午6:02:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Perfect {
/*一个数如果恰好等于它的因子之和，
 * 这个数就称为 "完数 "。例如
 * 6=1＋2＋3.编程找出1000以内的所有完数。
 */
	public static void main(String[] args) {
		int s ;
		for(int i  =1;i<=1000;i++){
			s =0;
			for(int j =1;j<i;j++)
				if(i%j==0)
					s=s+j;
			if(i==s)
			System.out.println(i+"");
		}
		System.out.println();
	}
}
