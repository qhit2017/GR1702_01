/**
 * 
 */
package com.zk.qhit;

/**
 * @author ���� :xuyunmeng
 * @date ����ʱ�䣺2017��11��21�� ����5:47:53
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Ten {
	public static void main(String[] args) {
		int a = 1;
		while (a <= 9) {
			int b = 1;
			while (b <= a) {
				System.out.print(b + "*" + a + "=" + b * a + "\t");
				b++;
			}
			a++;
			System.out.println();
		}

	}
}
