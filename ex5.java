import java.util.Scanner;
public class ex5
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//ask for number

//ask for second number

//loop through adding first number together for number of time = to second 

String number="", times="", answer="";
int n=0, t=0, i=1, a=0;
 System.out.println ("first number");
 number = System.console().readLine(); 
 n = Integer.parseInt(number);
 System.out.println ("second number");
 times = System.console().readLine(); 
 t = Integer.parseInt(times);
 
 while ( i <= t ) {
 	a = a + n;
	if (i == t) {
	System.out.println ("product is "+ a);
	
	}
	i++;
}
 

}}

