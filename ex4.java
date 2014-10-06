import java.util.Scanner;
public class ex4
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//ask for number

//do a loop for values of I from 2 to number-1 and calculate modulo

//if modulo is 0 break and say not prime

//if go to number-1 print number prime

String number="";
int n=0, i=2;
System.out.println ("give me a number");
number = System.console().readLine();
n = Integer.parseInt(number);

while ( i < n ) {
	if (n % i != 0) {
	i++;
	if ( i == n ) {
		System.out.println ("This is a prime number");
	}
	}
	else {
	System.out.println  ("number not prime"); 
	i=n;
	}
}
}}

