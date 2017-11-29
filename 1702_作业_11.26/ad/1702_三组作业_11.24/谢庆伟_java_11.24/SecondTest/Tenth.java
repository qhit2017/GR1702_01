package SecondTest;
/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月26日 下午9:00:34 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Tenth {

	public static void main(String[] args) {
		System.out.println("1900~2017年所有的闰年有：\n");
		int c=0;
		for(int i=1900;i<=2017;i++){
			if(i%4==0&&i%100!=0||i%400==0){
				System.out.print(i+"\t");
				c++;
				if(c!=0&&c%5==0){
					System.out.println();
				}
			}
		}

	}

}
