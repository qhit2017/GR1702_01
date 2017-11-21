package guguoxin;
/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月19日 下午7:03:41 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Accumulated {

		//1至10之间的整数相加，得到累加值大于20的当前数字，并将该数输出。
		public static void main(String[] args) {
				
			int sum =0;
				
			for(int a =1; a<=10;a++){
					
				sum =sum+a;
					
				if(sum>20){
						
				System.out.println(sum);
						
				break;
			}
					
		}
				
	}
}
