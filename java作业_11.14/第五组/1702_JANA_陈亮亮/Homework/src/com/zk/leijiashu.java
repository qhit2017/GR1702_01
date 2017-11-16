package com.zk;
/**制作者：陈亮亮
 *制作时间：2017年11月13日下午9:23:40
 *邮箱：2507147605@qq.com
 */
public class leijiashu {
public static void main(String[] args) {
	System.out.println("第五题");
	//保存累加值的变量
	int sum=0;
	for(int i =1;i<=100;i++){
		if(!(i%10==3)){
			sum+=i;
		}
	
		
	}
	System.out.println(sum);
}

}
