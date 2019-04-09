package BasicofJava;

import java.util.Scanner;

public class GettingUserInput {

	public static void main(StringConcept[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int user_input_number= scan.nextInt();
		System.out.println("The entered value is "+user_input_number);
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the double number");
		double user_input_double = scan1.nextDouble();
		System.out.println("The entered value is "+user_input_double);
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter the String");
		String user_input_string = scan2.nextLine();
		System.out.println("The entered String is "+user_input_string);

	}

}
