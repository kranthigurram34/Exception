package throwpackage;

public class ThrowUncheckedexception {
	static void validate(int age)
	{
if(age<18)
	throw new ArithmeticException("you are not valid to vote"); 


else
	System.out.println("you are eligible for voting");
}
	public static void main(String args[]){
		validate(15);
		System.out.println("you are successfully voted");
}
}