package Definition;

/**
 * @author 作者 E-mail:1456014420@qq.com
 * @date 创建时间：2017年11月16日 下午8:25:49
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class SumTest {
	public static void main(String[] args) {
		// 一球从100米高度自由落下，每次落地后反跳回原高度的一半；
		// 再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？

		int a=100;//初始高度
		
		
		int b=10;//落地次数
		int c=2;//第二次反弹
		double r=a;  //经过米数
		double hei=a/2;  //n次的反弹高度

		while(b>1&&c<=b){
			r=r+hei*2;
			hei=hei/2;
			c++;
		}
		System.out.println("共经过"+r+"米！");
		System.out.println("反弹高度为："+hei+"米！");
		
	}

}
