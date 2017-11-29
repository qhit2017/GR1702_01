package FirstTest;
/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月15日 下午7:26:16 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Tenth {

	public static void main(String[] args) {
		int i=1;
		int j=1;
		while(i<=9){
			while(j<=9&&j<=i){
				System.out.print(j+"×"+i+"＝"+i*j+"\t");
				j++;
			}
			j=1;
			System.out.println();
			i++;
		}

	}

}
