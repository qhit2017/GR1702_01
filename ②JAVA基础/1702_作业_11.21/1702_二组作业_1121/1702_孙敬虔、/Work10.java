package com.zk;
/** 
 * @author  作者 E-mail:chenglong793708@547.com
 * @date    创建时间：2017年11月21日 下午7:51:27 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Work10 {
	public static void main(String[] args) {
		int i=1;
		while(i<=9){
			int j=1;
			while(j<=i){
				System.out.print(j+"*"+i+"="+j*i+"\t");
				j++;
			}
			System.out.println();
			i++;
		}
}

}
