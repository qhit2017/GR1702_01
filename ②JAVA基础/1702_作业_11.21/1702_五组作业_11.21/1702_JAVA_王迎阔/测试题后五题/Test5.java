package Test01;
/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��21�� ����5:41:13 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test5 {
	public static void main(String[] args) {
		System.out.println("��ʮ��:");
		int a=1;
		while (a<=9) {
			int b=1;
			while(b<=a){
				System.out.print(a+"*"+b+"="+a*b+"\t");
				b++;
			}
			a++;
			System.out.println();
		}
		
	}

}
