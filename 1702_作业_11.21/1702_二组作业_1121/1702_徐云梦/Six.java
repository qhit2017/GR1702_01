/**
 * 
 */
package com.zk.qhit;

/**
 * @author ���� :xuyunmeng
 * @date ����ʱ�䣺2017��11��21�� ����4:44:52
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Six {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;

		while (i <= 10) {
			sum = sum + i;
			if (sum >= 20) {

				System.out.println(i);
				break;
			}
			i++;
		}
	}

}
