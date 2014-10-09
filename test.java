import java.util.Scanner;
public class test
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
int cv = 1;
String cardnumber = "";
System.out.println ("please give value of card number ");
cardnumber =  System.console().readLine(); 
	if ( cardnumber == "j" ) {
		cardnumber = "11";
		}
		
cv = Integer.parseInt(cardnumber); 

System.out.println (cv);
}}

