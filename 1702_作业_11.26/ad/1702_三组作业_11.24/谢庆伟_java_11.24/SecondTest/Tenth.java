package SecondTest;
/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��26�� ����9:00:34 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Tenth {

	public static void main(String[] args) {
		System.out.println("1900~2017�����е������У�\n");
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
