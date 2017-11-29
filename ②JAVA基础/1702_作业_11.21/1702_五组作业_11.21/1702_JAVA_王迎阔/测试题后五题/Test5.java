package Test01;
/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月21日 下午5:41:13 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test5 {
	public static void main(String[] args) {
		System.out.println("第十题:");
		int a=1;
		while (a<=9) {
			int b=1;
			while(b<=a){
				System.out.print(a+"*"+b+"="+a*b+"\t");
				b++;
			}
			a++;
			System.out.println();
		}
		
	}

}
