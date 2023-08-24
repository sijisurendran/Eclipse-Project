package Polymorphism;

public class Methodoverloadingpgm {

	public static void main(String[] args) {
	
		Methodoverloadingpgm ob=new Methodoverloadingpgm();
		//method without parameters
		ob.add();
		
		//1.method name same,parameter with same data type
		ob.add(25,2);
		
		//2.same method name ,parameters with different datatype
		ob.add(2,2.5);
		
		//3.same method name,parameters with changing order of datatype
		ob.add(3.5,2);

	}
// method without parameters
		public void add()
		{
			int a=10,b=20;
			int c=a+b;
			System.out.println("Value="+c);
		}
//1.method name same,parameter with same data type
		public void add(int a,int b)
		{
			int c=a+b;
			System.out.println("Value="+c);
		}
//2.same method name ,parameters with different datatype
		public void add(int a,double b)
		{
			double c=a+b;
			System.out.println("Value="+c);
			
		}
//3.same method name,parameters with changing order of datatype
		public void add(double b,int a)
		{
			double c=a+b;
			System.out.println("Value="+c);
		}
}
