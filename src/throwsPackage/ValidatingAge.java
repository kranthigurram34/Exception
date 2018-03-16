
package throwsPackage;

import java.util.Scanner;



public class ValidatingAge {
	public static void main(String args[]){
		System.out.println("Enter your Age :");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
			try{
			if(age<18){
				throw new DrivinglicenseException("Age should be above 18 years");
			}else if(age>60){throw new DrivinglicenseException("Your age is exceeded");}
			else{
				System.out.println("You are Eligible for Driving License");
				System.out.println("You are Successfully Registered for Driving License");
			}}
			
			catch(DrivinglicenseException e){System.out.println(e.getMessage());
			e.printStackTrace();
			
		}

	}

}


