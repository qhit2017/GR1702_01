package yangxueting;


//66666666666666	
//99999999999999	

public class Freefallingbody {
		
	public static void main(String[] args) {
		double h=100;
		double j=h/2;
		int g=0;
		for(g=2;g<=10;g++){
			h+=j*2;
			j=j/2;
			
		}
		System.out.println("第"+g+"次落地经过"+h+"米");
		System.out.println("第"+g+"反弹高度:"+j+"米");
	}
}
