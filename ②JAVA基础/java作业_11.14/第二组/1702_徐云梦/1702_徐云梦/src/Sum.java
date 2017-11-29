/** 
 * @author  作者: xuyunmeng
 * @date    创建时间：2017年11月13日 下午8:56:01 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Sum {
		public static void main(String[] args) {
			int sum =0;
			for(int a =1;a<=100;a++){
				if(!(a%10==3)){
					sum+=a;
				
					
				}
			}
			System.out.println(sum);
		}
}
