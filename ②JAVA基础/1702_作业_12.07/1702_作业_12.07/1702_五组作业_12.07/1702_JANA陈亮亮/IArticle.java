package com.qk;

import java.util.ArrayList;
import java.util.Scanner;

/**制作者：陈亮亮
 *制作时间：2017年12月7日上午9:08:00
 *邮箱：2507147605@qq.com
 */
public interface IArticle {
void add (ArrayList<Commodity>arrayList,Scanner sc);

void info(ArrayList<Commodity>arrayList);

void stock(ArrayList<Commodity>arrayList,Scanner sc);

void maket(ArrayList<Commodity>arrayList,Scanner sc); 

}
