package FirstTest;
/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月15日 下午6:36:19 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Sixth {

	public static void main(String[] args) {
		int n=0;
		int i=1;
		for(i=1;i<=10;i++){
			n=n+i;
			if (n>20){
				break;
			}
		}
		System.out.println("当加到"+i+"时，累加值超过20，达到了"+n);

	}

}
