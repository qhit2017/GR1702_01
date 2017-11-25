package Four;
/*制作人：王欣
 *制作时间：2017年11月23日下午7:36:40
 *邮箱：2408368509@qq.com
 */

public class wu {
	//用for 和 while两种方法计算1~100之间奇数的和
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=100;i++){
			if(i%2!=0){
				sum+=i;
				
			}
		}System.out.println(sum);
		
		
		
		
		int he = 0;
		int j=1;
		while(j<=100){
			
			if(j%2!=0){
				he+=j;
				
			}j++;
		}System.out.println(he);
	}
}
