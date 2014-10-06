import java.util.Scanner;
public class ex9
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//ask for first number and say end with -1
//if -1 say please add at least 1 positive number
//ask for another
//have a flag that goes to false if new number not equal to i + 1
//report flag status

String inputnumber="";
int n1=1, n2=0, i=0;
boolean flag = true; 
 System.out.println ("please give positive number -1 to end");
 inputnumber = System.console().readLine(); 
 n1 = Integer.parseInt(inputnumber);
 i = n1; 
 if (n1 <= -1) {
 	flag = false;
	System.out.println ("This isn't positive"); 
	} 
 while (n1 != -1 && n1 > 0 ) {
 	System.out.println ("and another");
	inputnumber = System.console().readLine();
	n1 = Integer.parseInt(inputnumber);
	if (n1 != i + 1 && n1 != -1) {
		flag = false;
	}
i = n1;
	
}
System.out.println ("It is " + flag + " that this is a sequence" );
}}

