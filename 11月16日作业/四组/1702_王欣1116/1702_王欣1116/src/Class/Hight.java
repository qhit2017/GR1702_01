package Class;
/*�����ˣ�����
 *����ʱ�䣺2017��11��16������9:48:44
 *���䣺2408368509@qq.com
 */

public class Hight {
	public static void main(String[] args) {
		// һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻
	     // �����£������� ��6�����ʱ�������������ף���6�η�����ߣ�
		double h =100;
		double n =h/2;
		for (int i = 1; i<6; i++){
			h+=n*2;
			n=n/2;
		}
		System.out.println(h);
		System.out.println(n);
	}

}
