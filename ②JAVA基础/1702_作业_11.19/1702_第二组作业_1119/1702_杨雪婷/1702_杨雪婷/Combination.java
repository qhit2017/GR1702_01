package yangxueting;
//66666666666666	
//99999999999999	

public class Combination {
public static void main(String[] args) {
	//从1,2,3,4,5这五个数中任意取出两个数列出它们的所有组合

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
