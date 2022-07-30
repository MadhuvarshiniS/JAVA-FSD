package ExceptionHandling;
public class Handling {
	public class JavaExceptionExample{  
}
	public static void main(String args[]){  
	   try{  
		   @SuppressWarnings("unused")
		int data=100/0;  
		   }
	   catch(ArithmeticException e){System.out.println(e);}  
	   System.out.println("rest of the code...");  
	  }  
	} 
