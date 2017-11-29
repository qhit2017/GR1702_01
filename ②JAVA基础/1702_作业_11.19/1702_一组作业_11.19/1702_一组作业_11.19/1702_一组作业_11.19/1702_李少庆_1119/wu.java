package WX;
/*作者：
日期2017年11月17日时间下午4:01:55
邮箱：2408368509@qq.com
 */
public class wu {
public static void main(String[] args) {
	//编写JAVA程序，求1000以内，既能被5整除，又能被三整除的整数

	int i =1;
	do{
		if(i%5==0&&i%3==0){
			System.out.println(i);
		}
		i++;
	}while(i<=1000);
		
	
	
}
}
