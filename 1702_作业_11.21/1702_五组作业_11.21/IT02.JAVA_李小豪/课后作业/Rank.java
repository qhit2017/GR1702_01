package com.zk.qhit.statictest;

import java.util.Scanner;

public class Rank {
public static void main(String[] args) {
	//������������x��y��z�������������С�������
	Scanner sc=new Scanner(System.in);
	System.out.println("������x");
	int x=sc.nextInt();
	System.out.println("������y");
	int y=sc.nextInt();
	System.out.println("������z");
	int z=sc.nextInt();
	int r;
	if(x>y);{
	   r=x;
	   x=y;
	   y=r;
	}  
	if(x>z);{
		r=x;
		x=z;
		z=r;
	}
	if(y>z);{
		r=y;
		y=z;
		z=r;
		}
	System.out.println("��С��������Ϊ:"+x+" "+y+" "+z);
}
}
