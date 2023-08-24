package firstpackage;

import java.util.Scanner;

public class Twodimensionalintarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*
		System.out.println("Two dimensional integer array");
		int[][] a=new int[3][2];
	
		System.out.println("Enter Numbers:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Entered numbers are..");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		*/
		System.out.println("Two dimensional string array");
	
		String [][] str=new String[3][2];
		System.out.println("Enter Strings");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				str[i][j]=sc.nextLine();
			}
		}
		System.out.println("The Array is...");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(str[i][j]+ " ");
			}
			System.out.println();
		}
		

	}

}
