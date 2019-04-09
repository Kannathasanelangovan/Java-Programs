package BasicofJava;

import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {

		
		ArrayList<String> al = new ArrayList<String>();
		al.add("JAVA");
		
		for(String str: al){
			
			System.out.println(str);
		}
		
		
		
	}

}
