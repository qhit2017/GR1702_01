package Test;
/*制作人：王欣
 *制作时间：2017年11月26日下午6:28:32
 *邮箱：2408368509@qq.com
 */

public class Test6 {
	public static void main(String[] args) {
		//求1000以内所有8的倍数的数字有多少个，请输出个数
		int j=0;
		System.out.println("以下是所有1000以内8的倍数的个数：");
		for(int i=0;i<=1000;i++){
			if(i%8==0){
				j++;
			}
		}System.out.println(j);
	}

}
