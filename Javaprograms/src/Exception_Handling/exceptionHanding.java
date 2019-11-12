package Exception_Handling;

public class exceptionHanding {

	public static void main(String[] args) {

		System.out.println("This statement will be executed");
		
		try{
	        Integer I = new Integer("abc");  //This statement throws NumberFormatException

		}catch(Exception e)
		
		{
            System.out.println("exception caught");
            e.printStackTrace();
		}
		 
 
        System.out.println("This statement will not be executed");
	}

}
