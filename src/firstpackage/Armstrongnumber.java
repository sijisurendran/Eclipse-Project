package firstpackage;

import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double s=0,r;
		int temp=n;
		while(n>0)
		{
			r=n%10;
			s=s+r*r*r;
			n=n/10;
			
		}
		if(temp==s)
		{
			System.out.println("Armstrong");
			
		}
		else
		{
			System.out.println("Not armstrong");
		}

	}

}
