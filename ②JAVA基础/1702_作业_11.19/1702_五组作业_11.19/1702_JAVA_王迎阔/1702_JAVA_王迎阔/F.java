package A;
/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��18�� ����2:13:10 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class F {
	public static void main(String[] args) {
		
		System.out.println("������:");
		System.out.println("��1000���ڼ��ܱ�5����"
				+ "���ܱ�8��������������");
		int a=1;
		do {
			if(a%5==0 && a%8==0){
				System.out.println(a);
			}
			a++;
		} while (a<=1000);
		
	}

}
