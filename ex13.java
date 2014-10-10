import java.util.Scanner;
public class ex13
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//ask for number

//do a loop for values of I from 2 to number-1 and calculate modulo

//if modulo is 0 break and say not prime

//if go to number-1 print number prime

String number="";
int n=2, i=2, input = 0;
System.out.println ("give me a number above 2");
number = System.console().readLine();
input = Integer.parseInt(number);

while (n <= input) {

while ( i < n ) {
	if (n % i != 0) {
	i++;
	if ( i == n ) {
		System.out.println ("This is a prime number " + n);
	}
	}
	else { 
	i = n;
	}
}
i = 2;
n++;
}
}}

