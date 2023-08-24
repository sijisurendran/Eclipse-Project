package Oops;

class Animal
{
	public void animalfood()
	{
		System.out.println("Animal Food");
	}
}
class Dog extends Animal
{
	public void barking()
	{
		System.out.println("Dog");
	}
}
class BabyDog extends Dog
{
	public void babydogdetails()
	{
		System.out.println("Baby dog details");
	}
}

public class Multilevelinheritance {

	public static void main(String[] args) {
		
		BabyDog ob=new BabyDog();
		ob.animalfood();
		ob.barking();
		ob.babydogdetails();
	}

}
