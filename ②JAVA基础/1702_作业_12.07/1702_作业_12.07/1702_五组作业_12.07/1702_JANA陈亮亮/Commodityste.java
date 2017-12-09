package com.qk;

import java.util.ArrayList;
import java.util.Scanner;

/**制作者：陈亮亮
 *制作时间：2017年12月7日下午7:37:34
 *邮箱：2507147605@qq.com
 */
public class Commodityste implements IArticle {

	void menu(){
		System.out.println("----销售系统帮助-----");
		System.out.println("[1]新增商品请输入1");
		System.out.println("[2]进货请输入2");
		System.out.println("[3]销售请输入3");
		System.out.println("[4]参看库存请输入4");
		System.out.println("[5]退出系统请输入5");
	}
	@Override
	public void add(ArrayList<Commodity> arrayList, Scanner sc) {
		String a =sc.next();
		String[] split =a.split(",");
		if (split.length!=4 ) {
			System.out.println("你输入的格式不正确：请从新输入");
			System.out.println("格式为");
			System.out.println("编号,名称,价格,数量");
			
		}else {
			
		}

	}

	@Override
	public void info(ArrayList<Commodity> arrayList) {
	

	}

	@Override
	public void stock(ArrayList<Commodity> arrayList, Scanner sc) {
		

	}

	@Override
	public void maket(ArrayList<Commodity> arrayList, Scanner sc) {
		
	}

}
