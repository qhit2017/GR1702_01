package fcj;

public class Four {
public static void main(String[] args) {
	//1000以内sh8的倍数之和；
	int sum =0;
	for(int a=0;a<=1000;a++){
		if(a%8==0){
		sum+=a;
	}
}System.out.println(sum);
}
}