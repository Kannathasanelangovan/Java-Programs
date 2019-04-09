package thisKeyword;

public class CallingDefaultConstructor {
	
	 String name;
	 int salary;


	CallingDefaultConstructor(){
		
		System.out.println("Calling default Constructor");
	}
	
	CallingDefaultConstructor(String name,int salary){
		
		this();
		this.name = name;
		this.salary =salary;
		System.out.println("Name : "+name+" salary : "+salary);	

	}
	

	void display(){
		
		System.out.println("display method");
	}
	public static void main(String[] args) {
		
		CallingDefaultConstructor cd = new CallingDefaultConstructor();
		
		cd.display();

	}

}
