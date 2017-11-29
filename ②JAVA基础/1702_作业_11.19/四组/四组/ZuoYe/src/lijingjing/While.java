package lijingjing;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月19日 下午4:32:02 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class While {

	 public static void main(String[] args) {
		int g =1;
		do{
			if(0==g%5&&0==g%3){
				System.out.println(g);
			}
			g++;
		}while(g<=1000);
	}
}
