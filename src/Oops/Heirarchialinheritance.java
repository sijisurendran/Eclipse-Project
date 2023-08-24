package Oops;

class Animal1
{
	public void animalfood()
	{
		System.out.println("Animal food");
	}
}
class Tiger extends Animal1
{
	public void tigerdetails()
	{
		System.out.println("Tiger details");
	}
}
class Elephant extends Animal1
{
	public void elephantdetails()
	{
		System.out.println("Elephant details");
	}
}
public class Heirarchialinheritance {

	public static void main(String[] args) {
		Tiger t=new Tiger();
		t.animalfood();
		t.tigerdetails();
		Elephant e=new Elephant();
		e.animalfood();
		e.elephantdetails();

	}

}
