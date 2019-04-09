package patterns;


/*
1 2 3 4 5 6 7 
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1  
 */


import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {

		int i,j,row;
		
         Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of row");

		 row = sc.nextInt();
		
		 for(i=row;i>=1;i--){
			 
			 for(j=1;j<=i;j++){
				 
				 System.out.print(j+" ");
			
			 }
		 
		 System.out.println();
		 }
		 
			 
		 
		 
	}

}
