package FirstTest;
/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月15日 下午7:03:17 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Seventh {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i!=j){
					System.out.print(i);
					System.out.print(j+"\t");
				}
			}
			System.out.println();
		}

	}

}
