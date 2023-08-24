package Oops;

class A
{
	public void details()
	{
		System.out.println("Details of employee");
	}
}

class B extends A
{
	public void salary()
	{
		System.out.println("Salary details");
	}
}

public class Singlelevelinheritance {

	public static void main(String[] args) {
		B ob=new B();
		ob.details();
		ob.salary();

	}

}
