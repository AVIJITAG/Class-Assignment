package MyPackage;
class Shape1{//parent class 
	void print() {//parent class method
		System.out.println("print circle");
	}
}

class Size1 extends Shape1{                                   //child class
	void print()  {                                           // SAME METHOD OF PARENT CLASS (CHILD CLASS METHOD)
         System.out.println( "PRINT TRIANGLE" );
	}
	 void display() {                                        // NEW METHOD OF CHILD CLASSS
		  System.out.println("PRINT NOTHING");
	 }
	  void show() {                                         // FINAL METHOD
		   super.print();
		   display();
	  }
		  
	  }
	

public class Supermethod {                                   // main class
	 
	public static void main(String ...args) {                 // main method 
		Size1 obj = new Size1();                              // object created 
		obj.show();
	} 

}
