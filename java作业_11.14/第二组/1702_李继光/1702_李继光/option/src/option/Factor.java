package option;

public class Factor {
public static void main(String[] args) {
	//1000���ڵ�����������
	for(int a = 1;a<=1000;a++){
		int sum = 0;
		for (int b = 1;b<a; b++){
			if(a%b == 0){
				sum += b;
			}
		}
		if(sum == a){
			System.out.println(a+"\t");
		}
	}
}
}
