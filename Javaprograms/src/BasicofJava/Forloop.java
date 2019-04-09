package BasicofJava;

public class Forloop {

	public static void main(StringConcept[] args) {
		
		int[] array = {10,20,30,40};
		
		for(int i=0;i<array.length;i++){
			
			System.out.println(array[i]);
			
			
		}
		
		System.out.println("***********************");
		for(int elemnet : array){
			
			System.out.println(elemnet);
		}
	}

}
