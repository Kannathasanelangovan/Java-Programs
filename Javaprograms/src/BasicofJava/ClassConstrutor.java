package BasicofJava;

public class ClassConstrutor {
	
	int length;
	int bredth;
	int height;
	
	public static void main(String args[]){
		
		ClassConstrutor cc = new ClassConstrutor();
		
		System.out.println(cc.getCubeVolume());
		
		ClassConstrutor ccc = new ClassConstrutor(1,1,1);

		System.out.println(ccc.getCubeVolume());

	}
	
	public int getCubeVolume(){
		
		return(length*bredth*height);
				
	}

	ClassConstrutor(){
		
		length = 10;
		bredth = 2;
		height = 10;
		
		System.out.println("We are in constructor");
	}
	
    ClassConstrutor(int l,int b,int h){
		
		length = l;
		bredth = b;
		height = h;
		
		System.out.println("We are in constructor");
	}
}
