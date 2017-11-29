package xiaxiaoyu;

public class Test4 {
	public static void main(String[] args) {
		for(int f = 1;f<=10000;f++){
			if(f<10 && f%10==3){
				System.out.println(f);
			}if(f<100 && f/10%10==3){
				System.out.println(f);
			}if(f<1000 && f/100%10==3){
				System.out.println(f);
			}if(f<10000 && f/1000==3){
				System.out.println(f);
			}
			
		}
	}

}
