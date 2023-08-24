package firstpackage;

public class nestedforlooppattern {

	public static void main(String[] args) {
	
		System.out.println("Pattern Printing 1");
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
		
	
		System.out.println("Pattern Printing 2");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
		
		System.out.println("Printing 3");
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("Printing 4");
		int k=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
	}

}
