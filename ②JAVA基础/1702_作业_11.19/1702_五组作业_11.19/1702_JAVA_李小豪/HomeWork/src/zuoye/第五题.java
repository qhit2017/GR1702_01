package zuoye;
/**
 * time:11.16
 *week:Thursday
 *weather:sun
 *author:sun 
 * site:machine room
 */
public class 第五题 {
public static void main(String[] args) {
	
	//求1000以内,既能被5整除，又能被3整除的所有整数,并打印出来(使用do while循环来使用)
	System.out.println("求1000以内既能被5整除"
			+ "又能被3整除的所有整数");
	int a=1;
	do {
		if(a%5==0 && a%5==0){
			System.out.println(a);
		}
		a++;
	} while (a<=1000);
	
}

}



