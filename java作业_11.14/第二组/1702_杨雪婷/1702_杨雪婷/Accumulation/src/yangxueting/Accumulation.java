package yangxueting;
/** 
 * @author  E-mail:2714031169@qq.com
 * @date    ����ʱ�䣺2017��11��13�� ����8:54:28 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Accumulation {
public static void main(String[] args) {
	int h=0;
	for(int j=1;j<=100;j++){
		if(!(j%10==3)){
			h+=j;
		}
	}
	System.out.println(h);
}
}
