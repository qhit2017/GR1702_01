package Test01;
/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��21�� ����5:08:42 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test1 {
	public static void main(String[] args) {
		
		System.out.println("������:");
		int sum=0;
		for(int a=1;a<=10;a++){
			sum=sum+a;
			if(sum>20){
				System.out.println(a);
				break;
			}
			
		}
	}

}
