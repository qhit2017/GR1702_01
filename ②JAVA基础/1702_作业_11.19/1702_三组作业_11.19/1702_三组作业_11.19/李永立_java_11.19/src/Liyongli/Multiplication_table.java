package Liyongli;
/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月20日 下午1:04:17 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Multiplication_table {
	public static void main(String[] args) {
		//第十题
		System.out.println("九九乘法表");
		int i =1;
		
		while(i<=9){
			int j = 1;
			while(j<=i){
				System.out.print(j+"*"+j+"="+j*i+"\t");
				j++;
			}
			System.out.println();
			i++;
		}
		
		
	}

}
