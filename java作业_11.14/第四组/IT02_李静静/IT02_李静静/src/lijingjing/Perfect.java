package lijingjing;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��14�� ����6:02:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Perfect {
/*һ�������ǡ�õ�����������֮�ͣ�
 * ������ͳ�Ϊ "���� "������
 * 6=1��2��3.����ҳ�1000���ڵ�����������
 */
	public static void main(String[] args) {
		int s ;
		for(int i  =1;i<=1000;i++){
			s =0;
			for(int j =1;j<i;j++)
				if(i%j==0)
					s=s+j;
			if(i==s)
			System.out.println(i+"");
		}
		System.out.println();
	}
}
