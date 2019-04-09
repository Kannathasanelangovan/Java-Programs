package BasicofJava;

public class MathandArithmeticOperators {

	public static void main(StringConcept[] args) {
		
		
		MathandArithmeticOperators mao = new MathandArithmeticOperators();
		mao.add(10, 11);
		mao.sub(20, 10);
			
	}

	public void add(int a,int b){
		
		int c = a+b;
		
		System.out.println("The addition of two number is" + c);
		
		
	}
	
	public void sub(int a,int b)
	{
          int c = a-b;
		
  		System.out.println("The sub of two number is" + c);
	}
	}
