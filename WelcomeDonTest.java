package starter_Programs;

import containPrintMeClass.PrintMe;
import containUserScanner.MyScanner;

public class WelcomeDonTest 
{
	public static void main(String[] args) 
	{
		int countMax=0;	
		//call myScanner
		MyScanner donsScanner = new MyScanner();
		countMax = donsScanner.getLoop();
		
		for ( int count=0; count < countMax; count++)
		{
			PrintMe printMe = new PrintMe();
			printMe.printMe(count);
		}
		System.out.printf("BY\n\n");
	}
}
