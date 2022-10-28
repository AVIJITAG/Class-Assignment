package MyPackage;

class Shape2{                                                       //constructor of parent class
	public Shape2() {
		System.out.println("HELLO");}
	 }

class Size2 extends Shape2{                                        //child class 
	Size2 ()                                                       // constructor of the child class
	{
		super(); 
		System.out.println("HI");}
    }

	  public class Supercons                                       // main class
	{
       public static void main(String args[]) {                    // main method 
 
	 new Size2();}
	 
}
