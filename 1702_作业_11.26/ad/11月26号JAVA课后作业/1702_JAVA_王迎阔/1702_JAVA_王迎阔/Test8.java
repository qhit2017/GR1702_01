/** 
 * @author  ���� �ں��
 * @date    ����ʱ�䣺2017��11��26�� ����8:54:29 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test8 {

	
	public static void main(String[] args) {

		System.out.println("�ڰ���");
		for (int i = 0; i < args.length; i++) {
			if (i % 10 == 6 && i % 3 == 0) {
				System.out.println(i);
			}
		}

	}
}
