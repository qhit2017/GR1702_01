package Student;
/** 
 * @author  ���� E-mail:295852280@qq.com
 * @date    ����ʱ�䣺2017��11��13�� ����8:34:38 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Totalsum {
	public static void main(String[] args) {
		//������1~100���ۼ�ֵ����Ҫ��������λΪ3����
		
		System.out.println("������:");
		int  sum =0;
		for(int i =1;i<=100;i++){
			if(!(i%10==3)){
				sum+=i;
			}
		}
		System.out.println(sum);
		}

}
