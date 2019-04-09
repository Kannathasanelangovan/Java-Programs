package patterns;

import java.util.Scanner;

/*

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
 * 
 */

public class Pattern1 {

	public static void main(String[] args) {
		
        int i,j,row;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of row");

		 row = sc.nextInt();
		 
	
		for(i=1;i<=row;i++){
			
			for(j=1;j<=i;j++){
				
				System.out.print(j+"");
			}
			
            System.out.println();
		}

	}
	
	}
