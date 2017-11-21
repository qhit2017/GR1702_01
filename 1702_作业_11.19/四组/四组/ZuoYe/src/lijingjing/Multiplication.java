package lijingjing;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月19日 下午5:39:19 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Multiplication {
	public static void main(String[] args) {
		
	

	int i =1;
	while(i<=9){
		int j =1;
		while(j<=i){
			System.out.print(j+"*"+i+"="+i*j+"\t");
			j++;
		}
		System.out.println();
		i++;
	}
}
}