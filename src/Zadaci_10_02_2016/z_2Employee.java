package Zadaci_10_02_2016;

import java.util.Date;

/**
 * @author Adnan Brièiæ
 *
 */
public class z_2Employee extends z_2Person {

	public String office;
	public double salary;
	public Date date_hired;

	// no arg konstruktor
	public z_2Employee() {

	}

	// konstruktor sa osobinama
	public z_2Employee(String name, String address, String phone, String email) {
		super(name, address, phone, email);
	}

}
