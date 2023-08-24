package firstpackage;

import java.util.Scanner;

public class Sumofnaturalnumber {

	public static void main(String[] args) {
		System.out.println("Enter the limit:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,sum=0;
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of natural number is:"+sum);
	}

}
