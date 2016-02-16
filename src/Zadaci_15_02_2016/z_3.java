package Zadaci_15_02_2016;

import java.util.Scanner;
import java.io.*;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * (Remove text) Write a program that removes all the occurrences of a specified
 * string from a text file. For example, invoking java Exercise12_11 John
 * filename removes the string John from the specified file. Your program should
 * get the arguments from the command line
 */
public class z_3 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner ulaz = new Scanner(System.in);
		// pravimo file
		File file = new File("file.txt");
		PrintWriter write = new PrintWriter(file);

		try {
			// upis u file
			System.out.println("Upi�ite podatke u fajl:");
			String str = ulaz.nextLine();
			write.println(str);
		} catch (Exception ex) {
			System.out.println("GRE�KA!!!");
		}
		write.close();
		// �ta �elimo brisati iz file
		System.out.println("Ukucajte rije� koju �elite ukloniti iz fajla:");
		String rijec = ulaz.nextLine();
		String st = "";

		// �itamo podatke iz file
		Scanner read = new Scanner(file);
		while (read.hasNext()) {
			st = read.nextLine();
		}
		st = st.replace(rijec, "");
		System.out.println(st);

		read.close();

		PrintWriter writer = new PrintWriter(file);

		writer.print(st);

		writer.close();
		ulaz.close();
	}

}
