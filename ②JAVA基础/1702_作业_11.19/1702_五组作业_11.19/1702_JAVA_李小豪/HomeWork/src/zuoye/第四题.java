package zuoye;
/**
 * time:11.16
 *week:Thursday
 *weather:sun
 *author:sun 
 * site:machine room
 */
public class 第四题 {
public static void main(String[] args) {
	
	//求1000以内所有8的倍数之和
	int sum=0;
	for(int a=1;a<=1000;a++){
		if(a%8==0){
			sum=sum+a;
		}
	}
System.out.println(sum);
}

}



