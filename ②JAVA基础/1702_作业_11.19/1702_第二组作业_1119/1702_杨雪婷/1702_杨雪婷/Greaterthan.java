package yangxueting;

public class Greaterthan {
public static void main(String[] args) {
	//��1��10֮�����������ۼ�ֵ����20�ĵ�ǰ����
	int j=1;
	int sum=0;
	while(j<=10){
		sum=sum+j;
		if(sum>20){
			System.out.println("��ǰ���ǣ�"+j);
			System.out.println("�ۼ�ֵ����20�����ǣ�"+sum);
			break;
		}
		j++;
	}
}
}
