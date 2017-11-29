package Score;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月27日 下午4:31:34 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入第"+(i+1)+"个分数");
			a[i] = sc.nextInt();
		}
		Implment b = new Implment();
		int s;
		boolean  isqust = true;
		
		b.help();
		
		
		
		
		while (isqust) {
			
			System.out.println("請輸入你要執行的命令，并按回車鍵");
			 s = sc.nextInt();	
			switch (s) {
			case  1:
				System.out.println("總分是："+b.getSum(a)+"\n");
				
			break;
			case 2:
				System.out.println("平均分为："+b.getAverage(a));
				break;
			case 3:
				System.out.println("最高分为："+b.getMax(a));
				
				break;
			case 4:
				System.out.println("最低分为："+b.getMin(a));
				
				break;
			case 5:
				System.out.println("不及格为："+b.getNot(a));
				
				break;
			case  6:
				System.out.print("全部分数：");
				b.info(a);
				break;
				
			case 7:
				System.out.print("排序输出为：");
				b.sort(a);
				break;
			case 8 :
				System.out.println("感谢你的使用，再见！");
				isqust = false;
				
			default:
				
			}
		}
		
	}

	

}
