import java.util.Scanner;
public class ex6
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//input first number

//input second number

//loop while second less than first i = i + second also step a second counter

//second counter is answer plus remainder = first - second

String first="", second="";
int n1=0, n2=0, i=0, j=-1, r=0, a=0;

 System.out.println ("first number");
 first = System.console().readLine(); 
 n1 = Integer.parseInt(first);
 System.out.println ("second number");
 second = System.console().readLine(); 
 n2 = Integer.parseInt(second);
 
 while ( n1 >= i ) {
 	i = i + n2;
	j++;
}
i = i - n2;
r = n1 - i;
System.out.println ("answer is " + j + " remainder " + r);


  
}}

