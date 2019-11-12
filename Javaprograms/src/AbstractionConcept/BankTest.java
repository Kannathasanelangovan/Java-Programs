package AbstractionConcept;

public class BankTest {

	public static void main(String[] args) {

		HDFC hb = new HDFC();
		
		hb.credit();
		hb.debit();
		hb.loan();
		hb.funds(); //new comment
		
		Bank b = new HDFC();
		
		b.credit();
		b.debit();
		b.loan();
		
	}

}
