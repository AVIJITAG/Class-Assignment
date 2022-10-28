package MyPackage;
  class Shape{                         // class created 
	  String name = "circle";         //data member of parent class 
  }
   class Size extends Shape{         //child class
	 String name = "Traingle";       //data member of child class
	 void showname() {               //method
		 System.out.println(name);         //display the name of the size class
		 System.out.println(super.name);     //display the name of the shape class
		
	 }
   }


public class Javaclass14 {                       // main class
      public static void main(String args[]) {   // main method
    	  Size obj= new Size();                  // object created 
    	  obj.showname();                        // call object
      }

}
