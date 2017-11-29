package yangxueting;

public class Greaterthan {
public static void main(String[] args) {
	//求1至10之间的整数相加累加值大于20的当前数字
	int j=1;
	int sum=0;
	while(j<=10){
		sum=sum+j;
		if(sum>20){
			System.out.println("当前数是："+j);
			System.out.println("累加值大于20的数是："+sum);
			break;
		}
		j++;
	}
}
}
