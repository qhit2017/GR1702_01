package shape;

public class Trapezoid implements Shape{
//����
	int s;//�ϱ߳�
	int x;//�±߳�
	int g;//��
	private int m;//���
	int z;//�ܳ�
	int y;//��
	
	
	
	
	public int getM() {
		return m;
	}

	public int perimeter() {
		z=s+x+(z*2);
		return z;
	}

	public int area() {
		m=((s+x)*g)/2;
		return getM();
	}
 

public Trapezoid(){
	
	
}

public Trapezoid(int s, int x) {
	
	this.s = s;
	this.x = x;
}



}
