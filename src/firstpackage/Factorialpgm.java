package firstpackage;

import java.util.Scanner;

public class Factorialpgm {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,f=1;
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial of the number is:" +f);

	}

}
