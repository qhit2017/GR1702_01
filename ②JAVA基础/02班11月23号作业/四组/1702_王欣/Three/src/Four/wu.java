package Four;
/*�����ˣ�����
 *����ʱ�䣺2017��11��23������7:36:40
 *���䣺2408368509@qq.com
 */

public class wu {
	//��for �� while���ַ�������1~100֮�������ĺ�
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
