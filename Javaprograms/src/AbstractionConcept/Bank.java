package AbstractionConcept;

public abstract class Bank {
	
	//https://www.youtube.com/watch?v=4oEV1aYcOwI
	
	public abstract void credit();

	
	public void debit(){
		
		System.out.println("Bank Debit");
	}
	
	public void loan(){
		
		System.out.println("Bank Loan");
	}

}
