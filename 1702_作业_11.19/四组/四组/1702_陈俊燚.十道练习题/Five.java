package chenjunyi;

//一千内能被3整除，又能被5整除的整数
public class Five {
	public static void main(String[] args) {
	for(int a =1;a<=1000;a++){
		if(a%3==0&&a%5==0){
			System.out.println(a);
		}
	}
}
}
