package yangxueting;
//66666666666666	
//99999999999999	

public class Singledigit {
public static void main(String[] args) {
	//求个位数为6且能被3整除的3位整数共有多少
	for(int j=100;j<=999;j++){
		if(j%10==6&&j%3==0){
			System.out.println(j);
		}
	}
	}
}

