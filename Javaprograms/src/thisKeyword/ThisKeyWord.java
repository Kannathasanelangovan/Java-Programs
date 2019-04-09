package thisKeyword;

public class ThisKeyWord {
	
		String name;
		int salary;
		
		ThisKeyWord(String name,int salary){
			
			this.name = name;
			this.salary = salary;			
		}
		
		void display(){
			
			System.out.println("Name : "+name+" salary : "+salary);	
			
		}

	public static void main(String[] args) {
		
		ThisKeyWord tk = new ThisKeyWord("Kannathasan", 10);
		tk.display();
		
		
		
	}

}
