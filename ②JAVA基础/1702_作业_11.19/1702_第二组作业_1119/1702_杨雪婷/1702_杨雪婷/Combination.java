package yangxueting;
//66666666666666	
//99999999999999	

public class Combination {
public static void main(String[] args) {
	//��1,2,3,4,5�������������ȡ���������г����ǵ��������

	for (int i=1;i<=5;i++){
		for(int j=1;j<=5;j++){
			if(i!=j){
				System.out.print(i);
				System.out.print(j+"\t");
			}
		}
		System.out.println();
	}
	
}
}
