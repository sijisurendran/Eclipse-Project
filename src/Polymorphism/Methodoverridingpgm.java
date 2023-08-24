package Polymorphism;

class Parent
{
	public void phone()
	{
		System.out.println("Samsung");	
	}
	public void job()
	{
		System.out.println("Teacher");
	}
}
class Child extends Parent
{

	@Override
	public void phone() 
	{
		System.out.println("iphone");
		super.phone();
	}

	@Override
	public void job() {
		System.out.println("Engineer");
		super.job();
	}
	
}
public class Methodoverridingpgm {

	public static void main(String[] args) {
		Child c=new Child();
		c.job();
		c.phone();

	}

}
