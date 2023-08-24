package firstpackage;

public class Stringfunctions {

	public static void main(String[] args) {
		System.out.println("String Functions");
		String s1="Welcome";
		String s2="Kerala";
		String s3="welcome";
		String s4="Hai Welcome";
		String s5="welcome all";
		//1.concat()
		System.out.println(s1.concat(s2));
		System.out.println(1+2+s1+5+2);
		
		//2..equals()
		System.out.println(s1.equals(s2));
		//System.out.println(s1.equalsIngnoreCase(s3));
		
		//3.tolowercase and touppercase
		System.out.println(s3.toLowerCase());
		System.out.println(s5.toUpperCase());
		
		//4.trim()
		System.out.println(s1);
		System.out.println(s1.trim());
		
		//5.contains
		System.out.println(s4.contains("welcome"));
		
		//6.length
		System.out.println(s1.length());
		
		//7.substring()
		System.out.println(s1.substring(1,3));
		
		//8.startswith and endswith
		System.out.println(s4.startsWith("Hello"));
		System.out.println(s5.endsWith("All"));
		//9.charAt()
		System.out.println(s1.charAt(1));
		
		//10.replace
		System.out.println(s4.replace("Hai", "hello"));
		
		//11.split
		String s6="Hello welcome to kerala";
		String [] str=s6.split(" ");
		for(String value:str)
		{
			System.out.println(value);
		}
			
		
		
		
	}

}
