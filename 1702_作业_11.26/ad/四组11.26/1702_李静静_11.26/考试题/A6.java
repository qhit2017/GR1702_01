package lijingjing;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��26�� ����6:17:06 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class A6 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 8; i <=1000; i++) {
			if (i%8==0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
