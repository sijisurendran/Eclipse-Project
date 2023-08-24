package method;

public class Halfstring {

	public static void main(String[] args) {
		Halfstring ob=new Halfstring();
		ob.halfString();

	}
	public void halfString()
	{
		String s="London";
		System.out.println(s.substring(0,s.length()/2));
	}
}
