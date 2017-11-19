package zengxiangshun;



/**
 * @author 作者 曾祥顺\张彤彤
 * @date 创建时间：2017年11月16日 上午9:21:06
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Total {
	public static void main(String[] args) {
		// 一球从100米高度自由落下，每次落地后反跳回原高度的一半；
		// 再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
		double a = 100;
		double b = a;
		for (int c = 1; c < 10; c++) {
			a = a / 2;
			if (c == 10) {
				b = b + a;
			} else {
				b = b + 2 * a;
			}
		}
		System.out.println("经过" + b + "米，最后高" + a);
	}
}
