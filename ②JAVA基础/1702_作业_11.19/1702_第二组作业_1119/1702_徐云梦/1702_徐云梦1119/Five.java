public class Five {
	public static void main(String[] args) {

		int a =0;
		do{
			if(a%3==0&&a%5==0){
				System.out.println("既能被三整除又能被五整除的数是："+a);
				
			}a++;
			
		}while(a<=1000);
	}
}