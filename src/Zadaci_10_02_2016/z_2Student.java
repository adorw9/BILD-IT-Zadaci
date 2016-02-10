package Zadaci_10_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
public class z_2Student extends z_2Person {

	public final String class_status;

	// konstruktor
	public z_2Student(String name, String address, String phone, String email,
			String classStatus) {
		super(name, address, phone, email);
		class_status = classStatus;
	}

}
