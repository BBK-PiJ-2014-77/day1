import java.util.Scanner;
public class ex11
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// accept input for each of 5 cards in a loop
// first question what value
// take the value J is 11 Q is 12 K is 13
// second question what suit
// spades is 100 hearts are 200 diamonds are 300 clubs are 400
// put the values with the suits
// rank the cards
// if all cards are between 100-113 200-213 300-313 or 400-414 then all same suit flag suit positive
// put ranked cards into loop find modulo 100 to revert to old number and check whether consecutive flag consecutive positve
// count up number the same with a loop with 3 possibilities if 4 or 3 same 4/3 of a kind positive if 2 same 2 positive if 2 pairs double positive

// if suit positive and consecutive positive print straight flush
//  if 4 of a kind positive print poker
// if 3 of a kind and 2 of a kind positive print full house
// if flush positive and rest negative print flush
// if straight positive and none of the others print straight
// if three of a kind and no other print three of  kind
// if 2 pairs and no others print 2 pairs
// if 1 pair pring 1 pair
// else pritn you have nothing
int cardcount = 1, cv, c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, sv = 0, s1 = 0, s2 = 0, s3 = 0, s4 = 0, s5 = 0; 
int tv1 = 0, tv2 = 0, tv3 = 0, tv4 = 0, tv5 = 0;
String cardnumber = "", suitevalue = "";
while ( cardcount <= 5 ) {
System.out.println ("please give value of card number " + cardcount);
cardnumber =  System.console().readLine(); 
System.out.println ("please give suite of card number " + cardcount + " (s, h, d, c)");
suitevalue = System.console().readLine();

	if ( cardnumber.equals ( "j" )) {
		cardnumber = "11";
		}
	else if (cardnumber.equals( "q" )) {
		cardnumber = "12";
		}
	else if (cardnumber.equals( "k" )) {
		cardnumber = "13";
		}
	else if (cardnumber.equals( "a" )) {
		cardnumber = "14";
		}
	else {
		cardnumber = cardnumber;
		}
		
	if ( suitevalue.equals ( "s" )) {
		suitevalue = "100";
		}
	else if (suitevalue.equals( "h" )) {
		suitevalue = "200";
		}
	else if (suitevalue.equals( "d" )) {
		suitevalue = "300";
		}
	else if (suitevalue.equals( "c" )) {
		suitevalue = "400";
		}
 
cv = Integer.parseInt(cardnumber);
sv = Integer.parseInt(suitevalue);

	switch (cardcount) {
		case 1:
			c1 = cv;
			s1 = sv;
			tv1 = cv + sv;
			break;
		case 2:
			c2 = cv;
			s2 = sv;
			tv2 = cv + sv;
			break;
		case 3:
			c3 = cv;
			s3 = sv;
			tv3 = cv + sv;
			break;
		case 4: 
			c4 = cv;
			s4 = sv;
			tv4 = cv + sv;
			break;
		case 5: 
			c5 = cv;
			s5 = sv;
			tv5 = cv + sv;
			break;
		}
cardcount++;
}
 
System.out.println ( c1 + " " + c2 + " " + c3 + " " + c4 + " " + c5 );
System.out.println ( s1 + " " + s2 + " " + s3 + " " + s4 + " " + s5 );

//time to sort the cards


int stv1 = 0, stv2 = 0, stv3 = 0, stv4 = 0, stv5 = 0, i = 0;
boolean stv1flag = false,stv2flag = false, stv3flag = false, stv4flag = false, stv5flag = false;

while ( i <= 514 && stv1flag == false ) {
if ( i == tv1 ) { stv1 = tv1; stv1flag = true; }
if ( i == tv2 ) { stv1 = tv2; stv1flag = true; }
if ( i == tv3 ) { stv1 = tv3; stv1flag = true; }
if ( i == tv4 ) { stv1 = tv4; stv1flag = true; }
if ( i == tv5 ) { stv1 = tv5; stv1flag = true; }
i++;
}

