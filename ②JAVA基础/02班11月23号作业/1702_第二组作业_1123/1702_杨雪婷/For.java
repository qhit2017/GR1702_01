package yangxueting;
/** 
 * @author  ���� qqE-mail:157334005@qq.com
 * @date    ����ʱ�䣺2017��11��23�� ����9:03:07 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class For {

	public For() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<100;i++){
			sum+=i;i=i+2;
		}
		System.out.println("1~100��������Ϊ��"+sum);
	}
}
