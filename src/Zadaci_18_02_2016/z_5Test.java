package Zadaci_18_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
public class z_5Test {

	public static void main(String[] args) {
		// pravimo objekat
		z_5MyStack stack1 = new z_5MyStack();
		stack1.push(3);
		stack1.push(8);

		// objekat koji kloniramo
		z_5MyStack stack2 = new z_5MyStack();
		stack2 = stack1.clone();

		// ispis rezultata
		System.out.println("Stack: " + stack1);
		System.out.println("Clone Stack: " + stack2);

	}

}
