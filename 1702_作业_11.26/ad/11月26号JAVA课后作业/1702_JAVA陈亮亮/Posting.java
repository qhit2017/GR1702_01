package com.qk;
/**�����ߣ�������
 *����ʱ�䣺2017��11��26������8:48:29
 *���䣺2507147605@qq.com
 */
public class Posting {
	//�����0~10000֮����3��ͷ������װ�ɷ���
	
		public static void main(String[] args) {
			for (int a = 0; a <10000; a++) {
				if (a/10000==0&&a/1000==3) {
					System.out.println(a);
				}
				if (a/1000==0&&a/100==3) {
					System.out.println(a);
				}
				if (a/100==0&&a/10==3) {
					System.out.println(a);
				}
				if (a/10==0&&a/1==3) {
					System.out.println(a);
				}
			}
		}
}
