package Liyongli;
/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月20日 下午1:27:15 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Aliquot_2 {
	//第八题
	public static void main(String[] args) {
		for(int i =100; i<1000; i++){
			if(i%10==6&&i%3==0){
				System.out.println(i);
			}
		}
	}

}
