package inheritanceConcept;


//https://www.youtube.com/watch?v=O4CzZUk0VbQ (Overloading and Overridding)
public class ChildClass extends BaseClass {
	
	public void section(){
		
		System.out.println("Studen Section");
	}

	public void mark(){
		
		System.out.println("Studen Mark");
	}
	public static void main(String[] args) {
		
		ChildClass cc = new ChildClass();
		cc.rollnumber();
		cc.name();
		cc.section();
		cc.mark();

	}

}
