package PracticeProgram;

public class Overloading_sample {
	
	public void sum(int a,int b,int c){
		
System.out.println("method 1");	}

	public void sum(int a,int b,int c,int d){
		
System.out.println("method 2");		
	}
	public static void main(String[] args) {
		
		Overloading_sample obj = new Overloading_sample();
		obj.sum(10, 20, 30);
		obj.sum(10, 20, 30, 40);

	}

}
