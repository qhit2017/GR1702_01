/**
 * 
 */
package feng;
import java.util.Scanner;

/**
 * @author ���ߣ��볿�  E-mail:2570804732@qq.com
 * @date ����ʱ�䣺26 Nov 2017 8:58:03 Ntambama
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
public class Four {

	// �����0~10000֮����3��ͷ����
	static boolean encapsulation(int a ,int b){
	boolean i= false;
	if(a==b||a/10==b|a/100==b||a/1000==b){
	i =true;
	}else{
		i=false;
	}
	return i;}
	public static void main(String[] args) {
	for(int g=0;g<10000;g++){
		if(encapsulation(g,  3)){
			System.out.println(g);
		}
	}
	
	
	
}
}
