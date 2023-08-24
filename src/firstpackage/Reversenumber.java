package firstpackage;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		System.out.println("Reverse a number");
		Scanner sc=new Scanner(System.in);
		int rem,rev=0,temp=a;
		
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		while(a!=0)
		{
			rem=a%10;
			rev=(rev*10)+rem;
			a=a/10;
		
				
		}
		
		System.out.println("Reverse of the number is:" +rev);
		if(temp==rev)
		{
			System.out.println("Number is palindrome");
			
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
	}

}
