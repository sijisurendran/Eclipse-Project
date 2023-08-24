package Javaprograms;

class Vehicle
{
	public void drive()
	{
		System.out.println("Repairing a car");
	}
}
class Car extends Vehicle
{

	@Override
	public void drive() {
		
		super.drive();
	}
	
}
public class Methodpgmdrive {

	public static void main(String[] args) {
		
		Car c=new Car();
		c.drive();
	}

}
