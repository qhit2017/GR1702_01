package N1;
/*制作人：王欣
 *制作时间：2017年11月13日下午8:13:32
 *邮箱：2408368509@qq.com
 */

public class N5 {
	public static void main(String[] args) {
		//求整数1~100的累加值，但要求跳过个位为3的数
		int i=1;
		int sum=0;
		do{
			if (i%10!=3){
			sum=sum+i;
			
			}
			i++;
		}while(i<=100);
		System.out.println(sum);
		
			
	}

}
