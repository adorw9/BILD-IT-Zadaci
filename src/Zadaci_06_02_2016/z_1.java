package Zadaci_06_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * The Time class
 */
public class z_1 {
	// osobine
	private long hour;
	private long minute;
	private long second;

	// konstruktor trenutno vrijeme
	public z_1() {
		// this(System.currentTimeMillis());
		second = (int) (System.currentTimeMillis() / 1000) % 60;
		minute = (int) (System.currentTimeMillis() / 1000 / 60) % 60;
		hour = (int) (System.currentTimeMillis() / 1000 / 60 / 60) % 24;

	}

	// konstruktor elapse time
	public z_1(long elapseTime) {
		long totalSeconds = elapseTime / 1000L;
		this.second = (int) (totalSeconds % 60L);
		long totalMinutes = totalSeconds / 60L;
		this.minute = (int) (totalMinutes % 60L);
		long totalHours = (int) (totalMinutes / 60L);
		this.hour = (int) (totalHours % 24L);

	}

	public z_1(long hour, long minute, long second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	// geteri
	public long getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second;
	}

	// postavi vrijeme
	public void setTime(long elapseTime) {
		second = (int) (elapseTime / 1000) % 60;
		minute = (int) (elapseTime / (1000 * 60)) % 60;
		hour = (int) (elapseTime / (1000 * 60 * 60)) % 24;
	}

	// ispis vremena
	public String toString() {
		return this.hour + ":" + this.minute + ":" + this.second;
	}

}
