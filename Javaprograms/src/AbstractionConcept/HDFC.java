package AbstractionConcept;

public class HDFC extends Bank{

	@Override
	public void credit() {
		
		System.out.println("Credit for HDFC");
		
	}
	
	public void funds(){
		
		System.out.println("Funds only for HDFC");
	}
	
	

}
