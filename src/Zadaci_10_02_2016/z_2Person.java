package Zadaci_10_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
public class z_2Person {
	// osobine
	public String name;
	public String address;
	public String phone;
	public String email;

	// no arg konstruktor
	z_2Person() {

	}

	// konstruktor sa osobinama
	public z_2Person(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	@Override
	public String toString() {
		return this.getClass() + "\n" + name;
	}
}
