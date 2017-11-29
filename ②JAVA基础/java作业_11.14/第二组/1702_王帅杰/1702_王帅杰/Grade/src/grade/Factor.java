package grade;
/** 
 * @author  作者 E-mail:738348954@qq.com
 * @date    创建时间：2017年11月14日 下午8:23:19 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Factor {
public static void main(String[] args) {
	//100以内的所有完数
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
