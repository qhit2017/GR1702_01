package yangxueting;

public class Divideexactly {
public static void main(String[] args) {
	//��1000���ڼ��ܱ�5�������ܱ�3��������������
	int h=1;
	do{
		if((h%5==0)&&(h%3==0)){
			System.out.println("1000���ڼ��ܱ�5�������ܱ�3����������������"+h);
			
		}h++;
}
	while(h<=1000);
}
}