package BasicofJava;

public class MethodParameterPassing {

	public static void main(String[] args) {
		
		empname("Kannathasan",25);
		empname("Anu",25);
		int basicsalary = empsalary(100);
		int marchsalary = basicsalary *10;
		System.out.println(marchsalary);
		
	}

	public static void  empname(String name,int age){
			
		System.out.println("Hello "+ name);
		System.out.println("your age is " + age);
		
	}

	public static int empsalary(int basic)
	{
		
		return basic;
	}

}

