package Guo;
/** 
 * @author  ���� E-mail:2379675496@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Ten {
public static void main(String[] args) {
	//��while��ӡ�žų˷���
	int a=1;
	while (a<=9) {
		
		int b=1;
		while (b<=a) {
			b++;
			System.out.print(b+"*"+a+"="+a*b+"\t");
		}
     a++;
     System.out.println();
	}
}
}
