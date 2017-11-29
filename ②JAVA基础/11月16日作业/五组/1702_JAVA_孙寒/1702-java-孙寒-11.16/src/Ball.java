import java.util.Scanner;

//一球从100米高度自由落下，每次落地后反跳回原高度的一半；
//再落下，求它在 第10次落地时，共经过多少米？第n次反弹多高？
public class Ball {
	public static void main(String[] args) {
		
		int a=100;
		int b=10;//触地次数
		int v=2;
		double c=a;
		double d=a/2;
		
		while(a>1&&v<=b){
			c=c+d*2;
			d=d/2;
			v++;
		}
		System.out.println("共经过"+c+"米");
		System.out.println("反弹高度为"+c+"米");
	}

}
