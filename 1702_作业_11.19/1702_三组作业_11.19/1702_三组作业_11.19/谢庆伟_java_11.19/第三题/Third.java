package FirstTest;
/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月15日 下午6:34:28 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Third {

	public static void main(String[] args) {
		System.out.println("1000以内所有的奇数有：\n");
		int n=0;
		for(int i=1;i<=1000;i++){
			if(i%2==1){
				System.out.print(i+"\t");
				n=n+1;
			}
			if(n>15){
				System.out.println();
				n=0;
			}
		}

	}

}
