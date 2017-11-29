/**
 * 
 */
package com;
import java.util.Scanner;

/**
 * @author 作者：冯晨婕 /贾慧波  E-mail:2570804732@qq.com
 * @date 创建时间：27 Nov 2017 4:23:51 Ntambama
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
public interface Score {
   public static final int NUMBER =10;
   void help();
   void info();
   int getAverage(int[]a);
   
   int getSum(int[]a);
   
   int getMax(int[]a);
   
   int getMin(int[]a);
   int getNot60(int[]a);
   int getInfo (int[]a);
   int[]sort(int[]a);
/**
 * @param a
 */
void info(int[] a);
   
   
}
