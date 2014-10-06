import java.util.Scanner;
public class ex7
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
String sn1="", sn2="", sn3="";
int n1=0, n2=0, n3=0, i=0;
boolean stop=false, a=false, b=false, c=false;
System.out.println ("first number");
sn1 = System.console().readLine();
n1  = Integer.parseInt(sn1);
System.out.println ("second number");
sn2 = System.console().readLine();
n2  = Integer.parseInt(sn2);
System.out.println ("third number");
sn3 = System.console().readLine();
n3  = Integer.parseInt(sn3);
while (stop == false) {
	if (i == n1)  {
	System.out.println (n1); 
	a = true;
	}
	if (i == n2) {
	System.out.println (n2);
	b = true;
	}
	if (i == n3) {
	System.out.println (n3);
	c = true;
	}
	if (a&b&c == true) {
	stop = true;
	}
i++;
}

}}

