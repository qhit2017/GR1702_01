package Commodity;
/** 
 * @author  ���� E-mail:738348954@qq.com
 * @date    ����ʱ�䣺2017��11��14�� ����4:45:56 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class test {
//������ �������
	int number;
	String name;
	int price;
	char type;
	String sort;
	test(int numbers,String names,int prices,
			char typeS,String sorts){
		number =numbers;
		name =names;
		price =prices;
		type =typeS;
		sort =sorts;
	}
	public static void main(String[] args) {
		test s =new test(10,"�ʼǱ�",10,'t',"�ľ���");
			System.out.println("��Ʒ��ţ�"+s.number);
			System.out.println("���ƣ�"+s.name);
			System.out.println("�۸�"+s.price);
			System.out.println("�ͺţ�"+s.type);
			System.out.println("���"+s.sort);
	}
}
	




