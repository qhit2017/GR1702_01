package lijingjing;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��14�� ����6:19:17 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Cumulative {
/*������1~100���ۼ�ֵ��
 * ��Ҫ��������λΪ3����
 */
	public static void main(String[] args) {
		int sum =0;
		for(int i =1;i<=100;i++){
			if(!(3==i%10)){
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
