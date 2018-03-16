package throwsPackage;

import java.util.Scanner;

public class MoneyWithdraw {
	public static void main(String[] args) {
	System.out.println("Enter Amount :");
Scanner sc=new Scanner(System.in);
int money=sc.nextInt();
		try{
		
			if(money>10000){throw new ArithmeticException("You are Exceeded Daily Limit");}
			else {System.out.println("Your amount Successfully Withdrawn");}}
		catch(ArithmeticException e){System.out.println(e.getMessage());
		e.printStackTrace();}
}

}
