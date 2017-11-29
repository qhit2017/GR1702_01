package Sum;
/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月14日 下午9:27:41 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */


public class Sum {
		public static void main(String[] args) {
			//求整数1~100的累加值，但要求跳过个位为3的数
			System.out.println("输出1+2+****+100的值（跳出个位为3的数）：");
			int sum =0;
			for (int i =1; i<=100;i++){
				if(!(i%10==3)){
					
					sum =sum+i;
					
					
				}
				
					
					
				
			}System.out.println(sum);

		
		
		
		
		
		
		
		
		
		}

	}


