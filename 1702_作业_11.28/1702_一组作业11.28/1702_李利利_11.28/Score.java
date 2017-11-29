
public interface Score {
	//管理十个人的成绩
	public static final int NUMBER = 10;
	
	//告知用户怎么用这个系统
	void help();
	//便历信息
     void infor(int[] a);
     //平均值
     int getAverage(int[] a);
     //总分
     int getSum(int[] a);
     //最大值
     int getMax(int[] a);
     //最小值
     int getMin(int[] a);
     //不及格人数
     int getNot60(int[] a);
     //升序排序
     int[] sort(int[] a);
}
