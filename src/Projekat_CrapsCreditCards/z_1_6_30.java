package Projekat_CrapsCreditCards;
/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Game: craps) Craps is a popular dice game played in casinos. Write a program
 * to play a variation of the game, as follows: Roll two dice. Each die has six
 * faces representing values 1, 2, …, and 6, respectively. Check the sum of the
 * two dice. If the sum is 2, 3, or 12 (called craps), you lose; if the sum is 7
 * or 11 (called natural), you win; if the sum is another value (i.e., 4, 5, 6,
 * 8, 9, or 10), a point is established. Continue to roll the dice until either
 * a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise,
 * you win.
 */
public class z_1_6_30 {
	public static void main(String[] args) {
		boolean craps = true;
		// bacanje kockica
		int kocka1 = (int) ((Math.random() * 6) + 1);
		int kocka2 = (int) ((Math.random() * 6) + 1);

		int suma = kocka1 + kocka2;
		System.out.println("You rolled " + kocka1 + " + " + kocka2 + " = "
				+ suma);
		// ako je suma 2,3,12 gubimo
		if (suma == 2 || suma == 3 || suma == 12) {
			craps = false;
			System.out.println("You LOSE!");
			// ako je suma 7,11 pobjedujemo
		} else if (suma == 7 || suma == 11) {
			craps = false;
			System.out.println("You WIN!");
		} else

			System.out.println("POINT " + suma);
		int pom = suma;
		// petljom nastavljamo igru u skladu sa pravilima
		while (craps) {
			int novaKocka1;
			int novaKocka2;
			novaKocka1 = (int) ((Math.random() * 6) + 1);
			novaKocka2 = (int) ((Math.random() * 6) + 1);
			int novaSuma = novaKocka1 + novaKocka2;
			System.out.println("You rolled " + novaKocka1 + " + " + novaKocka2
					+ " = " + novaSuma);
			if (novaSuma == pom) {
				craps = false;
				System.out.println("You WIN!");
			} else if (novaSuma == 7) {
				craps = false;
				System.out.println("You LOSE!");
			} else {
				pom = novaSuma;
				System.out.println("POINT " + pom);
			}
		}
		
	}
}
/*
 * JFrame prozor = new JFrame ("CRAPS"); Container sadrzajProzora =
 * prozor.getContentPane(); sadrzajProzora.setLayout(null);
 * 
 * //prvo dugme za operaciju roll JButton dugme1 = new JButton ("ROLL"); final
 * JTextField rezultat = new JTextField(20); final JTextField point = new
 * JTextField(20); final JTextField winLose = new JTextField(20);
 * 
 * //setbounds dugme1 dugme1.setBounds(200,400,100,50);
 * rezultat.setBounds(100,100,100,20); point.setBounds(200,100,100,20);
 * winLose.setBounds(300,100,100,20);
 * 
 * //sadrzajprozora sadrzajProzora.add(dugme1); sadrzajProzora.add(rezultat);
 * sadrzajProzora.add(point); sadrzajProzora.add(winLose);
 * 
 * //velièina prozora prozor.setSize(700, 700); prozor.setVisible(true);
 * 
 * ActionListener osluskivac = new ActionListener(){ public void
 * actionPerformed(ActionEvent e){
 * 
 * 
 * 
 * } }
 */

