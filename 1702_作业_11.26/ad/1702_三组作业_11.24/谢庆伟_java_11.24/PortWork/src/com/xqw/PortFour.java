package com.xqw;
/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��26�� ����5:19:29 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class PortFour {

	public static void startthree(int o,int t){
		int n=0;
		for(int i=o;i<=t;i++){
			String s=i+"";
			char a[]=s.toCharArray();
			if(a[0]=='3'){
				System.out.print(i+"\t");
				n++;
			}
			if(n>0&&n%15==0){
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("�ġ����0~10000֮����3��ͷ������\n");
		
			/*
			if(i<10&&i/1==3){
				System.out.print(i+"\t");
				n++;
			}
			else if(i<100&&i/10==3){
				System.out.print(i+"\t");
				n++;
			}
			else if(i<1000&&i/100==3){
				System.out.print(i+"\t");
				n++;
			}
			else if(i<10000&&i/1000==3){
				System.out.print(i+"\t");
				n++;
			}
			if(n>1&&n%15==0){
				System.out.println();
			}
			*/
			startthree(0,10000);
		}

	}


