package firstpackage;

import java.util.Scanner;

public class Stringpalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.next();
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println("Reverse of the string is:"+reverse);
		if(str.equals(reverse))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		

	}

}
