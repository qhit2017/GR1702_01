/**
 * 
 */

/** 
 * @author  ���� :xuyunmeng
 * @date    ����ʱ�䣺2017��11��26�� ����5:15:23 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test004 {
	public static void main(String[] args) {
		for (int i = 0; i < 10000; i++) {
			if (i<10&&i%10==3) {
				System.out.println(i);
			}if (i<100&&i/10%10==3) {
				System.out.println(i);
			}if (i<1000&&i/100%10==3) {
				System.out.println(i);
			}if (i<10000&&i/1000==3) {
				System.out.println(i);
			}
			
		}
	}

}
