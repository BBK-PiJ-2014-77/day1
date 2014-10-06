import java.util.Scanner;
public class ex8
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//ask for first number and say end with -1
//if -1 say please add at least 1 positive number
//ask for another
//if -1 break else if n > heighest number then  heighest number is n

String inputnumber="";
int n1=0, h=0;

 System.out.println ("please give first number");
 inputnumber = System.console().readLine(); 
 h = Integer.parseInt(inputnumber);
 while (n1 != -1 && h != -1) {
 	System.out.println ("and another");
	inputnumber = System.console().readLine();
	n1 = Integer.parseInt(inputnumber);
	if (n1 > h) {
	h = n1;
	}
}
System.out.println ("The heighest number was " + h);
	
 
 
}}

