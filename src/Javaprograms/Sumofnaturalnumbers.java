package Javaprograms;

import java.util.Scanner;

public class Sumofnaturalnumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a []=new int[5];
		int sum=0;		
		System.out.println("Enter the elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Elements are...");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
		System.out.println("Sum of elements are.."+sum);
	}

}
