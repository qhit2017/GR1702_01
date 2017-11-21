package guo;

public class Four {
public static void main(String[] args) {
	//1000以内8的倍数之和。
	int a=0;
	int sum=0;
    for(int b=8;a<=1000;a++){
		if(a%8==0){
		sum=sum+a;
	}
	a++;
}
	System.out.println("1000以内8的倍数和是："+sum);
}
}