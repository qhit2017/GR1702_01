package FirstTest;
/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��15�� ����7:26:16 
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
				System.out.print(j+"��"+i+"��"+i*j+"\t");
				j++;
			}
			j=1;
			System.out.println();
			i++;
		}

	}

}
