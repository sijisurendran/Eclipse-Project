package firstpackage;

import java.util.Scanner;

public class Stringarray {

	public static void main(String[] args) {
		String [] str=new String[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter names:");
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.nextLine();
		}
		System.out.println("Entered Strings are...");
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}

	}

}
