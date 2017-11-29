package com.qhit.wyk;
/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月25日 上午10:39:00 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Inputdigit {

	public static void main(String[] args) {
		
		//请输出0~10000之间以3开头的数
		System.out.println("第四题");
		for(int a=1;a<10000;a++){
			if(a/3==1){
				System.out.println(a);
				break;
			}
			
		}
		for (int i = 0; i <10000; i++) {
			if(i/10==3){
				System.out.println(i);
			}
			if(i/100==3){
				System.out.println(i);
			}
			if(i/1000==3){
				System.out.println(i);
			}
		}
			
		
		
	}
}
