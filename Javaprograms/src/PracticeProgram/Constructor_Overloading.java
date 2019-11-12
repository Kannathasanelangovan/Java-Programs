package PracticeProgram;

public class Constructor_Overloading {
	
	
	Constructor_Overloading(int a,int b){
		
		System.out.println("two arg");
		
	}
	
	Constructor_Overloading(int c){
		
		System.out.println("one arg");
		
	}

	public static void main(String[] args) {
		
		new Constructor_Overloading(10,20);
		new Constructor_Overloading(2);
		

	}

}
