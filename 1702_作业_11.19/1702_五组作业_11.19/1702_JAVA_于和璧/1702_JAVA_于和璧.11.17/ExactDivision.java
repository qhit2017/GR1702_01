package Yu;
/** 
 * @author  作者 于和璧
 * @date    创建时间：2017年11月17日 下午9:51:21 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ExactDivision {
			//求个位数为6且能被3整除的三位数共有多少。
	public static void main(String[] args) {
		
		int sum=0;
		
		for(int a =100;a<1000;a++){
			
			if(a%10==6 && a%3==0){
				
				sum =sum+1;
				
			}
		}
		System.out.println("个位数为6且能被3整除的三位数共有"+sum+"个。");
	}
}
