package BasicofJava;

public class Array {

	public static void main(StringConcept[] args) {

		int[] myarray = {1,2,3,4,5,6}; //Prefered way of declaring array
		
		/*
		int myarray2[] = {1,2,3,4,5};
		int[] myarray3 = new int[3];
		int[] myarray4 = new int[]{1,2,3};
		
		*/
		
		int index=0;
		while(index < myarray.length){
			
			System.out.println(myarray[index]);
			index++;
			
		}
		
		
	}

}
