package Interface;

import java.util.Scanner;

interface resume
{
	public void read();
	public void display();
	
}
class PersonResume implements resume
{
		String name;
		String address;
		int phoneno;
		String email;
		String qualification;
		Scanner sc=new Scanner(System.in);
	@Override
	public void read() {
		
		
		System.out.println("Enter the name:");
		name=sc.next();
		System.out.println("Enter address");
		address=sc.next();
		System.out.println("Enter phoneno");
		phoneno=sc.nextInt();
		System.out.println("Enter email");
		email=sc.next();
		System.out.println("Enter qualification");
		qualification=sc.next();
		
		
	}

	@Override
	public void display() {
		System.out.println("***RESUME***");
		System.out.println("Name:" +name);
		System.out.println("Address:"+address);
		System.out.println("Phone Number:"+phoneno);
		System.out.println("Email:"+email);
		System.out.println("Qualification:"+qualification);
		
	}
	
}
public class resumeclass {
	public static void main(String[] args)
	{
		PersonResume ob=new PersonResume();
		ob.read();
		ob.display();
	}
}
