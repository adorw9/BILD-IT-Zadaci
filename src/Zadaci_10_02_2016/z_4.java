package Zadaci_10_02_2016;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Use ArrayList) Write a program that creates an ArrayList and adds a Loan
 * object, a Date object, a string, and a Circle object to the list, and use a
 * loop to display all the elements in the list by invoking the object’s
 * toString() method.
 */
public class z_4 {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		// list.add(new Loan());
		list.add(new Date());
		// list.ad(new Circle());

		for (Object obj : list) {
			System.out.println(obj.toString());
		}
	}
}
