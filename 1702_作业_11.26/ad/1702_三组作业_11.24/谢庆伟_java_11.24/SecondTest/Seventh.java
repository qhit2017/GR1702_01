package SecondTest;
/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��26�� ����8:42:34 
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
