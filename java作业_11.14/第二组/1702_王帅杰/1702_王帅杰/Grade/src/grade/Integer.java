package grade;
/** 
 * @author  ���� E-mail:738348954@qq.com
 * @date    ����ʱ�䣺2017��11��14�� ����8:32:48 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Integer {
public static void main(String[] args) {
	//������1��100���ۼ�ֵ����Ҫ��������λΪ3����
		System.out.println("��1��100���ۼ�ֵ�� ��Ҫ��������λΪ3����");
		int sum =0;
		for(int a =1;a<=100;a++){
			if(a%10 !=3){
				sum += a;
			}
		}
	System.out.println("�����Ϊ��"+sum);
	
	
	
	
	
	
}
}
