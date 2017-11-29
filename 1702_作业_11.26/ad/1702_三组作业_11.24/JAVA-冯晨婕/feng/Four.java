/**
 * 
 */
package feng;
import java.util.Scanner;

/**
 * @author 作者：冯晨婕  E-mail:2570804732@qq.com
 * @date 创建时间：26 Nov 2017 8:58:03 Ntambama
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

	// 请输出0~10000之间以3开头的数
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
