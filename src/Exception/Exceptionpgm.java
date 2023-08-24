package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionpgm {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream f=new FileInputStream("E://Book1.xlsx");
		/*try
		{
			int a=5,b=0;
			double c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Arithmetic Exception");
		}
		System.out.println("Hello");
	}*/
	
	int[] a=new int[3];
	a[0]=1;
	a[1]=2;
	a[2]=6;
	try
	{
		System.out.println(a[3]);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
}