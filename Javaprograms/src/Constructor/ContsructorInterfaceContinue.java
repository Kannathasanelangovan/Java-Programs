package Constructor;

public class ContsructorInterfaceContinue implements ConstructorInterface{

	public static void main(String[] args) {
		
		
		ContsructorInterfaceContinue ci = new ContsructorInterfaceContinue();
		
		System.out.println(ci.add(1,5));

	}

	@Override
	public int add(int a, int b) {

		int c = a+b;
		
		return c;
	}

}
