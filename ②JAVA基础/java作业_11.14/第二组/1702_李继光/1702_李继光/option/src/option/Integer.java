package option;

public class Integer {
public static void main(String[] args) {
	//������1~100���ۼ�ֵ����Ҫ���^��λ�����Ĕ�
	System.out.println("������1~100���ۼ�ֵ����Ҫ���^��λ�����Ĕ�");
	int sum = 0;
	for(int a = 1;a<=100;a++){
		if(a%10 !=3 ){
			sum += a;
		}
	}
	System.out.println("����͞飺"+sum);
}
}
