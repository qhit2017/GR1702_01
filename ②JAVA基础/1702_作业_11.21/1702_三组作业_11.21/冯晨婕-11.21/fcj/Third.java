/**
 * 
 */
package fcj;
import java.util.Scanner;

/**
 * @author ���ߣ��볿�  E-mail:2570804732@qq.com
 * @date ����ʱ�䣺20 Nov 2017 7:33:04 Ntambama
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
/**
 * @author Administrator
 *
 */
public class Third {
//������������x,y,z���������������С���������
public static void main(String[] args) {
	Scanner a =new Scanner(System.in);
	System.out.println("������x:");
	int x =a.nextInt();
	Scanner b =new Scanner(System.in);
	System.out.println("������y:");
	int y =b.nextInt();
	Scanner c =new Scanner(System.in);
	System.out.println("������z:");
	int z =c.nextInt();
	int m=0;
	if(x>y){
	m=x;
	x=y;
	y=m;}
	if(x>z){
		m=x;
		x=z;
		z=m;
	}
	if(y>z){
		m=z;
		z=y;
		y=m;
	}
	

	
	System.out.println("��С��������Ϊ��"+"\t" +x+" "+y+" "+z);

}
}