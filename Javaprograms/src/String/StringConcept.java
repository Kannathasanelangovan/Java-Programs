package String;

public class StringConcept {

	//https://www.youtube.com/watch?v=xldyBBdpknM
	
	//https://www.youtube.com/watch?v=P5tFJ9umhvk - Best
	
	public static void main(String[] args) {

		
		String s1 = new String("Kannathasan Elangoavan");
		String s2 = new String("Kannathasan Elangoavan");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3 = "geeks";
		String s4 = "GEEKS";
		
		System.out.println(s3.equalsIgnoreCase(s4));
				
		
        System.out.println("*********************************************");

		StringBuffer sb1 = new StringBuffer("Kanna");
		StringBuffer sb2 = new StringBuffer("Kanna");
		
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));

		
		
	}

}
