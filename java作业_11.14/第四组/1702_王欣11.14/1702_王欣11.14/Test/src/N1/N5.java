package N1;
/*�����ˣ�����
 *����ʱ�䣺2017��11��13������8:13:32
 *���䣺2408368509@qq.com
 */

public class N5 {
	public static void main(String[] args) {
		//������1~100���ۼ�ֵ����Ҫ��������λΪ3����
		int i=1;
		int sum=0;
		do{
			if (i%10!=3){
			sum=sum+i;
			
			}
			i++;
		}while(i<=100);
		System.out.println(sum);
		
			
	}

}
