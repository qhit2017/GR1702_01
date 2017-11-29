package guguoxin;
/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月14日 下午9:05:07 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Value {

	public static void main(String[] args) {
		int a = 0;
		for(int b = 1;b<=100;b++){
			if(!(b%10==3)){
				a+=b;
				
			}
		}System.out.println("1到100的累加值为:"+a);
	}

}
