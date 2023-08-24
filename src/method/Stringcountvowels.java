package method;

import java.util.Scanner;

public class Stringcountvowels {

	public static void main(String[] args) {
		System.out.println("Enter a string:");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Stringcountvowels ob=new Stringcountvowels();
		ob.vowelCount(s);
	}
	public void vowelCount(String s)
	{
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				c++;
			}
		}
		System.out.println("Vowels in string is:"+c);
	}
	

}
