package com.qhit.wyk;
/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��25�� ����10:39:00 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Inputdigit {

	public static void main(String[] args) {
		
		//�����0~10000֮����3��ͷ����
		System.out.println("������");
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
