package yangxueting;
/** 
 * @author  ���� qqE-mail:157334005@qq.com
 * @date    ����ʱ�䣺2017��11��23�� ����9:03:22 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class While {

	public While() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int i=1;
		int sum=0;
		while (i<100) {
			sum+=i;
			i+=2;
		}
		System.out.println("1~100�������ĺ�Ϊ��"+sum);
	}
}
