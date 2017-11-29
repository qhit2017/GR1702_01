package guguoxin;
/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月14日 下午9:03:20 
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
