package yangxueting;

import java.util.Scanner;

/** 
 * @author  ���� qqE-mail:157334005@qq.com
 * @date    ����ʱ�䣺2017��11��20�� ����7:08:23 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Integer {

	public Integer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ������");
		int x=sc.nextInt();
		System.out.println("�������������");
		int y=sc.nextInt();
		System.out.println("��������������");
		int z=sc.nextInt();
		int l=0;
		if(x<y){
			l=x;x=y;y=l;
		}
		if(x<z){
			l=x;x=z;z=l;
		}
		if(y<z){
			l=y;y=z;z=l;
		}
		System.out.println("��С�����˳��:"+z+"<"+y+"<"+x);
		sc.close();
	}
}
