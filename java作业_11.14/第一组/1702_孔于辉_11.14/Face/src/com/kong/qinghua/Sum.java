package com.kong.qinghua;

/**
 * @author ���� E-mail:1299394372@qq.com
 * @date ����ʱ�䣺2017��11��13�� ����9:34:21
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Sum {
	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int c = 0;
		for (a = 1; a < 1000; a++) {
				c = 0;
			for (b = 1; b < a; b++) {

				if (a % b == 0) {
					
					c=c+b;

	}
	}	
			if (c == a ) {

				System.out.println(c);
	}
	}
	}
}
