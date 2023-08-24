package Javaprograms;

import java.util.Scanner;

public class Averageofthree {

	public static void main(String[] args) {
	
		Averageofthree ob=new Averageofthree();
		ob.average();
		
	}
	public void average()
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		float avg;
		System.out.println("Enter first element:");
		a=sc.nextInt();
		System.out.println("Enter second element:");
		b=sc.nextInt();
		System.out.println("Enter third element:");
		c=sc.nextInt();
		avg=(a+b+c)/3;
		System.out.println("Average of numbers are:"+avg);
		
	}

}
