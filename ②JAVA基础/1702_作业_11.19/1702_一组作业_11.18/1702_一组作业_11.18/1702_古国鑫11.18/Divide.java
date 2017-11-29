package guguoxin;
/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月19日 下午7:04:36 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Divide {

		//求1000以内，既能被五整除，又能被3整除的所有整数，并打印出来。（使用do while循环来实现。）
		public static void main(String[] args) {
			int a = 1;
			
			System.out.println("1000以内，既能被五整除，又能被3整除的所有整数为：");
			
			do {
			if(a%5==0 && a%3==0){
					
				System.out.println(a);
			}
				a++;
		} while (a<=1000);
				
	}
}
