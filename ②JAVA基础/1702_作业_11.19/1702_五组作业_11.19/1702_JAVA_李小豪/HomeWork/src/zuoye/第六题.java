package zuoye;
/**
 * time:11.16
 *week:Thursday
 *weather:sun
 *author:sun 
 * site:machine room
 */
public class 第六题 {
public static void main(String[] args) {
	
	//1至10之间的整数相加,得到累加值大于20的当前数字,将该数字输出.
	int sum = 0;
	for (int a = 1; a <= 10; a++) {
		sum = sum + a;
		if (sum > 20) {
			
			break;
		}
	}
	System.out.println(sum);

}

}



