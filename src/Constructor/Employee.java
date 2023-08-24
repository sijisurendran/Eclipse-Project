package Constructor;

public class Employee {
	String empname;
	String empdesignation;
	int empid;
	
	//Parameterised constructor
	public Employee(String empname,String empdesignation,int empid)
	{
		this.empname=empname;
		this.empdesignation=empdesignation;
		this.empid=empid;
	}
	
	public void display()
	{
		System.out.println("Empname="+empname);
		System.out.println("Empid="+empid);
		System.out.println("Empdesignation="+empdesignation);
	}
	public static void main(String[] args) {
		Employee ob=new Employee("Ardra","Developer",101);
		/*System.out.println(ob.empname);
		System.out.println(ob.empdesignation);
		System.out.println(ob.empid);
		*/
		ob.display();
		
	}

}
