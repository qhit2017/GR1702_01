package yangxueting;

import java.util.Scanner;

/** 
 * @author  作者 qqE-mail:157334005@qq.com
 * @date    创建时间：2017年11月20日 下午7:08:23 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Integer {

	public Integer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个整数");
		int x=sc.nextInt();
		System.out.println("请输入二个整数");
		int y=sc.nextInt();
		System.out.println("请输入三个整数");
		int z=sc.nextInt();
		int l=0;
		if(x<y){
			l=x;x=y;y=l;
		}
		if(x<z){
			l=x;x=z;z=l;
		}
		if(y<z){
			l=y;y=z;z=l;
		}
		System.out.println("从小到大的顺序:"+z+"<"+y+"<"+x);
		sc.close();
	}
}
