package method;

import java.util.Scanner;

public class Countofevenodd {

	public static void main(String[] args) {
		Countofevenodd ob=new Countofevenodd();
		ob.countElements();
	}
	public void countElements()
	{
		int a []= new int[5];
		int ocount=0;
		int ecount=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the elements:");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]%2==0)
			{
				ecount++;
			}
			else
			{
				ocount++;
			}
		}
		System.out.println("No of even elements="+ecount+" "+ "No of odd elements="+ocount);
	}
	

}
