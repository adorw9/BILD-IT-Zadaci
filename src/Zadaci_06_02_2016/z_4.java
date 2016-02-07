package Zadaci_06_02_2016;

import java.util.ArrayList;

/**
 * @author Adnan Brièiæ
 *
 */
public class z_4 {
	// pravimo listu
	public ArrayList<Integer> lista = new ArrayList<>();

	// geter
	public ArrayList<Integer> getLista() {
		return lista;
	}

	public void integer(int a) {
		lista.add(a);
	}

	// metoda za obrnuto
	public ArrayList<Integer> obrnuto() {
		ArrayList<Integer> o = new ArrayList<>();
		for (int i = getLista().size() - 1; i >= 0; i--) {
			o.add(lista.get(i));
		}
		return o;
	}
}
