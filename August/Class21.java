
// WJP to print numbers between 1 to 200 which are divisible by 5, 7 and by both.


package MyPackage;

public class Class21 {                                  // class create
	static Number Calculate(int number) {               // static method 
                                                        // for loops 
    	   for(int i=1; i <number + 1; i ++) {
    		   if ( i % 5 == 0 || i %7 ==0)             // if statement 
    			   System.out.println(i);               // call i 
    	   }
    	   return number;
       }
	public static void main(String[] args) {           // main method 
		Calculate(200);

	}

}
