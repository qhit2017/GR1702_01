package yangxueting;

public class Divideexactly {
public static void main(String[] args) {
	//求1000以内既能被5整除又能被3整除的所有整数
	int h=1;
	do{
		if((h%5==0)&&(h%3==0)){
			System.out.println("1000以内既能被5整除又能被3整除的所有整数是"+h);
			
		}h++;
}
	while(h<=1000);
}
}