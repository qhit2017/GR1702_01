package Test;
/*�����ˣ�����
 *����ʱ�䣺2017��11��26������6:50:19
 *���䣺2408368509@qq.com
 */

public class Test10 {
	public static void main(String[] args) {
		//�����1900��2017��֮�����е�����
		
		for(int i =1900;i<=2017;i++){
			if(i%4==0&&i%100!=0||1%400==0){
				System.out.println(i);
			}
		}
	}

}
