package SuperKeyword;

public class SuperKeywordContinue extends SuperKeyword {
	
	
	public SuperKeywordContinue(){
		
		System.out.println("Default constructor");
	}
	
	public SuperKeywordContinue(int a){
		
		super(a);
		System.out.println("Child class constructor");
		
		
	}
	
	public SuperKeywordContinue(int a,int b){
		
		super(a,b);
		System.out.println("Child class 2 params");
		
	}
	

	public static void main(String[] args) {
		
		SuperKeywordContinue sc = new SuperKeywordContinue();
		SuperKeywordContinue sc1 = new SuperKeywordContinue(10);
		SuperKeywordContinue sc2 = new SuperKeywordContinue(11,12);
		

	}

}
