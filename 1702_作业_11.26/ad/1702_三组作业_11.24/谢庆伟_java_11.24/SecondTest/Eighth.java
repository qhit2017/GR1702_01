package SecondTest;
/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月26日 下午8:49:03 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Eighth {

	public static void main(String[] args) {
		int c=0;
		for(int i=0;i<=10000;i++){
			if(i%10==6&&i%3==0){
				System.out.print(i+"\t");
				c++;
				if(c!=0&&c%15==0){
					System.out.println();
				}
			}
		}

	}

}
