package firstpackage;

public class Operators {

	public static void main(String[] args) {
	
		//Arithmetic Operators
		
		int a=20,b=40;
		System.out.println("Value of a+b :"+(a+b));
		System.out.println("Value of a-b :"+(a-b));
		System.out.println("Value of a*b :"+(a*b));
		System.out.println("Value of a/b :"+(a/b));
		System.out.println("Value of a%b :"+(a%b));
		
		//Assignment Operators
		System.out.println("Assignment Operators");
		System.out.println(a+=b);
		System.out.println(a-=b);
		System.out.println(a*=b);
		System.out.println(a/=b);
		System.out.println(a%=b);
		
		//Relational Operators(<,<=,>,>=,==,!==)
		int a1=40,b1=20;
		System.out.println("Results");
		System.out.println(a1<b1);
		System.out.println(a1<=b1);
		System.out.println(a1>b1);
		System.out.println(a1>=b1);
		System.out.println(a1==b1);
		System.out.println(a1!=b1);
		
		//Logical Operators(&&,||,!)
		
		//A		B		A&&B	A||B 	!A		!B
		//0		0		0		0		1		1
		//1		0		0		1		0		1
		//0		1		0		1		1		0
		//1		1		1		1		0		0
		System.out.println("Logical Operations....");
		String username="hai123";
		String pswd="1234";
		System.out.println((username=="hai123")&&(pswd=="1234"));
		System.out.println((username=="hai1234")&&(pswd=="12345"));
		System.out.println((username=="hai123")||(pswd=="123"));
		System.out.println(!(username=="hai123"));
		
		//Unary Operators(++,--)
		System.out.println("Unary Operations");
		int v=5;
		System.out.println(v++);
		System.out.println(v);
		System.out.println(++v);
		
		//Ternary Operations(?,:)
		System.out.println("Ternary Operations...");
		int v1=5,v2=3;
		int s=v1>v2?v1:v2;
		System.out.println(s);
		
		//Addition of two numbers
		System.out.println("Addition");
		int b1=5,b2=3,res;
		res=b1+b2;
		System.out.println("Sum is: "+res);

	}

}
