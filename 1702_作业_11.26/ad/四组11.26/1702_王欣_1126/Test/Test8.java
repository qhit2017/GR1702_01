package Test;
/*制作人：王欣
 *制作时间：2017年11月26日下午6:39:47
 *邮箱：2408368509@qq.com
 */

public class Test8 {
	public static void main(String[] args) {
		//输出所有10000以内个位数为6且同时能被3整除的整数
		for(int i=0;i<=10000;i++){
			if(i%3==0&&i%10==6){
				System.out.println(i);
			}
		}
	}

}
