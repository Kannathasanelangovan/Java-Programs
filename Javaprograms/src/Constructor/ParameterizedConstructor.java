package Constructor;

public class ParameterizedConstructor {
	
	String name;
	
	ParameterizedConstructor(String name){
		
		this.name = name;
		
	}
	
	public void display(){
		
		System.out.println("My name is" + name);
	}


	public static void main(String[] args) {
		
		ParameterizedConstructor pc = new ParameterizedConstructor("Kannathasan");
		pc.display();
		
		

	}

}
