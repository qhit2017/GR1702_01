package yangxueting;

import java.util.Scanner;

/** 
 * @author  ���� qqE-mail:157334005@qq.com
 * @date    ����ʱ�䣺2017��11��21�� ����5:09:05 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class PalindromicNumber {

	public PalindromicNumber() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("������һ����λ��");
	int number=sc.nextInt();
	if(number>=10000&&number<=99999){
		int g=number/10000;
		int h=(number%10000)/1000;
		int l=(number%100);
		int j=(number%10)/10;
		int k=number%10;
		if(g==k&&j==h){

			System.out.println("��ϲ"+number+"�ǻ�����!");
			System.out.println(number+"����λΪ��"+g);
			System.out.println(number+"��ǧλΪ��"+h);
			System.out.println(number+"�İ�λΪ��"+l);
			System.out.println(number+"��ʮλΪ��"+j);
			System.out.println(number+"�ĸ�λΪ��"+k);
		}else{
			System.out.println("�ź�"+number+"���ǻ�������");
		}
	}
		else{
			System.out.println("�����������������");
			sc.close();
		}
	}
	}

