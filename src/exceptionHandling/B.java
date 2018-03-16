package exceptionHandling;

public class B {
	
	public static void main(String args[])
	{
		String a="kranthi";
		System.out.println(a.length());
try{
	String e=null;
	System.out.println(e.length());
	int i=50/0;
	System.out.println(i);
	
}
catch(NullPointerException e){System.out.println(e.getMessage());} //Top Exception in Java
catch(ArithmeticException e){System.out.println(e.getMessage());}

System.out.println("after Exception");
}
}