package Guo;

public class Ten {
	public static void main(String[] args) {
		//���1900��2017֮�����е����ꡣ
		for (int a = 1900; a < 2017; a++) {
			if (a%4==0 && a%100!=0 || a%400==0) {
				System.out.println(a);
			}
			
		}
	}

}
