package Array01;

import java.util.Arrays;
import java.util.Scanner;

/*�����ˣ�����
 *����ʱ�䣺2017��11��27������2:24:00
 *���䣺2408368509@qq.com
 */

public class Array {
	public static void main(String[] args) {
		
		//��̬����
		double[] i = new double[9];
		System.out.println(i.length);
		
		
		i[0]=8.9;
		i[1]=9.8;
		i[2]=1.2;
		i[3]=3.2;
		i[4]=4.5;
		i[5]=5.5;
		i[6]=9.7;
		i[7]=7.6;
		i[8]=6.9;
		
		
		//��̬����
		int[]q={1,2,3,45,67};
		//System.out.println(q.length);
		
		
		//��������
		for(int j=0;j<q.length;j++){
			System.out.println(q[j]);
			
			Car[] cars = new Car[2];
			cars[0]=new Car("���",55.5);
			
			
			
			int[]f = new int[5];
			int sum=0;
			Scanner sc = new Scanner(System.in);
			for (int o = 0; o < f.length; o++) {
				System.out.println("�����룺"+(o+1)+"����");
				f[o]=sc.nextInt();
				sum +=f[o];
			}
			
			System.out.println(Arrays.toString(f));
			System.out.println(sum/f.length);
			
			int max=f[0];
			int min=f[0];
			for (int k = 0; k < f.length; k++) {
				if (f[k]>max) {
					max=f[k];
				}if(f[k]<min){
					min=f[k];
				}
			}
			System.out.println(max);
			System.out.println(min);
		}
		
	}

}
