package lishaoqing2;

public class D2 {

	private String id;
	String tradmark;
	String name;
	String memory;
	
	D2(String id,String tradmark,String name,String memory){
		this.id =id;
		this.tradmark = tradmark;
		this.name = name;
		this.memory =memory;
		
	}
	
	void setId(String id){
		if(id.equals("000")){
			System.out.println("�������ֵ��Ч");
		}else{
		this.id=id;
		}
	}
	String getId(){
		return id;
	}
}
