package FirstTest;
/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��15�� ����7:09:23 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Eighth {

	public static void main(String[] args) {
		int n=0;
		int m=0;
		for(int i=100;i<1000;i++){
			if(i%10==6&&i%3==0){
				System.out.print(i+"\t");
				n=n+1;
				m=m+1;
			}
			if(m>10){
				System.out.println();
				m=0;
			}
		}
		System.out.println("\n����"+n+"��");

	}

}
