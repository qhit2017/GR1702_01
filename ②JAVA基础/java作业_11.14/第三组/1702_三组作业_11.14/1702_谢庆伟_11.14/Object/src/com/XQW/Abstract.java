package com.XQW;
/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月13日 下午8:55:03 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Abstract {
String name;  //姓名
String gender;  //性别
int age;  //年龄
int height;  //身高
int weight;  //体重
String pro;  //职业
void info(){
	System.out.println("将 人物信息 为一类，实例如下：\n\n"
			+ "姓名："+name+"\n"
			+ "性别："+gender+"\n"
			+"年龄："+age+"\n"
			+"身高："+height+"cm"+"\n"
			+ "体重："+weight+"kg"+"\n"
			+ "职业："+pro);
}

	public static void main(String[] args) {
		System.out.println("二、择一事 物抽象成类并实例化。\n");
		Abstract p=new Abstract();
		p.name="马某";
		p.gender="男";
		p.age=50;
		p.height=169;
		p.weight=55;
		p.pro="阿里总裁";
		p.info();

	}

}
