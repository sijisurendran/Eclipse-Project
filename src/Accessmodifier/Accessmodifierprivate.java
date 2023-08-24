package Accessmodifier;

class A
{
	private int data=40;
	private void message()
	{
		System.out.println("Hello World");
	}
}
public class Accessmodifierprivate {

	public static void main(String[] args) {
		A ob=new A();
		System.out.println(ob.data);//Compile time error
		ob.message();//compile time error
	}

}
