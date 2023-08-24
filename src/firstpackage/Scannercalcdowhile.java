package firstpackage;

import java.util.Scanner;

public class Scannercalcdowhile {

	public static void main(String[] args) {
		System.out.println("Simple Calculator");
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		char opt;
		
		do
		{
			System.out.println("*Available Operations*");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("Enter the operations to perform:");
			opt=sc.next().charAt(0);
	
			switch(opt)
			{
			case '1':
					System.out.println("Enter two numbers:");
					a=sc.nextInt();
					b=sc.nextInt();
					c=a+b;
					System.out.println("a+b=" +c);
				break;
			case '2':
					System.out.println("Enter two numbers:");
					a=sc.nextInt();
					b=sc.nextInt();
					c=a-b;
					System.out.println("a-b=" +c);
				break;
			case '3': 
					System.out.println("Enter two numbers:");
					a=sc.nextInt();
					b=sc.nextInt();
					c=a/b;
					if(b==0)
					{
						System.out.println("Not divisible by zero");
					}
					else
					{
						System.out.println("a/b=" +c);
					}
				break;
			case '4':
					System.out.println("Enter two numbers:");
					a=sc.nextInt();
					b=sc.nextInt();
					c=a*b;
					System.out.println("a*b=" +c);
				break;
		
					
			default:System.out.println("Invalid Choice");
			}
			
			
		}while(opt!=5);
	}

}
