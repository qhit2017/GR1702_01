package Liyongli;
/** 
 * @author  ���� E-mail:������271406@163.com
 * @date    ����ʱ�䣺2017��11��20�� ����1:04:17 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Multiplication_table {
	public static void main(String[] args) {
		//��ʮ��
		System.out.println("�žų˷���");
		int i =1;
		
		while(i<=9){
			int j = 1;
			while(j<=i){
				System.out.print(j+"*"+j+"="+j*i+"\t");
				j++;
			}
			System.out.println();
			i++;
		}
		
		
	}

}
