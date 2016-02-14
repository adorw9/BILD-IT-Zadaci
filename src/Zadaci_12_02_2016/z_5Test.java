package Zadaci_12_02_2016;
/**
 * @author Adnan Brièiæ
 *
 */
public class z_5Test {

	public static void main(String[] args) throws IllegalArgumentException {
		// kreiramo objekat
					z_5 obj = new z_5(4.5, 3,1000);
		try {
			
			 obj = new z_5(4.5, 3,-1000);
		System.out.println(obj.mjesec());
	
		} catch (IllegalArgumentException ex) {
			System.out.println("Veæe od NULA!");
		} 
		
	}
	}


