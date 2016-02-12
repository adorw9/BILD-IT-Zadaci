package Projekat_Hangman_BattleShip;

import java.util.Scanner;

public class z_1Hangman {

	public static void main(String[] args) {
	Scanner ulaz = new Scanner (System.in);
		
		String tajnaRijec;
		int ostaloSlova;
		int i;
		int zivoti = 5;
		char pogodi;
		boolean pogodiRijec;
		
		System.out.println("Ukucajte neku rijeè: ");
		tajnaRijec = ulaz.nextLine();
		
		ostaloSlova = tajnaRijec.length();
			for (i = 0; i < tajnaRijec.length(); i++)	{
				System.out.print ("*");
				}
			while(ostaloSlova > 0 && zivoti > 0){
				System.out.println ("\n" + "Pogaðaj:");
				pogodi = ulaz.findWithinHorizon(".", 0).charAt(0);
				
				pogodiRijec = (tajnaRijec.indexOf(pogodi)) != -1;
				
				if (pogodiRijec == false){
					zivoti--;
				System.out.print("Izgubili ste život, imate još " + zivoti + " života");
				
				}else{
				System.out.println("Pogodili ste slovo, nastavite...");
								
				for ( i = 0; i < tajnaRijec.length();i++){
				if (tajnaRijec.charAt(i)== pogodi){
				System.out.print(pogodi);
				ostaloSlova--;
				}else{
					System.out.print("*");
				}
				}
			}
			}
			if (zivoti == 0){
			System.out.println("\nGAME OVER");
			}else{
			
			System.out.println("\nBravo, tražena rijeè je " + tajnaRijec);
			ulaz.close();			
	}
	}

}
