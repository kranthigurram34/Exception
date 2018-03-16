package exceptionHandling;

public class HandlingChildThrow extends ExceptionOverridingThrow {
	
	public void msg(){
	
	
		/*	throw new Exception("exception at child");(unchecked exception) 
		                                                         (Exception is a super class of Arithmetic Exception)*/
		System.out.println("Msg is delivered ");
		throw new NullPointerException("");
	}
	
	public static void main(String args[]){
		
		HandlingChildThrow c=new HandlingChildThrow();
		c.msg();
	
	}
	}
