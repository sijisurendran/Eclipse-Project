package firstpackage;

import java.util.Scanner;

public class Scannerpgm {

	public static void main(String[] args) {
	
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Value=" +a);
		
		//Addition of two numbers
		
		System.out.println("Enter first number:");
		int a1=sc.nextInt();
		System.out.println("Enter second number:");
		int b1=sc.nextInt();
		int c;
		c=a1+b1;
		System.out.println("Sum of two numbers is:" +c);

	}

}
