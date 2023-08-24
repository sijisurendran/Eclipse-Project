package method;

public class Oddcountpgm {

	public static void main(String[] args) {
		Oddcountpgm ob=new Oddcountpgm();
		ob.oddCount();
	}
	public void oddCount()
	{
		int count=0;
		for(int i=1;i<100;i++)
		{
			if(i%2!=0)
			{
				count++;
			}
		}
		System.out.println("Count of odd numbers:"+count);
	}
}
