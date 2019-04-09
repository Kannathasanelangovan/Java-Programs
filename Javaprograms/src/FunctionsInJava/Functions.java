package FunctionsInJava;

import java.util.ArrayList;

public class Functions {
	
	public static void main(String[] args) {
		
		Functions fun = new Functions();
		
	fun.test();
	fun.sum();
	fun.getName();
	fun.division(2, 10);
	fun.contString("kanna", "shani", 2, 23);
	fun.getStudentName("Kannathasan", "Anu");
		
	}
	
	
	//Can't create function inside a function
			//functions are independent to each
			
			//Two types of function
			
			//1.System defind
			//2.User defind
			//2a.No input no output
			//2b.no input some output
			//2c.some input some output
	
	//2a.No input no output
 
	public void test(){
		
		System.out.println("Test Method");
	}
	
	//2b.no input some output

	public int sum(){
		
		
		int a =10;
		int b =20;
		int c = a+b;
		
		
		System.out.println("Sum method"+c);

		return c;

	}


	public String getName(){
		
		
		String s = "Kannathasan";
		
		System.out.println("Get Name method"+s);

		return s;
		
	}
	
	//2c.some input some output

	public int division(int x,int y){
		
		
			
	int z = x/y;
	
	
	System.out.println("Division method"+z);

	return z;
	
	
		
	}
	
	public String contString(String f,String l,int a,int b){
		
		
		String c = f+l+a+b;
		
		System.out.println("String Concat Method"+c);

		return c;
		
		
	}
	
	public int[] getNumber(int a1,int b1,int c1){
		

		
		int a2[] = new int[2];
		
		a2[0] = 1;
		a2[1] = 2;
		a2[2] = 3;
		
		System.out.println("Get number method"+a2);

		return a2;
		
				
	}
	
	public ArrayList<String> getStudentName(String n1,String n2){
		
		System.out.println("Get Student Name method");

		
		ArrayList<String> s1 = new ArrayList<String>();
		
		s1.add(n1);
		s1.add(n2);
		System.out.println("Get Student Name method"+s1);

		return s1;
		
		
	}
}
