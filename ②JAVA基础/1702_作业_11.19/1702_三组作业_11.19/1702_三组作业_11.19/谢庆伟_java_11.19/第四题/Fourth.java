package FirstTest;
/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月15日 下午6:35:00 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Fourth {

	public static void main(String[] args) {
		System.out.println("1000以内所有8的倍数和是：\n");
		int n=0;
		for(int i=1;i<=1000;i++){
			if(i%8==0){
				n=n+i;
			}
		}
		System.out.println(n);

	}

}
