package Interface;

class Monkey
{
	public void jump()
	{
		System.out.println("Jumping");
	}
	public void eat()
	{
		System.out.println("Eating");
	}
}

class Human extends Monkey implements basicanimal
{
	public void speak()
	{
		System.out.println("Speaking");
	}

	@Override
	public void sleep() {
		System.out.println("Sleeping");
		
	}
}

interface basicanimal
{
	public void eat();
	public void sleep();
}
public class Interfaceprogramqstn {

	public static void main(String[] args) {
		
		Human ob=new Human();
		ob.eat();
		ob.jump();
		ob.sleep();
		ob.speak();
	}

}
