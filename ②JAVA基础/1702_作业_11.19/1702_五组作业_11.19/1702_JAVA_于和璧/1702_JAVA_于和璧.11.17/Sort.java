package Yu;
/** 
 * @author  作者 于和璧
 * @date    创建时间：2017年11月18日 下午2:34:04 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Sort {
	//从1,2,3,4,5中任取两个数,列出它们所有组合并输出.
	public static void main(String[] args) {
		
		for(int a=1;a<=5;a++){
			for(int b=1;b<=5;b++){
				if(a==b){
					continue;
				}
				
				System.out.print(a);
				System.out.println(b);
			}
		}
	}

}
