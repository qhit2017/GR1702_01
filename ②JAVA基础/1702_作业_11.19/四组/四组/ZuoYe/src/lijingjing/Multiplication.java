package lijingjing;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��19�� ����5:39:19 
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