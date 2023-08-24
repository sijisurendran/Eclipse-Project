package firstpackage;

import java.util.Scanner;

public class Scannercalculator {

	public static void main(String[] args) {
		System.out.println("Simple calculator");
		Scanner calc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int a = calc.nextInt();
		int b = calc.nextInt();
		System.out.println("Enter your choice: +,-,*,/");
		char c= calc.next().charAt(0);
		
		switch(c)
		{
		case '+':System.out.println("a+b=" +(a+b));
			break;
		case '-':System.out.println("a-b=" +(a-b));
			break;
		case '*':System.out.println("a*b " +(a*b));
			break;
		case '/':
				if((b==0))
				{
					System.out.println("Division by zero");
				}
				else
				{
				System.out.println("a/b=" +(a/b));
				}
			break;
		default :System.out.println("Invalid Choice");
		}
		
		

	}

}
