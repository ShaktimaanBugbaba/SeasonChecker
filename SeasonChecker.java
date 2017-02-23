/*
  Coded By Shaktimaan BugBaba
  on 23 Feb 2017
  
*/

import java.util.Scanner; // Imports the Scanner

class seasonchecker{ // Class is decleared 

	/* main is decleared executions starts from here
	   Here Public is access specifier. Static is used so that it can called with out any objects 
	   void indicates that it returns nothing 
	   String is the data type and args is a variable that can be used to send command line arguments
	   */
	public static void main(String args[]){ 
	
		
		int month; //An integer variable is decleared named as month 
		
		Scanner myvar = new Scanner(System.in); //scanner object is created named as Myvar 
		
		System.out.println("Sirji Ye kaunsa mahina hai wo bata do :"); //Prints somes strings
		System.out.println(" January   >> 1");
		System.out.println(" February  >> 2");
		System.out.println(" March     >> 3");
		System.out.println(" April     >> 4");
		System.out.println(" May       >> 5");
		System.out.println(" June      >> 6");
		System.out.println(" July      >> 7");
		System.out.println(" August    >> 8");
		System.out.println(" September >> 9");
		System.out.println(" October   >> 10");
		System.out.println(" November  >> 11");
		System.out.println(" December  >> 12");
		
		System.out.print(">>>>>>>>>>>>> ");
		month = myvar.nextInt();  //Takes Input from user
		
		switch (month){  //switch is applied on month variable
		
		case 1:
		case 2:
		case 11:
		case 12:
			System.out.println("Thand hai bahar :v soja ");
			break; //used to break out of the switch case

		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Garmi hai bahar soja :v ");
			break;
			
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("Barish Ho rahi hai Bheeg jaye ga :V Soja");
			break;
		
		default:
			System.out.println("Jyada Hoshyari na kar :v Soja");
		} //The default code block gets Executed when others cases fails
		
	}
}