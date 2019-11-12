package AbstractClassandAbstractMethod;

//https://www.youtube.com/watch?v=jmxOsCGV120


public class Student extends Abstract{
	
	int mark;
	String gender;
	
	Student(int mark,String gender,int rollnumber,String name){
		
		super(rollnumber,name);
		this.mark=mark;
		this.gender=gender;
		
		
		
	}
	
	public static void main(String[] args) {
		
		Student st = new Student(100,"Male",31,"Kannathasan");
		System.out.println(st.gender + " " + st.mark + " " +st.rollnumber + " " + st.name);
		
		Student st1 = new Student(90,"Female",30,"ANU");
		System.out.println(st1.gender + " " + st1.mark + " " +st1.rollnumber + " " + st1.name);

		
	}

}
