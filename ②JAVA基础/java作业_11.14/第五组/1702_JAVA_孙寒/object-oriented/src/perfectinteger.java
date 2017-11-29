
public class perfectinteger {
	//一个数如果恰好等于它的因子之和，这个数就称为完数
	public static void main(String[] args) {
		for(int a=1;a<=1000;a++){
			int sum=0;
			for(int b=1;b<a;b++){
				
				if(a%b==0){
					
					sum +=b;
				}
			}if(sum==a){
				System.out.println(a+"\t");
			}
		}
	
	}

}