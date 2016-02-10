package Zadaci_10_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
public class z_2Test {

	public static void main(String[] args) {

		z_2Person person = new z_2Person("Ime1 Prezime1", "Adresa 1",
				"295-993-1212", "ime1@gmail.com");
		z_2Person student = new z_2Student("Ime2 Prezime2", "Adresa 2",
				"650-5665-1432", "ime2@hotmail.com", "junior");
		z_2Person employee = new z_2Employee("Ime3 Prezime3", "Adresa 3",
				"448-818-9499", "ime3@hotmail.com");
		z_2Person faculty = new z_2Faculty("Ime4 Prezime4", "Adresa 4",
				"908-982-3333", "ime3@yahoo.com");
		z_2Person staff = new z_2Staff("Ime5 Prezime5", "Adresa 5",
				"754-212-3412", "ime5@gmail.com");
		//ispis
		System.out.println(person.toString() + "\n");
		System.out.println(student.toString() + "\n");
		System.out.println(employee.toString() + "\n");
		System.out.println(faculty.toString() + "\n");
		System.out.println(staff.toString() + "\n");
	}

}
