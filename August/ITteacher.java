package MyPackage;
 class Teacher{                                             // class create 
	 String designation = "Teacher";                        // string declaration 
	 String collegename = "MIT";
	 void work() {                                          // void method
	 System.out.println("Teaching");                       // print statement 
	 }
 }
    class ITteacher extends Teacher {                         // main class extends sub class
          String mainSubject = "Mechanical Related Topic";
          
         public static void main(String args []) {              // main method 
        	 ITteacher obj = new ITteacher();                   // object created 
        	 System.out.println(obj.collegename);              // print statement 
        	 System.out.println(obj.designation);
        	 System.out.println(obj.mainSubject);
        	 obj.work();                                      // call object
         }
}
