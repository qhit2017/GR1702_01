package Test01;
/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��21�� ����5:13:16 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test3 {
	public static void main(String[] args) {
		System.out.println("�ڰ���:");
		int i =0;
		
		for (int a = 1; a <= 1000; a++) {
			if (a % 10 == 6 &&a % 3 == 0) {
				i++;
			}
		}System.out.println("һ����"+i+"��");
	}

}
