package guo;

public class Ten { 
	public static void main(String[] args) {
		//��while���žų˷���
		int a=1;
		while (a<=9){
			int b=1;
			while(b<=a){
				System.out.println(b+"*"+a+"="+a*b+"\t");
				b++;
			}
			a++;
			System.out.println();
		}
		
	}

}
