package KaoShi;
/*
日期2017年11月26日时间下午1:36:50
邮箱：2408368509@qq.com
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
