package Liyongli;
/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月20日 下午1:15:41 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Combination {
	public static void main(String[] args) {
		//组合
	 
		for (int i =1; i<=5; i ++){
			for(int j =1 ; j<=5; j++){
				if(j==i){
					continue;
				}
				System.out.print(i);
				System.out.println(j);
			}
		}
	}

}
