package BasicofJava;

public class ClassConceptexample {

	public static void main(String[] args) {
		
		ClassesandObjects emp = new ClassesandObjects(); //Instance - emp
		
	/*	emp.age = 25;
		emp.empid = 11;
		emp.name = "Kannathasan";*/
		
		emp.setAge(25);
		emp.setEmpid(11);
		emp.setName("Kannathasan E");
		
		/* System.out.println("The age of emp " + emp.age);
		   System.out.println("The id of emp " + emp.empid);
		   System.out.println("The name of emp " + emp.name); */
		
		System.out.println("The age of emp " + emp.getAge());
		System.out.println("The id of emp " + emp.getEmpid());
		System.out.println("The name of emp " + emp.getName());

       ClassesandObjects emp1 = new ClassesandObjects(); //Instance - emp
		
		/*emp1.age = 25;
		emp1.empid = 12;
		emp1.name = "Kannathasan Elangovan";*/
       
        emp1.setAge(25);
		emp1.setEmpid(12);
		emp1.setName("Kannathasan Elangovan");
		
		System.out.println("The age of emp " + emp1.age);
		System.out.println("The id of emp " + emp1.empid);
		System.out.println("The name of emp " + emp1.name);
	}

}
