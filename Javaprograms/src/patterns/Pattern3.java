package patterns;

import java.util.Scanner;


/*
1
23
456
78910
 */


public class Pattern3 {

	public static void main(String[] args) {

		int i,j;    
		 
		 int no=1;
		 for (i =0; i<=3; i++)
		 {

		 for (j =0; j <=i; j++)
		 {
		 System.out.print(no);
		 no++;
		 }
		 System.out.println();
		 }
		 }
		 
}
