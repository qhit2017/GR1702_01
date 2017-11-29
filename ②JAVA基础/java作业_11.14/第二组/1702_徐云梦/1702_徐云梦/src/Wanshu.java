/** 
 * @author  作者: xuyunmeng
 * @date    创建时间：2017年11月13日 下午8:34:49 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Wanshu {
		public static void main(String[] args) {
			//定义
			for(int a =1;a<=1000;a++){
				
				int sum =0;
				for(int c =1;c<a;c++){
					if(a%c ==0){
						sum += c;
					}
				}
				if(sum==a){
					System.out.println(a);
				}

			}
			
		}
}
