package Javaprograms;

import java.util.Scanner;

public class Stringcharactercount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("Total number of characters in a string"+ " " +count);
		

	}

}
