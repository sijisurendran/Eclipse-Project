package Javaprograms;

import java.util.Scanner;

public class Largestelement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a []=new int[5];
		int max=a[0];
		System.out.println("Enter the elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for (int i=1;i<a.length;i++)
		{
			if (a[i]>max)
                max = a[i];
		}
          System.out.println("Largest of the array is:"+max); 
	}

}
