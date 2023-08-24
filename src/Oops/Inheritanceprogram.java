package Oops;

class Member
{
	String name;
	String address;
	int age;
	int salary;

	long phoneno;
	public void printdetails()
	{
		System.out.println("Name="+name);
		System.out.println("Address="+address);
		System.out.println("Age="+age);
		System.out.println("Salary="+salary);
		System.out.println("Phoneno="+phoneno);
	}
}

class Employee extends Member
{
	String specialization;
}

class Manager extends Member
{
	String department;
}
public class Inheritanceprogram {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.name="Amna";
		e1.address="Rose Villa";
		e1.age=30;
		e1.salary=35000;
		e1.phoneno=8542175626L;
		e1.printdetails();
		System.out.println(e1.specialization="Testing");
				
		Manager m1=new Manager();
		m1.name="Reha";
		m1.address="Grace Villa";
		m1.age=28;
		m1.salary=29000;
		m1.phoneno=9645721542L;
		m1.printdetails();
		System.out.println(m1.department="Development");
	}

}
