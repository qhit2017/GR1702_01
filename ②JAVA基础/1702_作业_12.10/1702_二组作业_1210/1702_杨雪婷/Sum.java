package yangxueting;
/** 
 * @author  ���� qqE-mail:157334005@qq.com
 * @date    ����ʱ�䣺2017��12��10�� ����8:05:06 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Sum {

	public static void main(String[] args) {
		int i=1;
		int sum=0;
		while (i<=99) {
			if (i%2==1) {
				sum=sum+i;
			}
			i++;
		}
		System.out.println(sum);
	}
}
