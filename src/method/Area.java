package method;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Area ob=new Area();
		float ans=ob.rectangle();
		System.out.println("Area of rectangle is:"+ans);
		ob.triangle(12,15);
		double res=ob.circle(2);
		System.out.println("Area of circle is:"+res);
		ob.square();

	}
	//Method with return type and without parameter
	public float rectangle()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length:");
		float l=sc.nextFloat();
		System.out.println("Enter breadth:");
		float b=sc.nextFloat();
		float c;
		c=l*b;
		return c;
	}
	//Method without return type and with parameter
	public void triangle(float b,float h)
	{
		double c=0.5*b*h;
		System.out.println("Area of triangle is:"+c);
	}
	//Method with return type and with parameter
	public double circle(double r)
	{ 
		double c=3.14*r*r;
		return c;
	}
	//Method without return type and without parameter
	public void square()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of square:");
		float a=sc.nextFloat();
		float ans=a*a;
		System.out.println("Area of square is:"+ans);
	}
}
