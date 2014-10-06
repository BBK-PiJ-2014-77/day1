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
int n1=0, n2=0, i=0; 
boolean flag = true, initialcheck = false, secondflag = false;

while ( initialcheck == false) { 
 System.out.println ("please give positive number -1 to end");
 inputnumber = System.console().readLine(); 
 n1 = Integer.parseInt(inputnumber); 
 	if (n1 == -1) {
 		System.out.println ("Are you sure you want to quit, type -1 to quit");
		String errorcheck = System.console().readLine();
		int echeck = Integer.parseInt(errorcheck);
		if (echeck == -1) { 
 			flag = false;
			System.out.println ("ok");
			initialcheck = true;
		} 
	}
	else if (n1 < 0 ) {
	System.out.println ("not positive");
	} 
	else {	
	initialcheck = true;
	}
}

i = n1;

while (n1 != -1 && n1 > 0 ) {
 	System.out.println ("and another");
	inputnumber = System.console().readLine();
	n2 = Integer.parseInt(inputnumber);
	if ( n2 >= -1 ) {
		n1 = n2;
		if (n1 != i + 1 && n1 != -1) {
			flag = false;
		}
	}
	else {
	System.out.println ("Not accepted");
	}
i = n1;	
}

System.out.println ("It is " + flag + " that this is a sequence" );
}}

