package Liyongli;
/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月20日 下午1:18:45 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Sum {
	//第六题
	public static void main(String[] args) {
		int sum =0;
		for(int y =1; y<10; y++){
			sum =sum +y;
			if(sum>20){
				System.out.println(sum);
				break;
			}
		}
	}

}
