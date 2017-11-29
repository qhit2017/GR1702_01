package Liyongli;
/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月19日 下午7:48:14 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Multiple {
	public static void main(String[] args) {
		//第四题
		int sum =0;
		for(int e =1; e<1000; e++){
			if(e%8==0){
				sum=sum+e;
			}
		}
		System.out.println(sum);
	}

}
