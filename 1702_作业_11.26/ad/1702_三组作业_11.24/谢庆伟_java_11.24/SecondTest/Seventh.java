package SecondTest;
/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月26日 下午8:42:34 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Seventh {

	public static void main(String[] args) {
		int i=1;
		int c=0;
		while(i<=1000){
			if(i%5==0&&i%10!=0){
				System.out.print(i+"\t");
				c++;
				if(c!=0&&c%10==0){
				System.out.println();
				}
			}
			i++;
		}

	}

}
