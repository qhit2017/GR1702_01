package yangxueting;

import java.util.Scanner;

/** 
 * @author  作者 qqE-mail:157334005@qq.com
 * @date    创建时间：2017年11月21日 下午5:09:05 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class PalindromicNumber {

	public PalindromicNumber() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入一个五位数");
	int number=sc.nextInt();
	if(number>=10000&&number<=99999){
		int g=number/10000;
		int h=(number%10000)/1000;
		int l=(number%100);
		int j=(number%10)/10;
		int k=number%10;
		if(g==k&&j==h){

			System.out.println("恭喜"+number+"是回文数!");
			System.out.println(number+"的万位为："+g);
			System.out.println(number+"的千位为："+h);
			System.out.println(number+"的百位为："+l);
			System.out.println(number+"的十位为："+j);
			System.out.println(number+"的个位为："+k);
		}else{
			System.out.println("遗憾"+number+"不是回文数！");
		}
	}
		else{
			System.out.println("输入错误，请重新输入");
			sc.close();
		}
	}
	}

