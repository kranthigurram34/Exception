package throwpackage;

import java.util.Scanner;

public class Binarypractice {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7,8,9};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any key Value :");
		int k=sc.nextInt();
		int low=0;
		int high=arr.length-1;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
		
		if(arr[mid]<k) {low=mid+1;}
		if(arr[mid]>k) {high=mid-1;}
		else {System.out.println("The key Found :" +k);
		break;}
		if(low>high) {System.out.println("The Key Not Found :"+k );}
	
	}
		
	}
}
