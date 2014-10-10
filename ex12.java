import java.util.Scanner;
public class ex12
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//ask how big pyramid
//loop print number with print unless number equals I when should println
int n1 = 0, i = 1, j = 1;
String inputnumber = "";
System.out.println ("What size pyramid?");
 inputnumber = System.console().readLine(); 
 n1 = Integer.parseInt(inputnumber);
 
while (i <= n1) {
	if ( j == i ) {
		System.out.println ( i );
		j = 1;
		i++;
	}
	else { 
		System.out.print ( i );
		j++;
	}
}
	   
}}

