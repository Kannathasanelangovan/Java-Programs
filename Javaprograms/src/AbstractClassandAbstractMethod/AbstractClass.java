package AbstractClassandAbstractMethod;

 abstract class Car {
	
     public abstract void move();
     
	 }
 
	 class Bmw extends Car
	 {
	     @Override
	     public void move() 
	     {
	         System.out.println("Move method of BMW");
	     }

	 }
	 
	 class Audi extends Car
	 {
	     @Override
	     public void move() 
	     {
	         System.out.println("Move method of Audi");
	     }

	 }
	 
	 public class AbstractClass 
	 {
	     public static void main(String args[])
	     {
	         Car c = new Bmw();
	         c.move();
	     }
	 }