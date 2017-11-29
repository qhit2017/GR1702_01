package SecondTest;
/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月26日 下午8:39:20 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Sixth {

	public static void main(String[] args) {
		System.out.print("1000内8的倍数的数字共有");
		int c=0;
		for(int i=1;i<=1000;i++){
			if(i%8==0){
				c++;
			}
		}
		System.out.println(c+"个");

	}

}
