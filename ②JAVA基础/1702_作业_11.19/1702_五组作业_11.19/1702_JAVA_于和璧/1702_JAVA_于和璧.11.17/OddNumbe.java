package YuHeBi;
/** 
 * @author  作者 于和璧
 * @date    创建时间：2017年11月17日 下午9:30:18 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class OddNumbe {
		//输出1000以内所有奇数。
	
	public static void main(String[] args) {
		
		System.out.println("1000以内所有的奇数为：");
		
		for (int a=1; a<=1000;a++){
			
			if(a%2!=0){
				
				System.out.println(a);
			}
		}
	}
}
