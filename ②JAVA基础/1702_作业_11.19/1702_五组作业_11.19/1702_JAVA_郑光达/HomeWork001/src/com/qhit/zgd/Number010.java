/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��19�� ����5:04:44 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

public class Number010 {

	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		while (i < 10) {
			if (j < i) {
				System.out.print(j + " * " + i + " = " + j * i + "\t");
				j++;
				continue;
			} else if (i == j) {
				System.out.print(j + " * " + i + " = " + j * i + "\t");
				j = 1;
				i++;
				System.out.println();
			}
		}
	}

}
