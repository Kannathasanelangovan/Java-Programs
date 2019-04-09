package BasicofJava;

public class MethodOverloading {
	
	//Different method with the same name with different paramters

	public static void main(String[] args) {

		System.out.println(add(1,2));
		System.out.println(add(1.1,5.1));
		System.out.println(add("Kannathasan","Elangovan"));
	}

	public static int add(int a,int b){
		
		int c = a+b;
		
		return c;
		
		
	}

public static double add(double a,double b){
		
		double c = a+b;
		
		return c;

}

public static String add(String a,String b){
	
	String c = a+b;
	
	return c;

}
}

