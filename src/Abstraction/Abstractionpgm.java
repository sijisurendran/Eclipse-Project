package Abstraction;
abstract class Car
{
	abstract public void speedlimit();
	public void acceleration()
	{
		System.out.println("Acceleration");
	}
}
class Kia extends Car
{

	@Override
	public void speedlimit() {
		System.out.println("Kia Speed Limit");
		
	}
	
}
class Maruti extends Car
{

	@Override
	public void speedlimit() {
		
		System.out.println("Maruti Speed Limit");
	}
	
}
public class Abstractionpgm {

	public static void main(String[] args) {
		
		Maruti m1=new Maruti();
		m1.speedlimit();
		m1.acceleration();
		Kia k1=new Kia();
		k1.speedlimit();
		k1.acceleration();
	}

}
