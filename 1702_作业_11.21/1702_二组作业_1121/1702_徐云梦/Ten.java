/**
 * 
 */
package com.zk.qhit;

/**
 * @author 作者 :xuyunmeng
 * @date 创建时间：2017年11月21日 下午5:47:53
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
