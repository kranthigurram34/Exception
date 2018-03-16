package exceptionHandling;

public class Testexception {
	
		public static void main(String[] args) 
		{
		try{	int i=50/0;
		System.out.println(i);
		}
		catch(ArithmeticException e){System.out.println(e);}
		System.out.println("rest of the code...");  
		}}

	


