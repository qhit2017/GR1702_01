/**
 * 
 */
package com.zk.qhit;

/**
 * @author 作者 :xuyunmeng
 * @date 创建时间：2017年11月21日 下午4:44:52
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
