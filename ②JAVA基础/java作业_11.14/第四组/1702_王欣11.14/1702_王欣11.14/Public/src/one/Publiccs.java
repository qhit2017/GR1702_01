package one;

/*制作人：王欣
 *制作时间：2017年11月13日下午9:28:25
 *邮箱：2408368509@qq.com
 */

public class Publiccs {
	public static void main(String[] args) {

		Products s = new Products("23", "SSS", 23);
		System.out.println(s.getNumber());
		System.out.println(s.name);
		System.out.println(s.price);
		s.setNumber("008");
	}
}
