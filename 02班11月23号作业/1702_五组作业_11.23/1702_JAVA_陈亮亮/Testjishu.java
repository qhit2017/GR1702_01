package com.qk;
/**�����ߣ�������
 *����ʱ�䣺2017��11��23������7:17:46
 *���䣺2507147605@qq.com
 */
public class Testjishu {
public static void main(String[] args) {
	// ��for �� while���ַ�������1~100֮�������ĺ�
		int i=1;
		int sum=0;
		while (i<=100) {
			if(i%2!=0){
				sum+=i;
				
			}
			i++;
		}
		System.out.println(sum); 
	}
}

