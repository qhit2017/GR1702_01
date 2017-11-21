package Liyongli;
/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月19日 下午7:54:07 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Aliquot {
	//第五题
	public static void main(String[] args) {
		int n=1;
		do{
			if(n%3==0&&n%5==0){
				System.out.println(n);
				
			}
			n++;
		}while(n<1000);
		
	}

}
