package Constructor;

public class ConStructorInheritance {

	//We can't inherit the constructor
	//https://www.geeksforgeeks.org/constructors-not-inherited-java/
	
	
	
	public ConStructorInheritance(){
		
		System.out.println("Parent Class Constructor");
		
		
	}
	
	public void display(){
		
		System.out.println("The parent class method");
	}
	
	public class ConStructorInheritancechildclass extends ConStructorInheritance{
		
		/*public ConStructorInheritance(){
			
			System.out.println("Parent Class Constructor");
			
			
		}*/
		
		
	}
	
	public static void main(String[] args) {
		
		ConStructorInheritance ci = new ConStructorInheritance(); // allowed 
	//	ConStructorInheritance c1 = new ConStructorInheritancechildclass(); // not allowed
		

	}

}
