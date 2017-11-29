/** 
 * @author  作者 于和璧
 * @date    创建时间：2017年11月17日 下午9:39:25 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Multiple {
			//求1000以内所有8的倍数之和
	
	public static void main(String[] args) {
		
		int a =1;
		int sum = 0;
		
		while(a<=1000){
			
			if(a%8==0){
				
				sum = sum+a;
			}
			a++;
		}
		System.out.println("1000以内所有的8的倍数之和为："+sum);
	}
}
