package firstpackage;

public class switchcalculator {

	public static void main(String[] args) {
	
		int a=5,b=3;
		char c='*';
		switch(c) {
		case '+':System.out.println(a+b);
			break;
		case '-':System.out.println(a-b);
			break;
		case '*':System.out.println(a*b);
			break;
		case '/':System.out.println(a/b);
			break;
		default:System.out.println("Invalid Choice");
		}

	}

}
