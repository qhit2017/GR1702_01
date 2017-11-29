package com.zk.qhit.test;
//作业四：
//作者：梁营营；
public class StartNumber {

	public static void main(String[] args) {
	//	请输出0~10000之间以3开头的数
		for (int i = 1; i <10000; i++) {
			if (i/1000==3) {
				System.out.println(i);
		}if(i/100==3){
			System.out.println(i);
		}
		if(i/10==3){
			System.out.println(i);
		}
		if(i==3){
			System.out.println(i);
		}
	}
	}
}
