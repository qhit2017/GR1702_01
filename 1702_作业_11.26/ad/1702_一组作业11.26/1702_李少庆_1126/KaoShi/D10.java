package KaoShi;
/*
����2017��11��26��ʱ������1:36:50
���䣺2408368509@qq.com
 */
public class D10 {
public static void main(String[] args) {
	for(int a=1900;a<=2017;a++){
		if(a%4==0&&a%100!=0||a%400==0){
			System.out.println(a);
		}
	}
}
}
