package zuoye;
/**
 * time:11.16
 *week:Thursday
 *weather:sun
 *author:sun 
 * site:machine room
 */
public class ��ʮ�� {
public static void main(String[] args) {
	
	//����˷��ھ���(ʹ��whileѭ��ʵ��)
	int a = 1;
	while (a <= 9) {
		int b = 1;
		while (b <= a) {
			System.out.print(b + "*" + a + "=" + a * b + "\t");
			b++;
		}
		a++;
		System.out.println();
	}

}

}



