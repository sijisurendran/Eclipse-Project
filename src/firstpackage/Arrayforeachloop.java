package firstpackage;

import java.util.Scanner;

public class Arrayforeachloop {

	public static void main(String[] args) {
		System.out.println("Single dimensional array");
		Scanner sc=new Scanner(System.in);
		int [] a=new int[4];
				System.out.println("Enter the elements:");
				for(int i=0;i<4;i++)
				{
					a[i]=sc.nextInt();
				}
				System.out.println("Entered elements are...");
				for(int v: a)
				{
					System.out.println(v);
				}
				
				System.out.println("Multi dimensional array");
				int [][] b=new int[3][2];
				System.out.println("Enter the elements:");
				for(int j=0;j<3;j++)
				{
					for(int k=0;k<2;k++)
					{
						b[j][k]=sc.nextInt();
					}
				}
				System.out.println("Entered elements are...");
				for(int[] r: b)
				{
					for(int res: r)
					{
						System.out.print(res+" ");
					}
					System.out.println();
				}
	}

}
