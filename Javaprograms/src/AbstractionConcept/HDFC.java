package AbstractionConcept;

public class HDFC extends Bank{

	@Override
	public void credit() {
		
		System.out.println("Credit");
		
	}
	
	public void funds(){
		
		System.out.println("Funds only for HDFC");
	}
	
	

}
