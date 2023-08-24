package method;

public class Methodpgm {

	public static void main(String[] args) {
		System.out.println("Method Program");
		Methodpgm ob=new Methodpgm();
		int ans=ob.add();
		System.out.println("Addition is:"+ans);
		ob.sub(10,5);
		int res=ob.mul(30,20);
		System.out.println("Multiplication is:"+res);
		ob.div();
		
		
	}
	
	//Method with return type and without parameter
	public int add()
	{
		int a=30,b=20;
		int c=a+b;
		return c;
	}
	
	//Method without return type and with parameters
	public void sub(int a,int b)
	{
		int c=a-b;
		System.out.println("Subtraction is:"+c);
	}
	
	//Method with return type and with parameter
	public int mul(int a,int b)
	{
		int c=a*b;
		return c;
	}
	
	//Method without return type and without parameter
	public void div()
	{
		double d1=35,d2=6;
		double divans=d1/d2;
		System.out.println("Division is:"+divans);
	}
}
