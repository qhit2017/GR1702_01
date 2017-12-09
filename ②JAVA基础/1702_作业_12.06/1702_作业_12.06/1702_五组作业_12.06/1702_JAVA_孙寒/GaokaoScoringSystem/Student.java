package GaokaoScoringSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
//录入考试信息信息包含姓名、编号、语文、数学、英语成绩，并计算出总成绩
	String name;
	String id;
	double yvwenchengji;
	double shuxuechengji;
	double Englishchengji;
	double zongchengji;
	
	
	public Student() {
		super();
	}


	public Student(String name, String id, double yvwenchengji,
			double shuxuechengji, double englishchengji, double zongchengji) {
		super();
		this.name = name;
		this.id = id;
		this.yvwenchengji = yvwenchengji;
		this.shuxuechengji = shuxuechengji;
		Englishchengji = englishchengji;
		this.zongchengji = zongchengji;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public double getYvwenchengji() {
		return yvwenchengji;
	}


	public void setYvwenchengji(double yvwenchengji) {
		this.yvwenchengji = yvwenchengji;
	}


	public double getShuxuechengji() {
		return shuxuechengji;
	}


	public void setShuxuechengji(double shuxuechengji) {
		this.shuxuechengji = shuxuechengji;
	}


	public double getEnglishchengji() {
		return Englishchengji;
	}


	public void setEnglishchengji(double englishchengji) {
		Englishchengji = englishchengji;
	}


	public double getZongchengji() {
		return zongchengji;
	}


	public void setZongchengji(double zongchengji) {
		this.zongchengji = zongchengji;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", yvwenchengji="
				+ yvwenchengji + ", shuxuechengji=" + shuxuechengji
				+ ", Englishchengji=" + Englishchengji + ", zongchengji="
				+ zongchengji + "]";
	}


	public void helpinfo() {
		// TODO Auto-generated method stub
		
	}


	public void addStudent(ArrayList<Student> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		
	}


	
	
	
}
