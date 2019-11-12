package ArrayConcept;

public class Array {

	//When we created the array with int the default value will be 0
	//When we created the array with boolen the default value will be fault
	//For user defind types the value will be null same for string
	//https://www.youtube.com/watch?v=zZb8zgPb-D8
	
	public static void main(String[] args) {
		
		int[] a = {20,30,40,50};
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
		System.out.println("*************************************");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("*************************************");

		for(int aa:a){
			
			System.out.println(aa);
		}


	}

}
