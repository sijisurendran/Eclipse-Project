package Interface;

import java.util.Scanner;

interface bankdetails
{
	public void accountdetails();
	public void deposit();
	public void withdraw();
	public void balance();

}
class Sbibank implements bankdetails
{
	static String bankname="Sbi";
	int acnumber;
	int balance=15000;
	String name;
	Scanner sc=new Scanner(System.in);

	@Override
	public void accountdetails() 
	{
	
		System.out.println("Enter the account number:");
		acnumber=sc.nextInt();
		System.out.println("Bank name:"+bankname);
		System.out.println("Account Number:"+acnumber);
		System.out.println("Enter name of account holder:");
		name=sc.next();
		System.out.println("Name:"+name);
	}

	@Override
	public void deposit() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to be deposited:");
		int damount=sc.nextInt();
		balance=balance+damount;
		System.out.println("Balance amount:"+balance);
	}

	@Override
	public void withdraw() 
	{
		
		System.out.println("Enter the amount to be withdrawn:");
		int wamount=sc.nextInt();	
		if(wamount!=0)
		{
		balance=balance-wamount;
		System.out.println("Balance amount:"+balance);
		}
		else
		{
			System.out.println("Your account balance is zero");
		}
	}

	@Override
	public void balance() 
	{

		System.out.println("Balance:"+balance);
	}

	

	
}
public class Sbibankapplication {


	public static void main(String[] args) {
		
		Sbibank ob=new Sbibank();
		ob.accountdetails();
		ob.deposit();
		ob.withdraw();
		ob.balance();
	
	}

}
