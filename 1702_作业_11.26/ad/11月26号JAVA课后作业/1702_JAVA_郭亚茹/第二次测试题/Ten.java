package Guo;

public class Ten {
	public static void main(String[] args) {
		//输出1900到2017之间所有的闰年。
		for (int a = 1900; a < 2017; a++) {
			if (a%4==0 && a%100!=0 || a%400==0) {
				System.out.println(a);
			}
			
		}
	}

}
