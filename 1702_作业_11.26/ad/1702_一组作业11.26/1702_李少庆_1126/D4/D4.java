package D4;
/*
日期2017年11月26日时间下午12:12:17
邮箱：2408368509@qq.com
 */
public class D4 {
public static void main(String[] args) {
	
	for (int i = 1; i <= 10000; i++) {
		if (i>=1000) {
			if (i/1000%10==3) {
				System.out.println(i);
			}
		}else if (i>=100) {
			if (i/100%10==3) {	
				System.out.println(i);
			}
		}else if (i>=10) {
			if (i/10%10==3) {
				System.out.println(i);
			}
		}else{
			if (i%10==3) {
				System.out.println(i);
			}
		}
	}
}
}
