package FirstTest;
/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��15�� ����6:35:27 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Fifth {

	public static void main(String[] args) {
		int i=1;
		int n=0;
		do{
			
			if((i%5==0)&&(i%3==0)){
				System.out.print(i+"\t");
				n=n+1;
			}
			if(n>10){
				System.out.println();
				n=0;
			}
			i++;
		}while(i<=1000);

	}

}
