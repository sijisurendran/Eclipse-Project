package Interface;

interface cardetails
{
	public void speedlimit();
	public void acceleration();
}

interface carmodifications
{
	public void modify();
}

class Bmw implements cardetails,carmodifications
{

	@Override
	public void speedlimit() {
		System.out.println("Speed limit of BMW");
		
	}

	@Override
	public void acceleration() {
		System.out.println("BMW acceleration");
		
	}

	@Override
	public void modify() {
		System.out.println("BMW modifications");
		
	}
	
}

public class Interfacepgm {

	public static void main(String[] args) {
		
		Bmw ob =new Bmw();
		ob.speedlimit();
		ob.acceleration();
		ob.modify();

	}

}
