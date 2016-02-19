package Zadaci_18_02_2016;

import java.util.ArrayList;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Revise the MyStack class) Rewrite the MyStack class in Listing 11.10 to
 * perform a deep copy of the list field.
 */
public class z_5MyStack implements Cloneable {

	// pravimo listu
	public ArrayList<Object> lista = new ArrayList<>();

	// no arg konstruktor
	public z_5MyStack() {
	}

	// da li je lista prazna
	public boolean isEmpty() {
		return lista.isEmpty();
	}

	// velicina liste
	public int getSize() {
		return lista.size();
	}

	// posljednji èlan liste
	public Object peek() {
		return lista.get(getSize() - 1);
	}

	// brisanje posljednjeg èlana liste
	public Object pop() {
		Object o = lista.get(getSize() - 1);
		lista.remove(getSize() - 1);
		return o;
	}

	// dodavanje novog elementa u listu
	public void push(Object o) {
		lista.add(o);
	}

	// print liste
	public String toString() {
		return lista.toString();
	}

	// klpniranje
	public z_5MyStack clone() {
		z_5MyStack clone = new z_5MyStack();
		for (int i = 0; i < this.getSize(); i++) {
			clone.push(this.lista.get(i));
		}
		return clone;
	}
}