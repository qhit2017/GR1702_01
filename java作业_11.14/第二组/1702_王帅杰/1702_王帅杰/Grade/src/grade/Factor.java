package grade;
/** 
 * @author  ���� E-mail:738348954@qq.com
 * @date    ����ʱ�䣺2017��11��14�� ����8:23:19 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Factor {
public static void main(String[] args) {
	//100���ڵ���������
	for(int a =1;a<=1000;a++){
		int sum =0;
		for (int b =1;b<a; b++){
			if(a%b==0){
				sum += b;
			}
		}
		if(sum==a){
			System.out.println(a+"\t");
		}
	}
}
}
