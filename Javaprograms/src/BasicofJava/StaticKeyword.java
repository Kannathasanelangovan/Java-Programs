package BasicofJava;

public class StaticKeyword {

	public static void main(String[] args) {
		
		StaticKeyword sk = new StaticKeyword();
		
		System.out.println(StaticKeyword.DoSomething("How are you"));
		
		System.out.println(sk.DoSomethingelse("Hi"));
	
	}

	
	public static String DoSomething(String message){
		
		return message;
	}
	
	public String DoSomethingelse(String message){
		
		return message;
}
}