package chenjunyi;
//一球从h米高度自由落下，每次落地后反跳回原高度的一半；
//再落下，求它在 第n次落地时，共经过多少米？第n次反弹多高？
public class Five {
public static void main(String[] args) {
	double h =1100;
	double sum =0;
	for(int n=1;n<=10;n++){
		sum+=h;
		h=h*0.5;
		if(n!=10){
			sum+=h;
		}
	}
	System.out.println(sum+",");
}
}
