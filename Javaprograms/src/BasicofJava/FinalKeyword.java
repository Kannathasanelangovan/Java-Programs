package BasicofJava;

public class FinalKeyword {
	
	/*
	 * A final class cannot be sub classed.
	 * A final method cannot be overridden by subclass
	 * A final variable can only be initialized once
	 * 
	 * 
	 * 
	 */
	
	public final int number;
	
	FinalKeyword(){
		
		number = 10;
		
	}
	
	
	public static void main(String[] args) {
		
		FinalKeyword fk = new FinalKeyword();
		System.out.println(fk.number);

	}

}
