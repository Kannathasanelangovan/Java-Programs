package Constructor;

public class ConstructorOverloading {
	
	String StudentName;
	int rollnumber;
	
	
	ConstructorOverloading(){
		
		System.out.println("Default Constructor");
	}
	

	ConstructorOverloading(int a){
		
		System.out.println("Parameter ConStructor with 1 params");
		
		
	}

	ConstructorOverloading(int a, int b){
		
		System.out.println("Parameter Constructor with two params");
	}
	
	ConstructorOverloading(String StudentName,int rollnumber){
		
		this.StudentName = StudentName;
		this.rollnumber = rollnumber;
		
		System.out.println("The student name is "+StudentName);
		System.out.println("Roll number is "+rollnumber);
		
	}



	public static void main(String[] args) {
		
		ConstructorOverloading co1 = new ConstructorOverloading();
		ConstructorOverloading co2 = new ConstructorOverloading(10);
		ConstructorOverloading co3 = new ConstructorOverloading(20,30);
		ConstructorOverloading co4 = new ConstructorOverloading("Kannathasan",11);
		
		

	}

}
