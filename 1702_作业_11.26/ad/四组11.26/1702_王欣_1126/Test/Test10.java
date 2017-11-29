package Test;
/*制作人：王欣
 *制作时间：2017年11月26日下午6:50:19
 *邮箱：2408368509@qq.com
 */

public class Test10 {
	public static void main(String[] args) {
		//输出从1900到2017年之间所有的闰年
		
		for(int i =1900;i<=2017;i++){
			if(i%4==0&&i%100!=0||1%400==0){
				System.out.println(i);
			}
		}
	}

}
