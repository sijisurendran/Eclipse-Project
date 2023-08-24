package firstpackage;

import java.util.Scanner;

public class singledimensionalintarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a=new int[4];
		int sum=0;
		float avg;
		System.out.println("Enter numbers:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		
		avg=sum/4;
		/*System.out.println("Array is");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		*/
		System.out.println("Sum of array numbers is:"+sum);
		System.out.println("Average of numbers is:"+avg);
	}

}
