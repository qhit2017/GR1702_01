package Class;
/*制作人：王欣
 *制作时间：2017年11月16日下午9:48:44
 *邮箱：2408368509@qq.com
 */

public class Hight {
	public static void main(String[] args) {
		// 一球从100米高度自由落下，每次落地后反跳回原高度的一半；
	     // 再落下，求它在 第6次落地时，共经过多少米？第6次反弹多高？
		double h =100;
		double n =h/2;
		for (int i = 1; i<6; i++){
			h+=n*2;
			n=n/2;
		}
		System.out.println(h);
		System.out.println(n);
	}

}
