package Zadaci_19_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
public class z_5Test {

	public static void main(String[] args) {
		// pravimo objekte
		z_5Course course = new z_5Course("Struktura podataka");
		course.addStudent("Ime1 i Prezime1");
		course.addStudent("Ime2 i prezime2");

		// pravimo klon objekte
		z_5Course klon = new z_5Course();
		klon = (z_5Course) course.clone();

		// ispis studenata iz objekta course
		String[] students1 = course.getStudents();
		System.out.println("Course: ");
		for (int i = 0; i < students1.length; i++) {
			if (students1[i] != null)
				System.out.println(students1[i]);
		}

		// ispis studenata iz objekta klon
		String[] students2 = klon.getStudents();
		System.out.println("\nCourse clone:");
		for (int i = 0; i < students2.length; i++) {
			if (students2[i] != null)
				System.out.println(students2[i]);
		}

	}

}
