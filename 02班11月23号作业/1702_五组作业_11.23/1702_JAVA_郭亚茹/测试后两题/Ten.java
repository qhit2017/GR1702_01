package Guo;
/** 
 * @author  作者 E-mail:2379675496@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Ten {
public static void main(String[] args) {
	//用while打印九九乘法表。
	int a=1;
	while (a<=9) {
		
		int b=1;
		while (b<=a) {
			b++;
			System.out.print(b+"*"+a+"="+a*b+"\t");
		}
     a++;
     System.out.println();
	}
}
}
