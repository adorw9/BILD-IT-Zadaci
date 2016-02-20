package Zadaci_19_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Enable the Course class cloneable) Rewrite the Course class in Listing 10.6
 * to add a clone method to perform a deep copy on the students field.
 */
public class z_5Course implements Cloneable {

	// osobine
	public String courseName;
	public String[] students = new String[100];
	public int numberOfStudent;

	// no arg konstruktor
	public z_5Course() {

	}

	// konstruktor sa osobinama
	public z_5Course(String courseName) {
		this.courseName = courseName;
	}

	// dodavanje studenta u niz
	public void addStudent(String student) {
		students[numberOfStudent] = student;
		numberOfStudent++;
	}

	// geteri
	public String getCourseName() {
		return courseName;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudent() {
		return numberOfStudent;
	}

	// klon
	public Object clone() {
		z_5Course clone = new z_5Course(this.courseName);
		for (int i = 0; i < this.students.length; i++) {
			clone.students[i] = this.students[i];
		}
		return clone;
	}

}
