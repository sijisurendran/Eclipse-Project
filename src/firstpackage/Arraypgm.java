package firstpackage;

import java.util.Scanner;

public class Arraypgm {

	public static void main(String[] args) {
		System.out.println("Simple Array Program");
		
		int [] a=new int[3];
		//a[0]=23;
		//a[1]=32;
		//a[2]=54;
		//System.out.println(a[1]);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Entered Numbers Are...");
		for(int i=0;i<3;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