while ( i <= 514 && stv2flag == false ) {
if ( i == tv1 ) { stv2 = tv1; stv2flag = true; }
if ( i == tv2 ) { stv2 = tv2; stv2flag = true; }
if ( i == tv3 ) { stv2 = tv3; stv2flag = true; }
if ( i == tv4 ) { stv2 = tv4; stv2flag = true; }
if ( i == tv5 ) { stv2 = tv5; stv2flag = true; }
i++;
}

while ( i <= 514 && stv3flag == false ) {
if ( i == tv1 ) { stv3 = tv1; stv3flag = true; }
if ( i == tv2 ) { stv3 = tv2; stv3flag = true; }
if ( i == tv3 ) { stv3 = tv3; stv3flag = true; }
if ( i == tv4 ) { stv3 = tv4; stv3flag = true; }
if ( i == tv5 ) { stv3 = tv5; stv3flag = true; }
i++;
}

while ( i <= 514 && stv4flag == false ) {
if ( i == tv1 ) { stv4 = tv1; stv4flag = true; }
if ( i == tv2 ) { stv4 = tv2; stv4flag = true; }
if ( i == tv3 ) { stv4 = tv3; stv4flag = true; }
if ( i == tv4 ) { stv4 = tv4; stv4flag = true; }
if ( i == tv5 ) { stv4 = tv5; stv4flag = true; }
i++;
}

while ( i <= 514 && stv5flag == false ) {
if ( i == tv1 ) { stv5 = tv1; stv5flag = true; }
if ( i == tv2 ) { stv5 = tv2; stv5flag = true; }
if ( i == tv3 ) { stv5 = tv3; stv5flag = true; }
if ( i == tv4 ) { stv5 = tv4; stv5flag = true; }
if ( i == tv5 ) { stv5 = tv5; stv5flag = true; }
i++;
}


System.out.println ( stv1 + " " + stv2 + " " + stv3 + " " + stv4 + " " + stv5 );

//now for scoring flush
int c = 115, d = 100;
boolean samesuite = false, consecutivesuite = false, consecutive = false;
while (c <= 515) { 
if ( (stv1 < c && stv1 > d ) && (stv2 < c && stv2 > d) && (stv3 < c && stv3 > d) && (stv4 < c && stv4 > d) && (stv5 < c && stv5 > d )) {
	samesuite = true;
}  
c = c + 100;
d = d + 100;
}

if ( (stv5%100) == (stv4%100) + 1 && (stv4%100) == (stv3%100) + 1 && (stv3%100) == (stv2%100) + 1 && (stv2%100) == (stv1%100) + 1 ) {
	consecutive = true;
}

if ( samesuite == true && consecutive == true ) {
	consecutivesuite = true;
}

boolean twokind = false, threekind = false, fourkind = false;

if (stv1%100 == stv2%100) {
	twokind = true;
	if (stv1%100 == stv3%100) {
		threekind = true;
		if (stv1%100 == stv4%100) {
		fourkind = true;
		}
	}
}
if (stv2%100 == stv3%100) {
	twokind = true;
	if (stv2%100 == stv4%100) {
		threekind = true;
		if (stv2%100 == stv5%100) {
		fourkind = true;
		}
	}
}	 
if (stv3%100 == stv4%100) {
	twokind = true;
	if (stv3%100 == stv5%100) {
		threekind = true;
	}
}	
if (stv4%100 == stv5%100) {
	twokind = true;
}	

//answer

if (consecutivesuite == true) {
System.out.println ( "You have a straight flush");
}
if (fourkind == true) {
System.out.println ( "You have a poker");
}
if (samesuite == true  && consecutivesuite != true ) {
System.out.println ( "You have a flush");
}
if (consecutive == true && consecutivesuite != true) {
System.out.println ( "You have a straight");
}
if (twokind == true && threekind != true) {
System.out.println ( "You have two of a kind");
}
if (threekind == true && fourkind == false) {
System.out.println ( "You have three of a kind");
}


	 


}}

